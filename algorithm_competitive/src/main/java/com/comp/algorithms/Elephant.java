package com.comp.algorithms;

import java.util.Scanner;

public class Elephant {
    public void elephantAnswer(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stepCounter = 0;
        if (n % 5 == 0) {
            stepCounter = n / 5;
        } else {
            stepCounter = (n / 5) + 1;
        }
        System.out.println(stepCounter);
        sc.close();
    }
}
