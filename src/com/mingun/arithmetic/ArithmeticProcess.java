package com.mingun.arithmetic;

public class ArithmeticProcess {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setRandomNumber(int start, int end) {
        number = (int) (Math.random() * (end - start + 1)) + start;
    }
}
