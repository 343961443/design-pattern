package com.zs.sample.design.criteria;

import java.util.List;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/21
 */
public interface Criteria {
    List<Person> match(List<Person> personList);
}
