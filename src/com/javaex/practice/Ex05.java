//Ex05 5개의 숫자를 키보드로 입력받아 평균을 구하는 프로그램을 작성하세요.

package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// System.out.println("5개의 숫자를 입력해주세요");

		int[] numArray = new int[5];

		int num;
		double sum = 0;

		// 입력받은 숫자를 배열에 저장
		for (int i = 0; i < numArray.length; i++) {
			// numbers[i] = put.next();
			num = sc.nextInt();
			numArray[i] = num;
		}
		
		// 입력받은 값 더하기
		for(int i =0; i<numArray.length; i++) {
			sum = sum + numArray[i];
		}
		
		//평균 구하기 —> 합 나누기 배열에 저장된 수 
		//출력값 예시 : 평균은 30.0 입니다.
		System.out.println("평균은 " + sum / numArray.length + " 입니다.");

		sc.close();
	}

}
