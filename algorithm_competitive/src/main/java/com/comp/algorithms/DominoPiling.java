package com.comp.algorithms;

import java.util.Scanner;

public class DominoPiling {
    public int dominoPilingAnswer(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int area = n*m;
        sc.close();
        return area/2;
    }
}
