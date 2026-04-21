package com.comp.algorithms;

import java.util.Scanner;

public class Watermelon {

    public int watermelon_answer() {
        // Scanner objesini oluşturuyoruz
        Scanner sc = new Scanner(System.in);

        // Karpuzun ağırlığını okuyoruz
        int w = sc.nextInt();

        // Şartlarımızı kontrol ediyoruz
        // 1. Şart: w çift mi?
        // 2. Şart: w, 2'den büyük mü?
        if (w > 2 && w % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        // Kaynak yönetimi için scanner'ı kapatmak iyi bir alışkanlıktır
        sc.close();

        return w;
    }
}
