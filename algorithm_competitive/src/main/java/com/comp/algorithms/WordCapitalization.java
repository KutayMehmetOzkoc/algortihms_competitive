package com.comp.algorithms;

import java.util.Scanner;

public class WordCapitalization {

    public String wordCapitalizationAnswer() {
        Scanner scanner = new Scanner(System.in);
        String wordCapitalization = scanner.nextLine();
        String firstLetter = String.valueOf(wordCapitalization.charAt(0)).toUpperCase();
        String continueWord = wordCapitalization.substring(1);

        return firstLetter + continueWord;
    }
}
