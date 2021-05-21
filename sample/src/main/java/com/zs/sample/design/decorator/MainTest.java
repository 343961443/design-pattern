package com.zs.sample.design.decorator;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * @Author: zhaoshuai
 * @Date: 2021/5/21
 */
public class MainTest {
    public static void main(String[] args) throws Exception{
        CircleShapeDecorator circleShapeDecorator = new CircleShapeDecorator(new CircleShape());
        circleShapeDecorator.draw();
        // java文件流操作是典型的装饰者模式
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("D:\\hello.txt")));
        while (in.available() != 0) {
            System.out.print((char) in.readByte());
        }
        in.close();
    }
}
