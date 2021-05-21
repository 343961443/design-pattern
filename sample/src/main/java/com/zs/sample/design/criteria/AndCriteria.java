package com.zs.sample.design.criteria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/21
 */
public class AndCriteria implements Criteria {
    private List<Criteria> criteriaList = new ArrayList<Criteria>();

    public AndCriteria(Criteria ...criteriaArray) {
        for (Criteria criteria : criteriaArray) {
            criteriaList.add(criteria);
        }
    }

    public List<Person> match(List<Person> personList) {
        for (Criteria criteria : criteriaList) {
            personList = criteria.match(personList);
        }
        return personList;
    }
}
