package ch01;

import java.util.Scanner;

public class TestMainSit {

	public static void main(String[] args) {
		//�¼� ���� ���α׷�
		Scanner sc = new Scanner(System.in);
		
		int[] sit = new int[10];
		
		System.out.println("---�¼� ���� ���α׷�---");
		for (int i = 0; i < sit.length; i++) {
			System.out.print(i + 1 + "\t");
		}
		System.out.println();
		for (int i = 0; i < sit.length; i++) {
			System.out.print(sit[i] + "\t");
		}
		System.out.println();
		
		//������ �¼��� ���� = �迭
		int num = 0;
		for (int k = 0; k < 100; k++) {
			
			System.out.println("\n������ �¼��� �Է����ּ���.");
			num = sc.nextInt();
			if(num > 10 || num <= 0) {
				System.out.println("�ش�Ǵ� �ڼ���ȣ�� �����ϴ�.");
			} else {
				if (sit[num-1] == 0) {
					System.out.println(num + "�� �¼��� ����Ǿ����ϴ�.");
					sit[num-1] = 1;
				} else {
					System.out.println(num + "�� �¼��� �̹� ����Ǿ� �ֽ��ϴ�.");
					
				}
				
				for (int i = 0; i < sit.length; i++) {
					System.out.print(i + 1 + "\t");
				}
				System.out.println();
				
				for (int i = 0; i < sit.length; i++) {
					System.out.print(sit[i] + "\t");
				}
			}
			if(sit.length < k) {
				System.out.println("\n������ �� �ִ� �¼��� �����ϴ�.");
				break;
			}
			
		}
		sc.close();
	}

}
