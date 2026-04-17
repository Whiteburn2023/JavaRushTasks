package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    int num1;
    int num2;
    int num3;

    public Solution(int num1) {
        this.num1 = num1;
    }
    Solution(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    private Solution() {
    }
    protected Solution(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public static void main(String[] args) {



    }
}

