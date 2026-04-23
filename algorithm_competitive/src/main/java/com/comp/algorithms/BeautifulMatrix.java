package com.comp.algorithms;

import java.util.Scanner;

public class BeautifulMatrix {

    public int BeautifulMatrixAnswer() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int currentNumber = sc.nextInt();

                // Eğer okuduğumuz sayı 1 ise koordinatlarını al
                if (currentNumber == 1) {
                    m = i;
                    n = j;
                }
            }
        }


        int moves = Math.abs(m - 3) + Math.abs(n - 3);
        sc.close();
        return moves;
    }
}
