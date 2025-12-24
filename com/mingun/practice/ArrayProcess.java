package com.mingun.practice;

public class ArrayProcess {
	private int[] array;
	private int[][] d2Array;
	private DataProcess dp = new DataProcess();

//	input : Array
//	process : print out all elements of Array
//	output : none
//	product : @author mingun
//	date : @since 2025. 12. 23.
	public void printArray() {
		for (int value : array) {
			System.out.printf("%d\t", value);
		}

		System.out.println();
	}

//	input : 2Dimension Array
//	process : print out all elements of Array
//	output : none
//	product : @author mingun
//	date : @since 2025. 12. 23.
	public void printD2Array() {
		for (int[] linear : d2Array) {
			setArray(linear);
			printArray();
		}
	}

//	input : Array, Integer(value of benchmark)
//	process : print out all elements of Array over benchmark
//	output : none
//	product : @author mingun
//	date : @since 2025. 12. 23.
	public void printArrayUpperBenchmark(int[] array, int benchmark) {
		for (int value : array) {
			if (value >= benchmark) {
				System.out.printf("%d\t", value);
			}
		}

		System.out.println();
	}

//	input : Array, Integer(value of benchmark)
//	process : print out all elements of Array over benchmark
//	output : none
//	product : @author mingun
//	date : @since 2025. 12. 23.
	public void printArrayLowerBenchmark(int[] array, int benchmark) {
		for (int value : array) {
			if (value <= benchmark) {
				System.out.printf("%d\t", value);
			}
		}

		System.out.println();
	}

//	input : Array
//	process : get maximum number of Array
//	output : maximum value
//	product : @author mingun
//	date : @since 2025. 12. 23.
	public int maxArray(int[] array) {
		return dp.maxArray(array);
	}

//	input : Array
//	process : get minimum number of Array
//	output : minimum value
//	product : @author mingun
//	date : @since 2025. 12. 23.
	public int minArray(int[] array) {
		return dp.minArray(array);
	}

//	input : Array
//	process : get total sum of Array
//	output : total sum
//	product : @author mingun
//	date : @since 2025. 12. 23.
	public int sumArray(int[] array) {
		return dp.sumArray(array);
	}

//	input : Array
//	process : get average of Array
//	output : average
//	product : @author mingun
//	date : @since 2025. 12. 23.
	public double avgArray(int[] array) {
		return dp.avgArray(array);
	}

//	input : Integer(value)
//	process : check number is odd or even
//	output : even - true, odd - false
//	product : @author mingun
//	date : @since 2025. 12. 23.
	public boolean isEven(int value) {
		return dp.isEven(value);
	}

//	input : 1 Array, 1 Integer(value)
//	process : check value exists in Array
//	output : boolean is exist or not
//	product : @author mingun
//	date : @since 2025. 12. 23.
	public boolean isExist(int[] array, int value) {
		return dp.isExist(array, value);
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}
	
	public void setArray(int index, int value) {
		array[index] = value;
	}

	public int[] setIndexArray(int start, int end) {
		setArray(new int[end - start + 1]);
		
		for (int i = 0; i < array.length; i++) {
			setArray(i, start + i);
		}
		
		return dp.setIndexArray(array, start, end);
	}

	public void setArrayRandom(int length, int start, int end) {
		setArray(new int[length]);
		
		for(int i = 0; i < length; i++) {
			setArray(i, dp.getRandomInteger(start, end));
		}
	}
}
