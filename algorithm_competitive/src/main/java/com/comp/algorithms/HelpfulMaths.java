package com.comp.algorithms;

import java.util.*;

public class HelpfulMaths {

    public String helpfulMathsAnswer() {
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        List<String> numbers =  new ArrayList<>();
        for (int i = 0; i < operation.length(); i++) {
            char c = operation.charAt(i);
            if (c != '+') {
                // Karakteri String'e çevirip ekliyoruz ("1", "2" vb.)
                numbers.add(String.valueOf(c));
            }
        }
        Collections.sort(numbers);
        scanner.close();
        return String.join("+", numbers);
    }
}
