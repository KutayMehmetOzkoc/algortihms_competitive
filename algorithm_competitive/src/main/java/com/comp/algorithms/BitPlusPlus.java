package com.comp.algorithms;

import java.util.Scanner;

public class BitPlusPlus {
    public int bit_plus_plus_answer(){
        Scanner sc = new Scanner(System.in);
        int numberValue = sc.nextInt();
        int answer = 0;
        if (sc.hasNextInt()) {
            for (int i = 0; i < numberValue; i++) {
                String word = sc.next();
                if (word.contains("+")) {
                    answer++;
                } else {
                    answer--;
                }
            }
        }
        sc.close();
        return answer;
    }
}
