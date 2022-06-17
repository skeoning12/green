package main;

import java.util.Scanner;

import db.RoomService;

public class Reservation_Main {

	public static void main(String[] args) throws Exception {
		
		RoomService rs = new RoomService();
		Scanner sc = new Scanner(System.in);
		int key = 0;
		while(true) {
			rs.loginMenu();
			key = sc.nextInt();
			switch (key) {
			case 1:
				rs.login();
				break;
			case 2:	
				rs.signUp();
				break;
			case 3:
				System.out.println("프로그램 종료");
				return;
			}
		}

		
	}

}
