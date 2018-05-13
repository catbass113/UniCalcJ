package com.xx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Factorial {

    private long fact;

    Factorial() {
        mainLoop();
    }

    private void mainLoop() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Factorial: ");
            fact = Long.parseLong(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (long i = 1; i < 21; i++) {
            fact *= i;
            System.out.println(fact);
        }
    }
}
