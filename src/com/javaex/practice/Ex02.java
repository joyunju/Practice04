//[문제] Ex02
//double 형 배열 을 작성하고 1.2, 3.3, 6.7 값을 순서대로 입력하고 아래와 같이 출력되도록 for문 작성 

package com.javaex.practice;

public class Ex02 {
	public static void main(String[] args) {

		double[] dArray = new double[3];
		dArray[0] = 6.7;
		dArray[1] = 3.3;
		dArray[2] = 1.2;

		for (int i = 0; i < dArray.length; i++) {
			System.out.println(dArray[i]);
		}

	}
}
