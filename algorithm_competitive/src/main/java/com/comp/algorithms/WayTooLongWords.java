package com.comp.algorithms;

import java.util.Scanner;

public class WayTooLongWords {

    public String way_too_long_words_answer() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int wordlen = word.length();
        char firstWord = word.charAt(0);
        char lastWord = word.charAt(wordlen - 1);
        if(wordlen > 10 ){
            return "" + firstWord + (wordlen - 2) + lastWord;
        }
        else{
            return word;
        }
    }
}
