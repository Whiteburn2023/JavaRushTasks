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
        Set<Type> result = new LinkedHashSet<>();
        if (type instanceof ParameterizedType paramType){
            Type rawType = paramType.getRawType();
            result.add(rawType);
            Type[] actualTypeArguments = paramType.getActualTypeArguments();
            for (Type actualTypeArgument : actualTypeArguments) {
                Set<Type> types = getTypes(actualTypeArgument);
                result.addAll(types);
            }

//            Arrays.stream(paramType.getActualTypeArguments())
//                    .map(type1 -> Solution.getTypes(type1))
//                    .forEach(set -> result.addAll(set));

        } else {
            result.add(type);
        }
        return result;
    }

}