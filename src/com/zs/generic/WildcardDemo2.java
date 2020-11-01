package com.zs.generic;

import java.util.ArrayList;
import java.util.List;

/**
 *  有上限的通配符测试
 */
public class WildcardDemo2 {

    public static void main(String[] args) {
        Animal animal1 = new Animal("猫", "Male", 10);
        Animal animal2 = new Animal("狗", "Female", 5);
        List<Animal> animals = new ArrayList<>();
        animals.add(animal1);
        animals.add(animal2);
        WildcardDemo2.print(animals);

        Cat cat1 = new Cat("波斯猫", "Male", 3);
        Cat cat2 = new Cat("蓝猫", "Female", 2);
        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        WildcardDemo2.print(cats);
    }

    /**
     * 有上限的通配符，参数只能是父类及其子类
     * @param list
     */
    private static void print(List<? extends Animal> list) {
        //不能确定传入到方法的类型，所以不能使用集合的add方法，除非是lists.add(null);
        //lists.add(null);

        //因为不确定传入到集合中的元素类型，所以get方法用Object去接,但是不建议使用
        //Object obj = list.get(0);

        for (Object o : list) {
            System.out.println(o);
        }

    }
}
