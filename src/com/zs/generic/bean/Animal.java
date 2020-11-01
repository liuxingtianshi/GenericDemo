package com.zs.generic.bean;

public class Animal {

    public <T> Animal(T t) {
    }

    //子类报错的第一种解决方法
    public Animal() {
        super();
    }

}
