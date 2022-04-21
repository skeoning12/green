package ch01;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMainArray {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		String k;
		
		ArrayList<String> korean = new ArrayList<>();
		ArrayList<Integer> number = new ArrayList<>();
		
		int o;
		
		for (int i = 0; i < 10; i++) {
		//String[] n = new String[i+1];
			k = sc.next();
			korean.add(k);  
			o = sn.nextInt();
			number.add(o);
		//	n[i] = k;
			System.out.println(korean);
			System.out.println("----");
			System.out.println(number);
			System.out.println("----");
			//System.out.println(n[i] + n.length);
			System.out.println("----");
		
		}
		sc.close();
		sn.close();
	}

}
