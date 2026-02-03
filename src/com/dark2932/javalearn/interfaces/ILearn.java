package com.dark2932.javalearn.interfaces;

/**
 * @author Dark2932
 * @date 2026/1/1
 */
public interface ILearn {

    int a = 10;

    default void test() {
        test1();
    }

    private static void test1() {
        System.out.println(1);
    }

}
