package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

import static com.javarush.task.task30.task3008.MessageType.*;

public class Server {

    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void main(String[] args) throws IOException {
        ConsoleHelper.writeMessage("введите порт сервера: ");
        int port = ConsoleHelper.readInt();
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            ConsoleHelper.writeMessage("сервер запущен");
            while (true) {
                Socket socket = serverSocket.accept();
                Handler handler = new Handler(socket);
                handler.start();
            }
        } catch (Exception e) {
            ConsoleHelper.writeMessage("произошел сбой в работе сервера");
        }
    }

    public static void sendBroadcastMessage(Message message) {
        for (Connection connection : connectionMap.values()) {
            try {
                connection.send(message);
            } catch (IOException e) {
                ConsoleHelper.writeMessage("не смогли отправить сообщение");
            }
        }
    }


    private static class Handler extends Thread {
        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            while (true) {
                connection.send(new Message(NAME_REQUEST, "пожалуйста введите имя: "));
                Message message = connection.receive();
                String name = message.getData();

                if (message.getType().equals(USER_NAME)
                        && Objects.nonNull(name)
                        && !name.isEmpty()
                        && !connectionMap.containsKey(name)) {
                    connectionMap.put(name, connection);
                    connection.send(new Message(NAME_ACCEPTED, "добро пожаловать"));
                    return name;
                } else {
                    ConsoleHelper.writeMessage("ошибка ввода имени");
                }
            }
        }

        private void notifyUsers(Connection connection, String userName) throws IOException {
            for (String name : connectionMap.keySet()) {
                if (!name.equals(userName)){
                    connection.send(new Message(USER_ADDED, name));
                }
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException{
            while (true){
                Message message = connection.receive();
                if (message.getType() == (TEXT)){
                    sendBroadcastMessage(new Message(TEXT, userName + ": " + message.getData()) );
                } else {
                    ConsoleHelper.writeMessage("принятое сообщение не является текстом");
                }
            }
        }

        @Override
        public void run() {
            ConsoleHelper.writeMessage("соединение установлено " + socket.getRemoteSocketAddress());
            String userName = null;
            try (Connection connection = new Connection(socket)){
                userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(USER_ADDED, userName));
                notifyUsers(connection,userName);
                serverMainLoop(connection, userName);

            } catch (IOException | ClassNotFoundException e){
                ConsoleHelper.writeMessage("ошибка при обмене данными с удаленным адресом " +
                        socket.getRemoteSocketAddress());
            }
            if (Objects.nonNull(userName)){
                connectionMap.remove(userName);
                sendBroadcastMessage(new Message(USER_REMOVED, userName));
            }
            ConsoleHelper.writeMessage("соединение с удаленным адресом закрыто " +
                    socket.getRemoteSocketAddress());
        }
    }
}
