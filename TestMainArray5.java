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
			System.out.println("�̸��� �Է��� �ּ���");
			String sname = sc.next();
			if (sname.equals("��")) {
				System.out.println("�Է��� �������մϴ�.");
				break;
			}
			System.out.println("������ �Է��� �ּ���.");
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
			System.out.println("�̸� = " + name + " ���� / ���� =  " + kor + " ���� = " + eng + " ���� = " + math +
								" ���� = " + sin + " ���� = " + ear);
			System.out.println(" �̸� = " + name.get(i) + " ��� = " + ((kor.get(i) + eng.get(i) + math.get(i) + sin.get(i) + ear.get(i))/5));
			
		}
		
		sc.close();
	
		
	}

}
