package ch02;

import java.util.Scanner;

class Option {
	
	void showOption() {
	System.out.println("---- ���� ----");
	System.out.println("1. �� ��");
	System.out.println("2. �� ��");
	System.out.println("3. �� ��");
	System.out.println("4. �� �� ��");
	System.out.println("0. �� ��");
	}
}

public class FunctionTest2 {

	public static void main(String[] args) {
		
		Option o = new Option();
		
		o.showOption();
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("�޴� �� �ϳ��� �������ּ���.");
		int f = sc.nextInt();
		if(f==0) {
			System.out.println("���⸦ �����մϴ�.");
		} else {
		String c = null;
		String d = null;
		System.out.println("first name�� �Է����ּ���.");
		c = sc.next();
		System.out.println("second name�� �Է����ּ���.");
		d = sc.next();
		int a = 0;
		int b = 0;
		
		System.out.println("��� �� ù���� ���ڸ� �Է�");
		a = sc.nextInt();
		System.out.println("�ι�° ���ڸ� �Է�");
		b = sc.nextInt();
		System.out.println("�̸� = " + name(c,d));
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
		System.out.println("���ϱ� = " + result);
	}

	public static void min(int a, int b) {
		int result = a - b;
		System.out.println("���� = " + result);
	}
	
	public static void mul(int a, int b) {
		int result = a * b;
		System.out.println("���ϱ� = " + result);
	}
	
	public static void div(int a, int b) {
		int result = a / b;
		System.out.println("������ = " + result);
	}
	
	
}
