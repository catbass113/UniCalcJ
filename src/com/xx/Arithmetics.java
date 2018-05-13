package com.xx;

class Arithmetics {

    private double sqrt;
    private double sqrtRemainder;

    double getSqrt() { return sqrt; }
    double getSqrtRemainder() { return sqrtRemainder; }

    void sqrtSimplify(double value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0 && Math.sqrt(value/i) % 1 == 0) {
                sqrt = Math.sqrt(value/i);
                sqrtRemainder = i;
                break;
            }
        }
    }
}
