package ch01;

import java.util.Scanner;

public class TestMain9 {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner (System.in);
		int[] scores = new int[10];
		double avg = 0.0;
		int tot = 0;
		int dum = 0;
		
		for(int i=0; i<10;i++) {
			System.out.println(i+1 + "���� �л��� ������ �Է����ּ���");
			int count = sc.nextInt();
			
			if(count > 100) {
				System.out.println("�Է°��� �ʰ��Ͽ����ϴ�.");
				scores[i] = 0;
				dum++;
			} else {
				scores[i] = count;
				tot = tot + scores[i];
				
				if(scores[i] < 60) {
					dum++;
				}
			}
			
			
		}
		int m = 0;
		for (int j = 0; j < scores.length; j++) {
			for (int p = j+1; p < scores.length; p++) {
				if(scores[p] > scores[j]) {
					m = scores[p];
					scores[p] = scores[j];
					scores[j] = m;
				}
			}
		}
		
		for (int k = 0; k < scores.length; k++) {
			System.out.print("�ִ밪 ������ ���� = " + scores[k] + "\t");
		}
		System.out.println();
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + "\t");
		}
		
		avg = tot * 1.0 / scores.length;
		System.out.println();
		System.out.println("�� ���� ���� = " + tot);
		System.out.println("�� ���� ��� = " + avg);
		System.out.println("�� ���� �����л� �� = " + dum);
		
		
	sc.close();
	}

}
