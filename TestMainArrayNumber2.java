package ch01;

import java.util.Scanner;

public class TestMainArrayNumber2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0; // �Է¹��� ����
		int mok = 0; // ��
		
		int remain = 0; // ������ ��
		int[] a = new int[5];
		System.out.println("5�ڸ� ���ڸ� �Է� >>>");
		num = sc.nextInt();
		mok = num;  // �򿡴ٰ� �Է°� ����
		System.out.println("��=" + mok);
		int i = a.length - 1; // 0���� �����ϱ⶧���� -1
		
		while(mok != 0) { // ���� 0�� �ƴҶ����� �ݺ�
			remain = mok % 10; // ����� = �Է°� ������ 10
			mok = mok / 10; // ���������� ����
			a[i] = remain; // ������� �迭�� ����
			i--; //(�Է°��� ���������� �����ϱ����� ������ i--;
		}
			
		for (int j = 0; j < a.length; j++) {
			System.out.println("a[" + j + "] =" + a[j]);
		}
		
		sc.close();
	}

}
