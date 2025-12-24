package com.mingun.practice;

public class ArrayLoopPractice01 {

	public static void main(String[] args) {
		final int ARRAY_LENGTH = 10;
		final int RANDOM_MIN = 1;
		final int RANDOM_MAX = 100;
//		1. 배열에 난수 채우기
//		길이가 10인 int 배열을 만들고, 1~100 사이 난수로 채운 뒤 모든 값을 출력하시오.

//		input
		ArrayProcess ap = new ArrayProcess();

//		process
		ap.setArrayRandom(ARRAY_LENGTH, RANDOM_MIN, RANDOM_MAX);

//		output
		ap.printArray();
	}
}
