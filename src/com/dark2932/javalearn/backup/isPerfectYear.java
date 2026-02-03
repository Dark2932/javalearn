package com.dark2932.javalearn.backup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class isPerfectYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;
        for (int a : toList(n)) {
            result *= a;
        }
        System.out.println(isPerfect(result) ? "YES" : "NO");
    }

    private static boolean isPerfect(int n) {
        double sqrt = Math.sqrt(n);
        int sqrtI = (int) sqrt;
        return !(sqrt - sqrtI > 0);
    }

    private static List<Integer> toList(int n) {
        List<Integer> list = new ArrayList<>();
        while (n / 10 != 0) {
            list.add(n % 10);
            n = n / 10;
        }
        if (n / 10 == 0) list.add(n);
        return list;
    }

}