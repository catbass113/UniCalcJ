package com.xx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class QuadraticEquation {

    private double a, b, c, d;
    private double x1, x2;
    private double sqrt;
    private double sqrtRemainder;

    private Arithmetics arithmetics;

    QuadraticEquation() {
        arithmetics = new Arithmetics();
        mainLoop();
    }

    private void mainLoop() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("ax^2: ");
            a = Double.parseDouble(br.readLine());
            System.out.print("bx: ");
            b = Double.parseDouble(br.readLine());
            System.out.print("c: ");
            c = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        d = Math.pow(b, 2) - (4*a*c);
        System.out.println("\nD = b^2 - 4ac\nD = "+ Math.pow(b, 2) +" - 4.0 * "+ a +" * "+ c +" = "+ d +"\n");

        sqrt = d;

        if (Math.sqrt(d) % 1 == 0) {
            sqrt = Math.sqrt(d);
        } else {
            arithmetics.sqrtSimplify(sqrt);
            sqrt = arithmetics.getSqrt();
            sqrtRemainder = arithmetics.getSqrtRemainder();
        }

        if (d > 0){
            if (sqrtRemainder > 0) {
                x1 = ((-1)*b - sqrt*Math.sqrt(sqrtRemainder)) / (2*a);
                x2 = ((-1)*b + sqrt*Math.sqrt(sqrtRemainder)) / (2*a);
            } else {
                x1 = ((-1)*b - sqrt) / (2*a);
                x2 = ((-1)*b + sqrt) / (2*a);
            }

            System.out.println("D > 0 (Два корня)\n");
            System.out.println("x1 = (-b - sqrt(D)) / 2a");
            System.out.println("x2 = (-b + sqrt(D)) / 2a\n");
            System.out.println("Можно вынести " + sqrt + ", осталось под корнем " + sqrtRemainder +"\n");
            System.out.println("x1 = (-"+ b +" - "+ sqrt +" * sqrt("+ sqrtRemainder +")"+") / (2.0 * "+ a +")");
            System.out.println("x2 = (-"+ b +" + "+ sqrt +" * sqrt("+ sqrtRemainder +")"+") / (2.0 * "+ a +")\n");
            System.out.println("x1 = " + x1 + "\nx2 = " + x2);
        }
        else if (d == 0){
            x1 = ((-1) * b) / 2*a;
            System.out.println("D = 0 (Один корень)\n");
            System.out.println("Можно вынести " + sqrt + ", осталось под корнем " + sqrtRemainder +"\n");
            System.out.println("x = -b / 2a");
            System.out.println("x = " + x1);
        } else {
            System.out.println("D < 0\nНе имеет решения.");
        }
    }
}
