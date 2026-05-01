package com.javarush.task.task16.task1630;

import java.io.*;

/* 
Последовательный вывод файлов
*/

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }


    public static class ReadFileThread extends Thread implements ReadFileInterface{
        private String fileName;
        private StringBuilder sb = new StringBuilder();
        @Override
        public void setFileName(String fullFileName) {
            fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return sb.toString();
        }

        @Override
        public void run() {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
                while ((bufferedReader.ready())){
                    sb.append(bufferedReader.readLine()).append(" ");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
