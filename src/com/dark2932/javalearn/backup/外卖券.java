package com.dark2932.javalearn.backup;

import java.util.Scanner;

public class 外卖券 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double eight = x * 0.8;
        double five = (double) x - 5;
        System.out.println(eight == five ? 0 : (eight < five ? 8 : 5));
    }

}