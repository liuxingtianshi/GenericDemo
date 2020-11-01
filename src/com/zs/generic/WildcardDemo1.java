package com.zs.generic;

import java.util.ArrayList;
import java.util.List;

public class WildcardDemo1 {
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

    /**
     * 通配符可以不在方法返回值前加类型声明，但是获取元素的时候用Object而不可以用T
     * @param list
     * @param <?> 通配符
     */
    private static void printList(List<?> list) {
        // 用Object获取元素
        Object t = list.get(0);
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
