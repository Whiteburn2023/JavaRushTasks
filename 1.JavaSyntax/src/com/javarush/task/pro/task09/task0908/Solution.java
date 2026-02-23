package com.javarush.task.pro.task09.task0908;

/*
Двоично-шестнадцатеричный конвертер
*/

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        char[] HEX = "0123456789abcdef".toCharArray();
        if (binaryNumber == null || binaryNumber.isEmpty()){
            return "";
        }
        char[] arr = binaryNumber.toCharArray();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != '0' && arr[i] != '1'){
                return "";
            }
        }
        int multiplicityFour = binaryNumber.length() % 4;
        if (multiplicityFour != 0){
            for (int i = 0; i < (4 - multiplicityFour); i++) {
                binaryNumber = "0" + binaryNumber;
            }
        }
        String hexNumber = "";
        String temp = "";
        for (int i = 0; i < binaryNumber.length(); i+=4) {
            temp = binaryNumber.substring(i, i + 4);
            int value = 0;
            for (int j = 0; j < temp.length(); j++) {
                char bit = temp.charAt(j);
                if (bit == '1'){
                    value = (int) (value + Math.pow(2, 3 - j));
                }
            }
            hexNumber = hexNumber + HEX[value];
        }
        return hexNumber;
    }

    public static String toBinary(String hexNumber) {
        if (hexNumber == null || hexNumber.isEmpty()){
            return "";
        }
        String[] binaryTable = {
                "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        };

        for (int i = 0; i < hexNumber.length(); i++) {
            char ch = hexNumber.charAt(i);
            if (!((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'f'))){
                return "";
            }
        }
        String binaryNumber = "";
        for (int i = 0; i < hexNumber.length(); i++) {
            char ch = hexNumber.charAt(i);
            int index;
            if (ch >= '0' && ch <='9'){
                index = ch - '0';
            } else {
                index = 10 + (ch - 'a');
            }
            binaryNumber = binaryNumber + binaryTable[index];
        }
        return binaryNumber;
    }
}
