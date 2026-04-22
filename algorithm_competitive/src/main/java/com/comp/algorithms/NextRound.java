package com.comp.algorithms;

import java.util.Scanner;

public class NextRound {

    public int nextRoundAnswer(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] values = new int[n];

        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        int threshold = values[m-1];
        int counter = 0;

        for (int i = 0; i < n; i++) {
            if (values[i] >= threshold && values[i] > 0) {
                counter++;
            }
        }
        sc.close();
        return counter;
    }
}
