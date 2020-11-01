package com.zs.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo2 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        printList(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("World");
        printList(list2);
    }

    /*
     */

    /**
     * <T> 表示声明一个泛型类型T，具体类型在使用的时候确定；
     * 其实可用任意字母如F来代替T，但通常必须要大写。
     * <T>通常需放在方法的返回值声明之前。
     * T不是一个类，但因有 <T> 定义好了一个泛型类型 T，则泛型类型T作为数据类型使用
     *
     * @param list
     * @param <T>
     */
    private static <T> void printList(List<T> list) {
        //编译时报错，此时集合的add方法是lists.add(T t),要求类型为T，但是T是一个泛型类型，真正的类型在使用的时候确定；
        //那么此时就不能确定T的类型，所以不能使用集合的add方法，除非是lists.add(null);
        //list.add(2);

        //因为集合中的元素类型为T，建议get方法用T去接
        T t  = list.get(0);

        for (T o : list) {
            System.out.println(o);
        }
    }
}
