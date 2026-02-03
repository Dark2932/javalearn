package com.dark2932.javalearn.backup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class two_matrix_has_you {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<char[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            if (str.length() <= m) {
                list.add(str.toCharArray());
            } else {
                System.out.println("error");
                return;
            }
        }

        int result = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < m-1; j++) {
                List<Character> array = new ArrayList<>();
                array.add(list.get(i)[j]);
                array.add(list.get(i+1)[j]);
                array.add(list.get(i)[j+1]);
                array.add(list.get(i+1)[j+1]);
                if (array.contains('y') && array.contains('o') && array.contains('u')) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }

}