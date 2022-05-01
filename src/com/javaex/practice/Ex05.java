//Ex05 5개의 숫자를 키보드로 입력받아 평균을 구하는 프로그램을 작성하세요.

package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 숫자를 입력해주세요");
		
		int[] numbers = new int[5];

		int num = sc.nextInt();
		
		double average = 0;
		
		for(int i=0; i<numbers.length; i++) {
			//numbers[i] = put.next();
		}
		
		
		
		System.out.println("평균 " + average);
		
		sc.close();
	}

}
