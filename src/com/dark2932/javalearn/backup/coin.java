package com.dark2932.javalearn.backup;

import java.util.Scanner;

/**
 * @author Dark2932
 * @date 2025/12/19
 * @link <a href="https://ac.nowcoder.com/acm/problem/16490"></a>
 */
public class coin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int coin = 0;
        int j = 1;
        while (K >= j) {
            coin += j * j;
            K -= j;
            j++;
        }
        if (K > 0) coin += K * j;
        System.out.println(coin);
    }

}