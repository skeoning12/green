package ch01;

//import java.util.Arrays;
import java.util.Scanner;


public class TestMainArray6 {

	public static void main(String[] args) {
		
//		int[] a = new int [5];
//		
//		a[0] = 1;
//		a[1] = 2;
//		a[2] = 3;
//		a[3] = 4;
//		a[4] = 5;
//		
//		int[] b = {10,20,30,40,50}; // �迭�� �ʱ�ȭ;
//		
//		int[] c = new int[10];
//		
//		for (int i = 0; i < a.length; i++) {
//			c[i] = a[i];
//			System.out.println(Arrays.toString(c));
//		}
//		System.out.println("---------------------");
//		for (int i = 0; i < b.length; i++) {
//			c[5+i] = b[i];
//			System.out.println(Arrays.toString(c));
//		}
		
		int n = 0;
		int sum = 0;
		
		sum = sum + n;
		
		for (int i = 0; i <= 10; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
			//	System.out.println(i);
			}
			//n++;
		}
	//	System.out.println(sum);
		
		int num = 0;
		for (int i = 0; i <= 10; i++) {
			
			if (i % 2 == 1) {
				continue; // ���� ��ɹ��� skip.
			}
			num = num + i;
		}
	//	System.out.println(num);
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		// a�� �¼����� ������ 3��° �ɾ��ִ� ����� ��ȣ��?
		
		int[] a = {1,1,0,1,0,0,1,1,0,1};
		int[] man = new int[10];
		int[] ali = new int[10];
		int manr = 0;
		int alir = 0;
		for(int i = 0; i < a.length; i++) {
			
			
			if (a[i] % 2 == 0) {
//				System.out.println("�ܰ����Դϴ�.");
				ali[i]++;
				alir++;
				continue;
			} 
//			System.out.println("����Դϴ�.");
			man[i]++;
			manr++;
		
		}
		//System.out.println(Arrays.toString(ali));
		//System.out.println(Arrays.toString(man));
		System.out.println("����� " + manr + " ��");
		System.out.println("�ܰ����� " + alir + " ��");
		
		//int s = 5;
		
		
		/*
		int nu = 0;
		
		
		// 3��° ����� �ε��� ��ȣ
		for (int i = 0; i < a.length; i++) {
			//System.out.println("�¼���ȣ�� �Է��� �ּ���..");
			int s = sc.nextInt(); // 3
			System.out.println("�Ϲ� �迭��ȣ"+i);
			if(a[i] == 1) { // �迭 ���� 1�϶� 
				System.out.println("1�� �ش��ϴ� �迭��ȣ"+i);
				nu++;
					if(nu == s) {
						System.out.println(i + 1 + "��");
						break;
				}
			} 
			if (a[s-1] == 0) {
				System.out.println("�ܰ��� �Դϴ�.");
				break;
			} else {
				System.out.println("����Դϴ�.");
				break;
			}
		}
		
		
		for (int i = 0; i < a.length; i++) {
			int t = sc.nextInt();
			int k = 0;
			for (int j = 0; j < a.length; j++) {
				if(a[j] == 1) {
					k++;
					if (k == t) {
						System.out.println("�ε��� ��ȣ : " + j);
						break;
					}
				}
			}
		
		}	
		*/
		
		a = new int[] {10, 62, 30, 44, 50, 23, 100, 8, 1};
		
		int max = a[0];
		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			if(a[i] > max ) {
				max = a[i];
				System.out.println("�ִ밪 ���ϴ��� = " + max);
			} else if(a[i] < min) {
				min = a[i];
				System.out.println("�ּҰ� ���ϴ��� = " + min);
			}
		}
		System.out.println("�ִ밪 = " + max);
		System.out.println("�ּҰ� = " + min);
		
		sc.close();
		
	}

}
