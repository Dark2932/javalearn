package com.dark2932.javalearn.backup;

import java.util.Scanner;

/**
 * @author Dark2932
 * @date 2025/12/19
 * @link <a href="https://ac.nowcoder.com/acm/contest/125083/A"></a>
 */
public class ICPC_n_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] array = "ABCDEFGHIJKLM".toCharArray();
        if (n >= 10 && n <= 13) {
            StringBuilder str = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                str.append(array[i-1]);
                if (i < n) str.append(" ");
            }
            System.out.println(str);
        }
    }

}
