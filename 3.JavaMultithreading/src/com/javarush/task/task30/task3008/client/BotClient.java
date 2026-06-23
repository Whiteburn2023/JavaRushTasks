package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Objects;

public class BotClient extends Client {

    public static void main(String[] args) {
        new BotClient().run();
    }

    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    @Override
    protected String getUserName() {
        return "date_bot_" + (int) (Math.random() * 100);
    }

    public class BotSocketThread extends SocketThread {

        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            sendTextMessage("Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
            if (message.contains(":")) {
                String[] split = message.split(":");
                String name = split[0];
                String text = split[1].trim();
                String format = null;
                if ("дата".equals(text)) {
                    format = "d.MM.YYYY";
                } else if ("день".equals(text)) {
                    format = "d";
                } else if ("месяц".equals(text)) {
                    format = "MMMM";
                } else if ("год".equals(text)) {
                    format = "YYYY";
                } else if ("время".equals(text)) {
                    format = "H:mm:ss";
                } else if ("час".equals(text)) {
                    format = "H";
                } else if ("минуты".equals(text)) {
                    format = "m";
                } else if ("секунды".equals(text)) {
                    format = "s";
                }

                if(Objects.nonNull(format)){
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
                    String data = simpleDateFormat.format(new GregorianCalendar().getTime());
                    sendTextMessage(String.format("Информация для %s: %s", name, data));
                }
            }

        }
    }
}
