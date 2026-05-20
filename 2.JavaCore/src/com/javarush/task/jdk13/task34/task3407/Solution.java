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

        if (type == null){
            return result;
        }

        if (type instanceof Class){
            result.add(type);
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            result.add(parameterizedType.getRawType());
            for (Type actualArg : parameterizedType.getActualTypeArguments()){
                result.addAll(getTypes(actualArg));
            }
        } else if (type instanceof GenericArrayType) {
            GenericArrayType arrayType = (GenericArrayType) type;
            result.addAll(getTypes(arrayType.getGenericComponentType()));
        } else if (type instanceof TypeVariable) {
            TypeVariable<?> varType = (TypeVariable<?>) type;
            result.add(type);
            for (Type bound : varType.getBounds()) {
                result.addAll(getTypes(bound));
            }
        } else if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            for (Type lower : wildcardType.getLowerBounds()){
                result.addAll(getTypes(lower));
            }
            for (Type upper : wildcardType.getUpperBounds()){
                result.addAll(getTypes(upper));
            }

        }

        return result;
    }
}
/**
 *      Логика работы
 * Принимаете Type — это может быть:
 * Class (простой класс, например TimeUnit)
 * ParameterizedType (параметризованный тип, например Map<K, V>)
 * GenericArrayType (массив)
 * TypeVariable (переменная типа)
 * WildcardType (? extends ...)
 * Анализируете, что за тип пришел:
 * Если это Class → добавляете его в множество
 * Если это ParameterizedType → нужно взять сам тип (сырой) + рекурсивно пройтись по его параметрам
 * Рекурсивно обходите все вложенные типы, чтобы не пропустить ни один.
 *
 *      Пример рекурсивного обхода
 * Для Map<TimeUnit, BiFunction<Integer, Long, Map<Boolean, List<String>>>>:
 * Смотрим на Map → добавляем Map
 * Смотрим на первый параметр TimeUnit → добавляем TimeUnit
 * Смотрим на второй параметр BiFunction → добавляем BiFunction
 * У BiFunction смотрим параметры:
 * Integer → добавляем Integer
 * Long → добавляем Long
 * третий параметр Map<Boolean, List<String>> → добавляем Map
 * У внутреннего Map параметр Boolean → добавляем Boolean
 * Второй параметр List<String> → добавляем List
 * У List параметр String → добавляем String
 *
 *      Визуализация дерева рекурсии
 * Map<TimeUnit, BiFunction<Integer, Long, Map<Boolean, List<String>>>>
 * │
 * ├── TimeUnit (Class) → добавить
 * │
 * └── BiFunction<Integer, Long, Map<Boolean, List<String>>>
 *     │
 *     ├── Integer (Class) → добавить
 *     │
 *     ├── Long (Class) → добавить
 *     │
 *     └── Map<Boolean, List<String>>
 *         │
 *         ├── Boolean (Class) → добавить
 *         │
 *         └── List<String>
 *             │
 *             └── String (Class) → добавить
 */