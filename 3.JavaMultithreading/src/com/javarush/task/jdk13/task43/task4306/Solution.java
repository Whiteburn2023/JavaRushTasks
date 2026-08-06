package com.javarush.task.jdk13.task43.task4306;

/* 
В поиске ботана
*/

//import org.apache.commons.lang3.ObjectUtils;

import org.apache.commons.lang3.ObjectUtils;

public class Solution {

    public static void main(String[] args) {
        Student studentOne = new Student("Joe",10, 8, 7, 7, 5, 6, 9);
        Student studentTwo = new Student("Jane",8, 9, 5, 6, 7, 7, 8);

        String result = compareStudentGrades(studentOne, studentTwo);
        System.out.println(result);
    }

    public static String compareStudentGrades(Student studentOne, Student studentTwo) {
        //напишите тут ваш код
        if (studentOne == null || studentTwo == null){
            return "Make sure there are no null objects";
        }
        int compareMathScore = ObjectUtils.compare(studentOne.getMathScore(), studentTwo.getMathScore());
        int comparePhysicsScore = ObjectUtils.compare(studentOne.getPhysicsScore(), studentTwo.getPhysicsScore());
        int compareChemistryScore = ObjectUtils.compare(studentOne.getChemistryScore(), studentTwo.getChemistryScore());
        int compareBiologyScore = ObjectUtils.compare(studentOne.getBiologyScore(), studentTwo.getBiologyScore());
        int compareGeographyScore = ObjectUtils.compare(studentOne.getGeographyScore(), studentTwo.getGeographyScore());
        int compareHistoryScore = ObjectUtils.compare(studentOne.getHistoryScore(), studentTwo.getHistoryScore());
        int compareEnglishScore = ObjectUtils.compare(studentOne.getEnglishScore(), studentTwo.getEnglishScore());
        int result = compareMathScore + comparePhysicsScore + compareChemistryScore + compareBiologyScore +
                compareGeographyScore + compareHistoryScore + compareEnglishScore;

        if (result == 0){
            return "Student grades scores are equal";
        }
        if (result > 0){
            return String.format("%s has a higher grades score", studentOne.getName());
        }
        return String.format("%s has a higher grades score", studentTwo.getName());
    }
}


