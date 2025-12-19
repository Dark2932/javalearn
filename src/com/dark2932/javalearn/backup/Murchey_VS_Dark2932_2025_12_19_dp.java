package com.dark2932.javalearn.backup;

import java.util.Scanner;

/**
 * @author Dark2932
 * @date 2025/12/19
 * @link <a href="https://ac.nowcoder.com/acm/problem/260441"></a>
 */
public class Murchey_VS_Dark2932_2025_12_19_dp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder str = new StringBuilder().append(n).reverse();
        char[] array = str.toString().toCharArray();
        int k = 0;
        for (char r : array) {
            int num = Character.getNumericValue(r);
            if (num % 2 == 0) break;
            else k++;
        }
        System.out.println(k);
    }

    private static void easy() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while ((n & 1) != 0) {
            n /= 10;
            i++;
        }
        System.out.println(i);
    }

}
