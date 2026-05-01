package com.comp.algorithms;

import java.util.Scanner;

public class StringTask {

    public String stringTaskAnswer(){
        Scanner sc = new Scanner(System.in);

        if (sc.hasNext()) {
            String s = sc.next().toLowerCase();

            StringBuilder result = new StringBuilder();

            String vowels = "aoyeui";

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if (vowels.indexOf(c) == -1) {
                    result.append(".");
                    result.append(c);
                }
            }

            sc.close();
            return result.toString();
        }
        else {
            return "";
        }
    }
}
