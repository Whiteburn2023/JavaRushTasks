package com.javarush.task.jdk13.task38.task3803;

/* 
Обработка аннотаций
*/

import java.lang.annotation.Annotation;

public class Solution {
    public static void main(String[] args) {
        printFullyQualifiedNames(Solution.class);
        printFullyQualifiedNames(SomeTest.class);

        printValues(Solution.class);
        printValues(SomeTest.class);
    }

    public static <T> boolean printFullyQualifiedNames(Class<T> c) {
        Annotation[] annotations = c.getAnnotations();
        if (annotations.length == 0) {
            return false;
        } else {
            for (Annotation annotation : annotations) {
                System.out.println(annotation.annotationType().getSimpleName());
            }
            return true;
        }
    }

    public static <T> boolean printValues(Class<T> c) {
        Annotation[] annotations = c.getAnnotations();
        if (annotations.length == 0) {
            return false;
        } else {
            for (Annotation annotation : annotations) {
                System.out.println(annotation.annotationType().getSimpleName());
            }
            return true;
        }
    }
}
