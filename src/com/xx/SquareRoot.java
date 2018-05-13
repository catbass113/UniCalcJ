package com.xx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareRoot {

    private double sqrt;
    private double sqrtRemainder;

    private Arithmetics a;

    SquareRoot() {
        a = new Arithmetics();
        mainLoop();
    }

    private void mainLoop() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("sqrt: ");
            sqrt = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (Math.sqrt(sqrt) % 1 == 0) {
            sqrt = Math.sqrt(sqrt);
            System.out.print("Ответ: "+ sqrt);
        } else {
            a.sqrtSimplify(sqrt);
            sqrt = a.getSqrt();
            sqrtRemainder = a.getSqrtRemainder();
            System.out.print("Вынесли: "+ sqrt +", осталось под корнем: "+ sqrtRemainder);
        }
    }
}
