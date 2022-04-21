package ch02;

import java.util.Scanner;

class Option {
	
	void showOption() {
	System.out.println("---- 계산기 ----");
	System.out.println("1. 덧 셈");
	System.out.println("2. 뺄 셈");
	System.out.println("3. 곱 셈");
	System.out.println("4. 나 눗 셈");
	System.out.println("0. 종 료");
	}
}

public class FunctionTest2 {

	public static void main(String[] args) {
		
		Option o = new Option();
		
		o.showOption();
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("메뉴 중 하나를 선택해주세요.");
		int f = sc.nextInt();
		if(f==0) {
			System.out.println("계산기를 종료합니다.");
		} else {
		String c = null;
		String d = null;
		System.out.println("first name을 입력해주세요.");
		c = sc.next();
		System.out.println("second name을 입력해주세요.");
		d = sc.next();
		int a = 0;
		int b = 0;
		
		System.out.println("계산 할 첫번쨰 숫자를 입력");
		a = sc.nextInt();
		System.out.println("두번째 숫자를 입력");
		b = sc.nextInt();
		System.out.println("이름 = " + name(c,d));
			if(f == 1) {
				sum(a, b);
			} else if (f == 2) {
				min(a, b);
			} else if (f == 3) {
				mul(a,b);
			} else if (f == 4) {
				div(a,b);
			}
		}
		sc.close();
	}
	public static String name(String c, String d) {
		String cd = c + d;
		return cd;
	}
	
	public static void sum(int a, int b) {
		int result = a + b;
		System.out.println("더하기 = " + result);
	}

	public static void min(int a, int b) {
		int result = a - b;
		System.out.println("빼기 = " + result);
	}
	
	public static void mul(int a, int b) {
		int result = a * b;
		System.out.println("곱하기 = " + result);
	}
	
	public static void div(int a, int b) {
		int result = a / b;
		System.out.println("나누기 = " + result);
	}
	
	
}
