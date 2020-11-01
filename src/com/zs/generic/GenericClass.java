package com.zs.generic;

import java.util.*;

/**
 *
 */
public class GenericClass<T> {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        // 在定义实例的时候确定了要传入的类型
        new GenericClass<String>().printList(list);

        Integer[] integers = new Integer[]{1, 2, 3, 4};
        GenericClass.changeValue(integers, 1, 3);
        System.out.println(Arrays.toString(integers));

        Map<Integer, String> maps = new HashMap<>();
        maps.put(1, "张三");
        maps.put(2, "李四");
        maps.put(3, "王麻子");
        GenericClass.printMap(maps);

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("a", "level1");
        stringMap.put("b", "level2");
        stringMap.put("c", "level3");
        GenericClass.printMap(stringMap);
    }

    /**
     * 实例方法属于对象，通过对象调用，通过ClassTest<String>创建对象的时候，就确定了T的类型为String
     *
     * @param lists
     */
    private void printList(List<T> lists) {
        for (T t : lists) {
            System.out.println(t);
        }
    }

    /**
     * 静态方法不能使用类定义的泛形，而应该单独定义泛形。
     * 静态方法用类调用 ，类调用静态方法时还没有类后面的泛型，
     * 所以静态方法中有泛型，必须要方法自己定义
     *
     * @param list
     * @param i
     * @param j
     * @param <T>
     */
    private static <T> void changeValue(T[] list, int i, int j) {
        T temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    /**
     * Entry<Integer, String> ：表示集合中元素类型    entry:集合中每一个元素的代称   entries：表示你要遍历的集合
     *
     * @param map
     * @param <K>
     * @param <V>
     */
    private static <K, V> void printMap(Map<K, V> map) {
        Set<Map.Entry<K, V>> mapSet = map.entrySet();
        for (Map.Entry<K, V> entry : mapSet) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }

}