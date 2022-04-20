//Ex03
// 문제 : 아래코드의 출력값을 예상하고 코드로 확인해 보세요.

package com.javaex.practice;

public class Ex03 {
	public static void main(String[] args) {

		// 배열 선언과 생성과 초기화까지 한번에 줄여서 표현
		int[] intA = { 3, 6, 9 };

		// B 배열 선언
		int[] intB;

		// intA 주소를 intB에 대입
		intB = intA;

		// test 배열의 intB[0],[2] 값 변경 --> intA 와 intB 배열 동일
		intB[0] = 20;
		intB[2] = 10;

		// 두번째 test
		intA[1] = 30;

		for (int i = 0; i < intA.length; i++) {
			System.out.println(intA[i]);
			// 출력값 : 20, 6, 10
			// 두번째 테스트 후 출력 값 : 20, 30, 10
		}

	}

}
