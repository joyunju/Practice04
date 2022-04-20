//[문제] Ex04
//주어진 배열 데이터를 이용하여 3의 배수의 개수와 배수의 합을 아래와 같이 출력하는 프로그램을 작성하세요
//배열 데이터 --> int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };

package com.javaex.practice;

public class Ex04 {
	public static void main(String[] args) {
		
		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		
		int count = 0; // 개수 담을 변수
		int sum = 0; // 합계를 담을 변수 
		
		
		for(int i =0; i<data.length; i++) {
			//System.out.print(data[i]);
			
			// 만약 3으로 나누었을 때 나머지가 0이면 -> 3의 배수
			if(data[i]%3==0) {
				//System.out.println(data[i]);
				count++;
				sum += data[i];
				//sum = sum + data[i];
			}
		}
		
		System.out.println("주어 배열에서 3의 배수의 개수 => " + count);
		System.out.println("주어 배열에서 3의 배수의 합 => " + sum);
	}

}
