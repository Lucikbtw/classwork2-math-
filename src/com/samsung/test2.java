package com.samsung;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner item = new Scanner(System.in);

        int x = item.nextInt();
        int y = item.nextInt();

        int a = x * x;
        int b = y * y;

        int res = a + b;


        System.out.println(res);
    }
}
