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
//		int[] b = {10,20,30,40,50}; // 배열의 초기화;
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
				continue; // 다음 명령문을 skip.
			}
			num = num + i;
		}
	//	System.out.println(num);
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
		// a를 좌석수라 했을대 3번째 앉아있는 사람의 번호는?
		
		int[] a = {1,1,0,1,0,0,1,1,0,1};
		int[] man = new int[10];
		int[] ali = new int[10];
		int manr = 0;
		int alir = 0;
		for(int i = 0; i < a.length; i++) {
			
			
			if (a[i] % 2 == 0) {
//				System.out.println("외계인입니다.");
				ali[i]++;
				alir++;
				continue;
			} 
//			System.out.println("사람입니다.");
			man[i]++;
			manr++;
		
		}
		//System.out.println(Arrays.toString(ali));
		//System.out.println(Arrays.toString(man));
		System.out.println("사람은 " + manr + " 명");
		System.out.println("외계인은 " + alir + " 명");
		
		//int s = 5;
		
		
		/*
		int nu = 0;
		
		
		// 3번째 사람의 인덱스 번호
		for (int i = 0; i < a.length; i++) {
			//System.out.println("좌석번호를 입력해 주세요..");
			int s = sc.nextInt(); // 3
			System.out.println("일반 배열번호"+i);
			if(a[i] == 1) { // 배열 값이 1일때 
				System.out.println("1이 해당하는 배열번호"+i);
				nu++;
					if(nu == s) {
						System.out.println(i + 1 + "출");
						break;
				}
			} 
			if (a[s-1] == 0) {
				System.out.println("외계인 입니다.");
				break;
			} else {
				System.out.println("사람입니다.");
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
						System.out.println("인덱스 번호 : " + j);
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
				System.out.println("최대값 구하는중 = " + max);
			} else if(a[i] < min) {
				min = a[i];
				System.out.println("최소값 구하는중 = " + min);
			}
		}
		System.out.println("최대값 = " + max);
		System.out.println("최소값 = " + min);
		
		sc.close();
		
	}

}
