package com.javarush.task.jdk13.task34.task3408;

import java.lang.reflect.InvocationTargetException;

public class Generator<T> {

    private Class<T> type;

    public Generator(Class<T> aClass) {
        this.type = aClass;
    }

    T newInstance() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {


        return type.getDeclaredConstructor().newInstance();

    }
}
