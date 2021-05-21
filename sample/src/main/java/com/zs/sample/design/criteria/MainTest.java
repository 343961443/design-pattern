package com.zs.sample.design.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/21
 */
public class MainTest {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("Laura","Female", "Single"));
        persons.add(new Person("Mike","Female", "Merry"));
        persons.add(new Person("Bobby","Male", "Merry"));

        Criteria male = new MaleCriteria();
        Criteria single = new SingleCriteria();
        Criteria maleAndSingle = new AndCriteria(male, single);

        // 过滤出男性
        List<Person> malePersonList = male.match(persons);
        System.out.println(malePersonList);

        // 过滤出单身
        List<Person> singlePersonList = single.match(persons);
        System.out.println(singlePersonList);

        // 过滤出单身&男性
        List<Person> maleAndSingleList = maleAndSingle.match(persons);
        System.out.println(maleAndSingleList);
    }
}
