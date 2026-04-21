package com.comp.algorithms;

import java.util.Scanner;

public class Team {
    public int team_answer(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int totalSolved = 0;

        for (int i = 0; i < n; i++) {
            int petya = sc.nextInt();
            int vasya = sc.nextInt();
            int tonya = sc.nextInt();

            if ((petya + vasya + tonya) >= 2) {
                totalSolved++;
            }
        }

        System.out.println(totalSolved);

        sc.close();

        return totalSolved;
    }
}
