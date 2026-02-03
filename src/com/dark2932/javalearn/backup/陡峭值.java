package com.dark2932.javalearn.backup;

import java.util.Scanner;

public class 陡峭值 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();

        char[] sChars = s.toCharArray();
        String[] allChildStr = new String[n-k+1];
        if (s.length() == n) {
            for (int i = 0; i+k <= n; i++) {
                StringBuilder sChild = new StringBuilder();
                for (int j = 0; j < k; j++) {
                    sChild.append(sChars[i+j]);
                }
                allChildStr[i] = sChild.toString();
            }
        } else {
            System.out.println("n值与字符串长度不相等");
        }

        int result = 0;
        for (String str : allChildStr) {
            char[] chars = str.toCharArray();
            for (int o = 0; o+1 < k; o++) {
                result += Math.abs(chars[o+1] - chars[o]);
            }
        }

        System.out.println(result);
    }

}