package ch02;

import java.util.Scanner;

public class FunctionTest3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5자리 숫자를 입력 >>>");
		int num = sc.nextInt();
		
		selectionSort(num);
		
		int[] selectArray = selectionSort(num);
		System.out.println("입력값을 순차적으로 배열입력");
		printArray(selectArray);
		
		System.out.println("입력값을 큰순으로 정렬");
		maxArray(selectArray);
		selectionSort(maxArray(selectArray));
		printArray(selectArray);
		
		System.out.println("입력값을 작은순으로 정렬");
		minArray(selectArray);
		selectionSort(minArray(selectArray));
		printArray(selectArray);
		
		sc.close();
	}
	
	static int[] selectionSort(int num) {

		int mok = 0;
		int remain = 0;
		int[] a = new int[5];
		mok = num;
		int i = a.length - 1;

		while(mok != 0) { 
			remain = mok % 10; 
			mok = mok / 10; 
			a[i] = remain; 
			i--; 
		}
		int[] result = a; 
		
		
		return result;
	}
	
	static int maxArray(int[] num) {
		
		int max = num[0];
		
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if(num[j] > num[i]) {
				max = num[j]; //9
				num[j] = num[i]; 
				num[i] = max;
				}
			}
		}
		
		int result = max;
		
		return result;
	}
	
	static int minArray(int[] num) {

		int min = num[0];

		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if(num[i] > num[j]) {
					min = num[j];
					num[j] = num[i];
					num[i] = min;
				}
			}
		}	
		int result = min;

		return result;
	}
	
	static void printArray(int[] num) {
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("\t"+num[i]);
		}
		System.out.println();
	}

}
