package org.lbg.c4;

import org.lbg.unreachable.ClassB;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ClassA ca = new ClassA();
        System.out.println(ca.toString());
        ClassB cb = new ClassB();
        System.out.println(cb.age);
        int x = 33;
        System.out.println("Hello world! " + x);
    }
}
