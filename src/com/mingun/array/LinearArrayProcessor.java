package com.mingun.array;

public class LinearArrayProcessor extends ArrayProcessor {
    private int[] array;

    public LinearArrayProcessor() {
        super();
    }

    @Override
    public void generateArray(int length, int start, int end) {
        array = new int[length];
        if(isRandom) {
            for (int i = 0; i < array.length; i++) {
                arithProcess.setRandomNumber(start, end);
                setValue(i,arithProcess.getNumber());
            }
        }
    }

    @Override
    public int max() {
        return 0;
    }

    @Override
    public int min() {
        return 0;
    }

    @Override
    public int sum() {
        return 0;
    }

    @Override
    public double avg() {
        return 0;
    }

    public void setValue(int index, int value) {
        array[index] = value;
    }

    @Override
    public void printArray() {
        result = "index:";
        System.out.print("index:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3d ",i);
            result = result.concat(String.format("%4d ",i));
        }
        result += "\nvalue:";
        System.out.print("\nvalue:");
        for(int value : array) {
            result = result.concat(String.format("%3d ",value));
            System.out.printf("%3d ",value);
        }
        result += "\n";
        System.out.println();
    }
}
