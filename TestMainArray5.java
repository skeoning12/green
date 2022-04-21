package ch01;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMainArray5 {

	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<>();
		ArrayList<Integer> kor = new ArrayList<>();
		ArrayList<Integer> eng = new ArrayList<>();
		ArrayList<Integer> math = new ArrayList<>();
		ArrayList<Integer> sin = new ArrayList<>();
		ArrayList<Integer> ear = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("이름을 입력해 주세요");
			String sname = sc.next();
			if (sname.equals("끝")) {
				System.out.println("입력을 마무리합니다.");
				break;
			}
			System.out.println("점수를 입력해 주세요.");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			name.add(sname);
			kor.add(i, a);
			eng.add(i, b);
			math.add(i, c);
			sin.add(i, d);
			ear.add(i, e);
			System.out.println("이름 = " + name + " 점수 / 국어 =  " + kor + " 영어 = " + eng + " 수학 = " + math +
								" 과학 = " + sin + " 과학 = " + ear);
			System.out.println(" 이름 = " + name.get(i) + " 평균 = " + ((kor.get(i) + eng.get(i) + math.get(i) + sin.get(i) + ear.get(i))/5));
			
		}
		
		sc.close();
	
		
	}

}
