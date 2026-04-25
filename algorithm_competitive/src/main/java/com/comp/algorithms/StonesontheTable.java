package com.comp.algorithms;

import java.util.HashSet;
import java.util.Scanner;

public class StonesontheTable {
    public int stonesontheTableAnswer() {
        Scanner sc = new Scanner(System.in);
        int totalStone = sc.nextInt();
        String word = sc.next();
        int counter = 0;
        for  (int i = 0; i < word.length(); i++) {
            if(i == word.length() - 1) {
                break;
            }
            if(word.charAt(i) == word.charAt(i+1)) {
                counter++;
            }
        }

        return counter;
    }
}
