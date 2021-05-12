package com.zs.sample.design.clone;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/12
 */
public class MainTest {
    public static void main(String[] args) throws Exception {
        Book subBook = new Book();
        subBook.setName("subbook");
        Book book1 = new Book();
        book1.setBook(subBook);
        book1.setAuthor("zs");
        book1.setName("程序");
        System.out.println("book1=>" + book1);
        // object 进行克隆
        Book book2 = (Book)book1.clone();
        System.out.println("浅克隆book2=>" + book2);
        System.out.println("浅克隆book1 == book2 =>" + (book1 == book2));
        // 浅克隆模式，那么克隆出来的对象的属性subBook就是同一个
        System.out.println("浅克隆book2.getSubBook == book1.getSubBook=>" + (book2.getBook() == book1.getBook()));

        // 流化克隆
        Book book3 =  (Book)book1.streamClone();
        System.out.println("流化克隆book3=>" + book3);
        System.out.println("流化克隆book1 == book3 =>" + (book1 == book3));
        System.out.println("流化克隆book3.getSubBook == book1.getSubBook=>" + (book3.getBook() == book1.getBook()));

        // 深克隆模式，那么克隆出来的对象的属性subBook不是同一个
        Book book4 =  (Book)book1.deepClone();
        System.out.println("深克隆book4.getSubBook == book1.getSubBook=>" + (book4.getBook() == book1.getBook()));



    }
}
