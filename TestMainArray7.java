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
				//System.out.println(max + "�ִ밪\t");
				//System.out.print("a[i]�� " + a[i] +"\t" + j + "\t");
				//System.out.println();
				a[j] = a[i]; 
				//System.out.println("a[j]�� �� "+a[j]);
				a[i] = max;
				//System.out.println("a[i]�ǰ� 2 = " + a[i]);
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
//		System.out.println("��ȣ �Է��ϱ�");
//		for (int i = 0; i < 10; i++) {
//			int p = sc.nextInt();
//			
//			k[i] = p;
//		}
//		int m = 0;
//		System.out.println("�ִ밪 ���� ���ϱ�");
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
//			System.out.println("�ִ밪 ���� = "+k[i]);
//		}
//		
//		System.out.println("�ּҰ� ���� ���ϱ�");
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
//			System.out.println("�ּҰ� ���� = "+k[i]);
//		}
//		
		
//	sc.close();
	}


}
