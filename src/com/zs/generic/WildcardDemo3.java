package com.zs.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 有下限的通配符，只能接收指定类的子类和父类，下线是子类
 */
public class WildcardDemo3 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("猫", "Male", 10);
        Animal animal2 = new Animal("狗", "Female", 5);
        List<Animal> animals = new ArrayList<>();
        animals.add(animal1);
        animals.add(animal2);
        WildcardDemo3.print(animals);
        System.out.println("=================================");

        Cat cat1 = new Cat("波斯猫", "Male", 3);
        Cat cat2 = new Cat("蓝猫", "Female", 2);
        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        WildcardDemo3.print(cats);

        System.out.println("---------------------------------");

        FamilyCat familyCat = new FamilyCat("家猫", "Female", 3);
        List<FamilyCat> familyCats = new ArrayList<>();
        //下限是Cat,其子类已经不适用了
        //WildcardDemo3.print(familyCats);

    }

    /**
     * 通配符下限，只能接收子类Cat及其父类，Cat是下限
     *
     * @param lists
     */
    private static void print(List<? super Cat> lists) {
        //方法内部允许添加 Cat和Cat的子类? ，还有null
        lists.add(new Cat("馒头", "男", 2));
        lists.add(new FamilyCat("龙猫1号", "男", 2));
        lists.add(null);

        //下限是Cat,为什么在方法内部不能添加父类却可以添加子类？
        //lists.add(new Animal("狼","Male",10));

        //可获取元素，但传入的类型可能是E到Object之间的任何类型, 也就无法确认接收的数据类型.
        //所以返回只能使用Object引用来接受！如果需要自己的类型需要强制类型转换
        //Animal animal = (Animal) lists.get(0);
        Object obj = lists.get(0);

        for (Object o : lists) {
            System.out.println(o);
        }
    }

}
