package ch01;

import java.util.Scanner;

public class TestMainSit {

	public static void main(String[] args) {
		//좌석 예매 프로그램
		Scanner sc = new Scanner(System.in);
		
		int[] sit = new int[10];
		
		System.out.println("---좌석 예매 프로그램---");
		for (int i = 0; i < sit.length; i++) {
			System.out.print(i + 1 + "\t");
		}
		System.out.println();
		for (int i = 0; i < sit.length; i++) {
			System.out.print(sit[i] + "\t");
		}
		System.out.println();
		
		//예매할 좌석을 선택 = 배열
		int num = 0;
		for (int k = 0; k < 100; k++) {
			
			System.out.println("\n예약할 좌석을 입력해주세요.");
			num = sc.nextInt();
			if(num > 10 || num <= 0) {
				System.out.println("해당되는 자석번호가 없습니다.");
			} else {
				if (sit[num-1] == 0) {
					System.out.println(num + "번 좌석이 예약되었습니다.");
					sit[num-1] = 1;
				} else {
					System.out.println(num + "번 좌석은 이미 예약되어 있습니다.");
					
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
				System.out.println("\n예약할 수 있는 좌석이 없습니다.");
				break;
			}
			
		}
		sc.close();
	}

}
