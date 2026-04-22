package com.comp.algorithms;

import java.util.Scanner;

public class TheatreSquare {
    public long theatreSquareAnswer() {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();

        long horizontal = (n + a - 1) / a;

        long vertical = (m + a - 1) / a;
        sc.close();
        return horizontal * vertical;
    }
}
