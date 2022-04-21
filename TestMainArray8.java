package ch01;

public class TestMainArray8 {

	public static void main(String[] args) {

		int[] a = {1,0,2,3,1,0,2,3,1,1};
		int zer = 0;
		int fir = 0;
		int sec = 0;
		int thi = 0;
		for (int i = 0; i < a.length; i++) {
			
			if(a[i] == 0) {
				zer++;
			} else if(a[i] == 1) {
				fir++;
			} else if(a[i] == 2) {
				sec++;
			} else if(a[i] == 3) {
				thi++;
			}
		}
		
		int index = 1; // ÀÚ¸®
		int c = 0;
		for (int i = 0; i < a.length; i++) {
				if(a[i] == 0) {
					System.out.println("----------");
					c++;
					if(c == index) {
						System.out.println(i + "¹øÈ£");
						break;
					}
				} 
		}
		
		System.out.println();
		System.out.println("0ÀÇ °¹¼ö = " + zer);
		System.out.println("1ÀÇ °¹¼ö = " + fir);
		System.out.println("2ÀÇ °¹¼ö = " + sec);
		System.out.println("3ÀÇ °¹¼ö = " + thi);
		
		
		
	}
}
