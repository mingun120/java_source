package com.mingun.practice;

public class DataProcess {
	private final int[] GRADE_BENCHMARK = {90, 80, 70, 60, 0};
	private final char[] GRADE = {'A', 'B', 'C', 'D', 'F'};

//	input : 2 Integer(start, end)
//	process : make random Integer from start to end
//	output : random Integer
//	product : @author mingun
//	date : @since 2025. 12. 23.
	public int getRandomInteger(int start, int end) {
		int randomNumber = (int) (Math.random() * (end + 1 - start)) + start;

		return randomNumber;
	}
	

//	input : Array
//	process : get maximum number of Array
//	output : maximum value
//	product : @author mingun
//	date : @since 2025. 12. 23.
	public int maxArray(int[] array) {
		int max = array[0];

		for (int value : array) {
			max = value > max ? value : max;
		}

		return max;
	}

//	input : Array
//	process : get minimum number of Array
//	output : minimum value
//	product : @author mingun
//	date : @since 2025. 12. 23.
	public int minArray(int[] array) {
		int min = array[0];

		for (int value : array) {
			min = value < min ? value : min;
		}

		return min;
	}

//	input : Array
//	process : get total sum of Array
//	output : total sum
//	product : @author mingun
//	date : @since 2025. 12. 23.
	public int sumArray(int[] array) {
		int sum = 0;

		for (int value : array) {
			sum += value;
		}

		return sum;
	}

//	input : Array
//	process : get average of Array
//	output : average
//	product : @author mingun
//	date : @since 2025. 12. 23.
	public double avgArray(int[] array) {
		double avg;

		avg = (double) sumArray(array) / array.length;

		return avg;
	}

//	input : Integer(value)
//	process : check number is odd or even
//	output : even - true, odd - false
//	product : @author mingun
//	date : @since 2025. 12. 23.
	public boolean isEven(int value) {
		return value % 2 == 0;
	}

//	input : 1 Array, 1 Integer(value)
//	process : check value exists in Array
//	output : boolean is exist or not
//	product : @author mingun
//	date : @since 2025. 12. 23.
	public boolean isExist(int[] array, int value) {
		boolean isExist = false;

		for (int v : array) {
			isExist = v == value;
			if (isExist)
				return isExist;
		}

		return isExist;
	}


	public int[] setIndexArray(int[] array, int start, int end) {
		for(int i = 0; i < array.length; i++) {
			array[i] = start + i;
		}
		
		return array;
	}
}
