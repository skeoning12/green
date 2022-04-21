package ch01;

import java.util.Scanner;

public class TestMainArrayNumber {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요~");
		
		
		int div=0;
//		div = num;
//		
//		while(div!=0) {
//			s++;
//			div /= 10;
//			System.out.println(div + "이숫자");
//		}
		for (int j = 0; j < 5; j++) {
			int num = sc.nextInt();
			
			int[] a = new int[5];
			div = num;
			
			for (int i =a.length-1; i >=0 ; i--) {
				a[i] = div % 10;
				System.out.println(a[i] + "배열숫자");
				div /= 10;
				//System.out.println(div + "숫자");
			}
			
			for (int i = 0; i < a.length; i++) {
				System.out.println("a[" + i + "]= " + a[i]);
			}
			
		}
		sc.close();
	}

}
