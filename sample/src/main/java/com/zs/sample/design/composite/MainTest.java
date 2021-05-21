package com.zs.sample.design.composite;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/21
 */
public class MainTest {
    public static void main(String[] args) {
        Employee CEO = new Employee("John","CEO", 30000);

        Employee headSales = new Employee("Robert","Head Sales", 20000);

        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

        CEO.add(headSales);

        CEO.add(headMarketing);

        System.out.println(CEO);
    }


}
