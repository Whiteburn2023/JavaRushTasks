package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String string = reader.readLine();
            if (string.equalsIgnoreCase("user")){
                Person.User user = new Person.User();
                doWork(user);
            } else if (string.equalsIgnoreCase("loser")) {
                Person.Loser loser = new Person.Loser();
                doWork(loser);
            } else if (string.equalsIgnoreCase("coder")) {
                Person.Coder coder = new Person.Coder();
                doWork(coder);
            } else if (string.equalsIgnoreCase("proger")) {
                Person.Proger proger = new Person.Proger();
                doWork(proger);
            } else {
                return;
            }
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User){
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof  Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        }
    }
}
