package com.comp.algorithms;

import java.util.Scanner;

public class AntonAndDanik {
    public String antonAndDanikAnswer(){
        Scanner scanner = new Scanner(System.in);
        int matchNum = scanner.nextInt();
        String match = scanner.next();
        int anton = 0;
        int danik = 0;

        for (int i = 0; i < matchNum; i++) {
            if(match.charAt(i)=='A'){
                anton++;
            }
            else {
                danik++;
            }
        }
        scanner.close();
        if(anton == danik){
            return "Friendship";
        }
        else if( anton > danik){
            return "Anton";
        }
        else {
            return "Danik";
        }
    }
}
