package com.comp.algorithms;

import java.util.Scanner;

public class NearlyLuckyNumber {

    public String nearlyLuckyNumberAnswer() {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int luckyDigitCount = 0;

        while (n > 0) {
            long lastDigit = n % 10;

            if (lastDigit == 4 || lastDigit == 7) {
                luckyDigitCount++;
            }
            n = n / 10;
        }
        sc.close();
        if (luckyDigitCount == 4 || luckyDigitCount == 7) {
            return "Yes";
        } else {
            return "No";
        }

    }
}
