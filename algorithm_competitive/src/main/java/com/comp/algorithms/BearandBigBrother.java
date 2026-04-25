package com.comp.algorithms;

import java.util.Scanner;

public class BearandBigBrother {

    public int bearAndBigBrotherAnswer() {
        Scanner scanner = new Scanner(System.in);
        int limak = scanner.nextInt();
        int bob = scanner.nextInt();
        int counter = 0;

        while (limak <= bob) {
            limak = limak * 3;
            bob = bob * 2;

            counter++;
        }

        return counter;
    }
}
