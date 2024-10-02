package com.samsung;

import java.util.Scanner;

public class clock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int secday = 86400;

        n = n % secday;

        int hours = n / 3600;
        int minutes = ((n % 3600) / 60) ;
        int seconds = (n % 60);

        String s =  String.format ("%d:%02d:%02d", hours, minutes, seconds);

        System.out.println(s);

    }
}