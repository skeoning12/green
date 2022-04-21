package ch01;

import java.util.Scanner;

public class TestMainArrayNumber2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0; // 입력받은 숫자
		int mok = 0; // 몫
		
		int remain = 0; // 나머지 값
		int[] a = new int[5];
		System.out.println("5자리 숫자를 입력 >>>");
		num = sc.nextInt();
		mok = num;  // 몫에다가 입력값 지정
		System.out.println("몫=" + mok);
		int i = a.length - 1; // 0부터 시작하기때문에 -1
		
		while(mok != 0) { // 몫이 0이 아닐때까지 반복
			remain = mok % 10; // 결과값 = 입력값 나누기 10
			mok = mok / 10; // 나머지값을 저장
			a[i] = remain; // 결과값을 배열에 저장
			i--; //(입력값을 순차적으로 저장하기위해 순서를 i--;
		}
			
		for (int j = 0; j < a.length; j++) {
			System.out.println("a[" + j + "] =" + a[j]);
		}
		
		sc.close();
	}

}
