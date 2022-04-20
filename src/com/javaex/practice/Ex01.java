//아래의 코드를 실행하면 출력결과에 오류가 발생한다. 오류 수정 후 출력결과를 예상하고 코드로 확인해 보세요.
// 배열의 사용시 자주 하는 오류

package com.javaex.practice;

public class Ex01 {
	public static void main(String[] args) {

		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;

		int result = 0;

		// 오류 이유 --> i<= intArray.length; --> 이렇게 작성 불가
		// <= 이렇게 표기시, 6번째 방이 없기 때문에 오류
		// 방이 5개인데, 3개만 초기화 설정 했기 때문에 4번째 값은 0으로 세팅 됨 (정수형 )

		for (int i = 0; i < intArray.length; i++) {
			result = result + intArray[i];
		}
		System.out.println(result); // 결과값 : 22
		
		System.out.println("intArray의 4번째 값: " + intArray[3]);
	}
}
