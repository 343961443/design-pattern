package com.zs.sample.design.clone;

import java.io.*;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/12
 */
public class Book implements Cloneable,Serializable {
    private String name;
    private String author;

    private Book subBook;

    public Book getBook() {
        return subBook;
    }

    public void setBook(Book subBook) {
        this.subBook = subBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", book=" + subBook +
                '}';
    }
    //  浅克隆模式
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    // 深克隆模式
    protected Object deepClone() throws CloneNotSupportedException {
        Book object = (Book) super.clone();
        object.setBook((Book) object.getBook().clone());
        return object;
    }
    // 前提是要实现Serializable 接口
    public Object streamClone() throws Exception {
        // 将对象写到流里
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);
        // 从流里读出来
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        return (oi.readObject());
    }


}
