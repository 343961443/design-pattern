package com.zs.sample.design.criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/21
 */
public class SingleCriteria implements Criteria {
    private final String single = "Single";
    public List<Person> match(List<Person> personList) {
        List<Person> singlePersonList = new ArrayList<Person>();
        for (Person person : personList) {
            if(person.getMaritalStatus().equalsIgnoreCase(single)){
                singlePersonList.add(person);
            }
        }
        return singlePersonList;
    }
}
