package ch01;

//import java.util.Scanner;

public class TestMainArray7 {

	public static void main(String[] args) {

		
		//Scanner sc = new Scanner(System.in);
		
		int[] a = {3,9,5,1,2,6,11,8,4,7} ;
		int max = 0;
		int min = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[j] > a[i]) {
				max = a[j]; //9
				//System.out.println(max + "최대값\t");
				//System.out.print("a[i]값 " + a[i] +"\t" + j + "\t");
				//System.out.println();
				a[j] = a[i]; 
				//System.out.println("a[j]의 값 "+a[j]);
				a[i] = max;
				//System.out.println("a[i]의값 2 = " + a[i]);
				}
			}
			//	System.out.println(a[i]);
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i] > a[j]) {
					min = a[j];
					a[j] = a[i];
					a[i] = min;
				}
			}
		}	
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

//		int[]k = new int[10];
//		System.out.println("번호 입력하기");
//		for (int i = 0; i < 10; i++) {
//			int p = sc.nextInt();
//			
//			k[i] = p;
//		}
//		int m = 0;
//		System.out.println("최대값 순서 구하기");
//		for (int i = 0; i < k.length; i++) {
//			for (int j = i+1; j < k.length; j++) {
//				if(k[j] > k[i]) {
//					m = k[j];
//					k[j] = k[i];
//					k[i] = m;
//				}
//			}
//		}
//		
//		for (int i = 0; i < k.length; i++) {
//			System.out.println("최대값 순서 = "+k[i]);
//		}
//		
//		System.out.println("최소값 순서 구하기");
//		int n = 0;
//		for (int i = 0; i < k.length; i++) {
//			for (int j = i+1; j < k.length; j++) {
//				if (k[j] < k[i]) {
//					n = k[j];
//					k[j] = k[i];
//					k[i] = n;
//				}
//			}
//		}
//		
//		for (int i = 0; i < k.length; i++) {
//			System.out.println("최소값 순서 = "+k[i]);
//		}
//		
		
//	sc.close();
	}


}
