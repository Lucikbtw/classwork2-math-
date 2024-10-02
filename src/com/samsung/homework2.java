package com.samsung;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
     /*   Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = num / 100;
        int y = num % 10;
        int z = num / 10;
        int c = z % 10;
        int d = x+y+c;
        System.out.println(d);*/
        /*Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int nbb = num + 2 - num % 2;
        System.out.println(nbb);*/

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int costkopei = (x * 100 + y) * z;

        int costrub = costkopei / 100;
        int costkop = costkopei % 100;

        System.out.println(costrub + " " + costkop);
    }
}
