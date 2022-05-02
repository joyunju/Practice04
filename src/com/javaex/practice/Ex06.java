//Ex06 주어진 문자열의 공백을 ‘,’(콤마) 로 변경 후 출력하세요.

package com.javaex.practice;

public class Ex06 {
	public static void main(String[] args) {

		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l' };

		// 첫번째 문장 출력 : This is a pencil
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println("");

		// 공백을 ‘,’(콤마) 로 변경 후 출력
		for (int i = 0; i < c.length; i++) {
			if (c[i] == ' ') {
				c[i] = ',';	
			}
			System.out.print(c[i]);  // 출력 : This,is,a,pencil
		}

	}

}
