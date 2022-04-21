package ch01;

public class TestMainArray4 {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		int[] b = new int[5];
		int[] c = new int[10];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = (i+1) * 10; 
		}
		
		for (int i = 0; i < 5; i++) {
			b[i] = (i+6) * 10;
		}
		
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[i+5] = b[i];
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i] + "-----c");
		}
	}

}
