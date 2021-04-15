package com.zs.sample.design.factory;

/**
 * @Author: zhaoshuai
 * @Date: 2021/4/15
 */
public class AnimalFactory {
    public Animal getAnimal(String animalName) {
        if ("cat".equals(animalName)) {
            return new Cat();
        } else if ("dog".equals(animalName)) {
            return new Dog();
        } else {
            throw new RuntimeException("找不到这个物种");
        }
    }
}
