package com.zs.sample.design.factory;

/**
 * @Author: zhaoshuai
 * @Date: 2021/4/15
 */
public class FactoryTest {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal dog = animalFactory.getAnimal("dog");
        dog.sound();
        Animal cat = animalFactory.getAnimal("cat");
        cat.sound();
    }
}
