package ch01;

public class TestMainArray3 {

	public static void main(String[] args) {
		
		int[] a = new int[5]; 
		int[] b = new int[5]; 
		int[] c = new int[5]; 
		
		for (int i = 0; i < 5; i++) { // a배열에 값넣주기
			a[i] = (i+1) * 10;
			b[i] = a[i];	//b배열에 a배열값 넣어주기
			System.out.println(a[i]);
		}
		System.out.println("--------------");
		
		for (int i=0 ; i < 5; i++) {
			c[4-i] = a[i]; //c배열에 역순으로 a배열 넣어주기
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(c[i]); //c배열 출력
		}
		
		System.out.println("--------------2");
		int[] d = {10, 20, 30, 40, 50}; 
		int[] e = new int[5]; 
		int[] f = new int[5];
		int g = 4;
		
		for (int i = 0; i < 5; i++) {
			e[i] = d[i];
			System.out.print(d[i]);
			System.out.println(e[i]);
//			System.out.println(f[i]);
		}
		for (int i = 0; i < 5; i++) {
			f[g] = d[i]; 
			g--; // 역순으로 대입
			
		}
		for (int j = 0; j < 5 ; j++) {
			System.out.println(f[j]);
		}
		
	
	}

}
