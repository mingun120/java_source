package com.mingun.array;

public abstract class ArrayProcessor {
    private boolean isRandom, isArithmetic, isDuplicate;

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
        isDuplicate = false;
    }

    public void setRandom() {
        isRandom = true;
    }

    public void setArithmetic() {
        isArithmetic = true;
    }
}

