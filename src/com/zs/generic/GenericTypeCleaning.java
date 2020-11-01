package com.zs.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 因为泛型信息只存在于代码编译阶段，编译器编译完带有泛形的java程序后，生成的class文件中与泛型相关的信息会被擦除掉，以此使程序运行效率不受到影响，这个过程叫做类型擦除，也就是说泛型类和普通类在 java 虚拟机内是一样的。
 * 思考：由于编译生成的字节码会丢掉泛型的类型信息，只要能跳过编译器，就可以往某个泛型集合中加入其它类型的数据（反射中的知识点）。
 */
public class GenericTypeCleaning {

    /**
     * 类List<String>和List<Integer>经过编译被类型擦除后类型均为java.util.ArrayList
     *
     * @param args
     */
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        // 获取运行时候的类
        System.out.println(stringList.getClass());
        System.out.println(integerList.getClass());
    }
}
