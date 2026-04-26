package com.comp.algorithms;

import java.util.Scanner;

public class Word {
    public String wordAnswer(){

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        int upperCount = 0;
        int lowerCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                upperCount++;
            }
            else {
                lowerCount++;
            }
        }
        sc.close();
        if(upperCount == lowerCount || lowerCount > upperCount){
            return word.toLowerCase();
        }
        else {
            return word.toUpperCase();
        }
    }
}
