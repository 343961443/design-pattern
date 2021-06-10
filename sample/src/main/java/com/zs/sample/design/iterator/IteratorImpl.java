package com.zs.sample.design.iterator;

import java.util.Iterator;

/**
 * @Author: zhaoshuai
 * @Date: 2021/6/10
 */
public class IteratorImpl {
    private String[] data;

    public Iterator iterator() {
        return new ItrInternal();
    }

    private class ItrInternal implements Iterator<String> {
        int cursor = 0;

        public boolean hasNext() {
            return cursor < data.length;
        }

        public String next() {
            return data[cursor++];
        }

        public void remove() {

        }
    }


    public IteratorImpl(String [] data) {
        this.data = data;
    }



}
