package com.xx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

    private int n;
    private int itr;
    private long f1;
    private long f2;
    private long f3;

    Fibonacci() {
        mainLoop();
    }

    private void mainLoop() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Number: ");
            n = Integer.parseInt(br.readLine());
            System.out.print("Iterations: ");
            itr = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        f1 = n;
        f2 = n;

        System.out.println(f1 +"\n"+ f1);

        for (int i = 0; i < itr; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            System.out.println(f3);
        }
    }
}
