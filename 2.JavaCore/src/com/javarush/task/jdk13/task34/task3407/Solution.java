package com.javarush.task.jdk13.task34.task3407;

import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;

/* 
Собиратель типов
*/

public class Solution {

    private Map<TimeUnit, BiFunction<Integer, Long, Map<Boolean, List<String>>>> field;

    public static void main(String[] args) throws Exception {
        getTypes(Solution.class.getDeclaredField("field").getGenericType()).forEach(System.out::println);
    }

    public static Set<Type> getTypes(Type type) {
        Set<Type> result = new HashSet<>();
        collectTypes(type, result);
        return result;
    }

    private static void collectTypes(Type type, Set<Type> result){
        if (type == null || result.contains(type)){
            return;
        }

        result.add(type);

        if (type instanceof Class){
            Class<?> clazz = (Class<?>) type;
            TypeVariable<?>[] typeParams = clazz.getTypeParameters();
            for (TypeVariable<?> tv : typeParams){
                for (Type bound : tv.getBounds()){
                    collectTypes(bound, result);
                }
            }
        } else if (type instanceof ParameterizedType) {
            ParameterizedType pt = (ParameterizedType) type;
            collectTypes(pt.getRawType(),result);
            for (Type arg : pt.getActualTypeArguments()){
                collectTypes(arg,result);
            }
        }
    }
}