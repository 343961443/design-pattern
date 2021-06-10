package com.zs.sample.design.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: zhaoshuai
 * @Date: 2021/6/10
 */
public class MainTest {
    public static void main(String[] args) {
        IteratorImpl iteratorImpl = new IteratorImpl(new String[]{"1","2"});
        Iterator<String> iterator = iteratorImpl.iterator();
        while(iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }
    }
}
