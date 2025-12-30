package com.mingun.array;

import com.mingun.arithmetic.ArithmeticProcess;

public abstract class ArrayProcessor {
    protected boolean isRandom, isArithmetic, isDuplicate;
    protected ArithmeticProcess arithProcess = new ArithmeticProcess();
    protected String result="";

    public ArrayProcessor() {
        isArithmetic = false;
        isRandom = false;
        isDuplicate = true;
    }

    public abstract int max();
    public abstract int min();
    public abstract int sum();
    public abstract double avg();

    public void setDuplicate() {
        isRandom = true;
        isDuplicate = false;
        isArithmetic = false;
    }

    public void setRandom() {
        isRandom = true;
        isDuplicate = true;
        isArithmetic = false;
    }

    public void setArithmetic() {
        isRandom = false;
        isDuplicate = false;
        isArithmetic = true;
    }

    public abstract void generateArray(int length, int start, int end);

    public void printArray() {

    }

    public String getResult() {
        return result;
    }
}

