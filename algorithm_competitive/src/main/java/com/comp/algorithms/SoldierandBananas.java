package com.comp.algorithms;

import java.util.Scanner;

public class SoldierandBananas {

    public long soldierandBananasAnswer(){
        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();
        int soldierMoney = sc.nextInt();
        int bananaCounter = sc.nextInt();

        long totalCost = 0;

        for (int i = 1; i <= bananaCounter; i++) {
            totalCost += (long) i * price;
        }

        long borrow = totalCost - soldierMoney;

        sc.close();
        if (borrow < 0) {
            return 0;
        } else {
            return borrow;
        }
    }
}
