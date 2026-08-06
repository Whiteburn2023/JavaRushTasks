package com.javarush.task.task20.task2014;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/

public class Solution implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Solution savedObject = new Solution(4);
        System.out.println(savedObject);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\OTUS\\JavaRushTasks\\3.txt"))) {
            objectOutputStream.writeObject(savedObject);
        }

        Solution loadedObject;

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\OTUS\\JavaRushTasks\\3.txt"))){
            loadedObject = (Solution) objectInputStream.readObject();
        }

        System.out.println(savedObject.string.equals(loadedObject.string));
    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
