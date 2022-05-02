//Ex08 배열을 사용하여 1~45까지의 숫자 중 임의의 6개의 숫자를 출력하세요-미니로또
//(중복체크 할 것)

package com.javaex.practice;

public class Ex08 {
	public static void main(String[] args) {
		// Math.random() 함수는 double 형으로 0.0이상 1.0 미만 사이의 값을 반환하는 함수
		// 랜덤함수는 기본형이 Double형이기에 (int) 로 정수로 바꿔주어야 함
		// 1부터의 값을 뽑고 싶다면 랜덤함수는 0부터 나오기때문에 +1 해주기

		int[] lotto = new int[6];

		// 랜덤 번호 만들기
		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;

			// 중복검사
			// i 는 현재 입력된 방번호 <--중복인지 검사해야됨
			// j 비교대상 [0]부터 순서대로 검사해서 i 이전방까지 검사
			// 비교해서 같은 값 방이 나오면 뒤쪽은 검사하지 않음
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}

		}
		System.out.print("로또 번호: ");
		// 번호 추첨
		for (int j = 0; j < lotto.length; j++) {
			System.out.print(lotto[j] + "  ");
		}
	}

}
