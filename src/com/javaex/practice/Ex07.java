//Ex07 키보드에서 정수로 된 돈의 액수를 입력받아 50000원권, 10000원권, 5000원권, 1000원권,
//500원동전, 100원동전, 50원동전, 1원동전 각 몇 개로 변환 되는지 작성 하세요.

package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {

		// 배열
		int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;

		Scanner sc = new Scanner(System.in);
		System.out.print("금액 : ");
		// 입력 받는 정수로된 돈의 액수
		int money = sc.nextInt();

		for (int i = 0; i < wonArray.length; i++) {
			int won = wonArray[i];
			int count = money / won;
			money = money - (count * won);
			//monew = 67879 - (1*5oooo);
			System.out.println(won + "원:" + count + "개");
			//System.out.println(count);
			//System.out.println(money);  
		}

		sc.close();
	}

}
