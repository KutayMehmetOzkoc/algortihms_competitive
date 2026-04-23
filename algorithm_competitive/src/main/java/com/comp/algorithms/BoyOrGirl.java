package com.comp.algorithms;

import java.util.HashSet;
import java.util.Scanner;

public class BoyOrGirl {

    public String boyOrGirlAnswer() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next().toLowerCase();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {
            set.add(word.charAt(i));
        }

        scanner.close();
        if (set.size() % 2 == 0) {
            return "CHAT WITH HER!";
        }
        else {
            return "IGNORE HIM!";
        }
    }
}
