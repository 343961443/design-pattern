package com.zs.sample.design.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/21
 */
public class MaleCriteria implements Criteria {
    private final String male = "Male";

    public List<Person> match(List<Person> personList) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : personList) {
            if(person.getGender().equalsIgnoreCase(male)){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
