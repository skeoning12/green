package test01;

import java.util.Scanner;

public class TestVendingMachine2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CoffieMenu();
		
		System.out.println("금액을 넣어주세요.");
		int money = sc.nextInt();
		String am = "아메리카노";
		String cp = "카푸치노";
		String cr = "카페라떼";
		String ag = "아포카토";
		int amprice = 3000;
		int cpprice = 4500;
		int crprice = 4000;
		int agprice = 5000;
		
		if(money >= 3000) {
			System.out.println("\t1." + am + " = " + amprice +
								"\n\t2." + cp + " = " + cpprice + 
								"\n\t3."+ cr + " = " + crprice +
								"\n\t4." + ag + " = " + agprice);
			System.out.println("메뉴를 선택해 주세요.");
			int num = sc.nextInt();
			if (num == 1) {
				Americano(money, amprice);
				System.out.println(Americano(money, amprice) + "남은가격");
			} else if(num == 2) {
				Cappuccino(money, cpprice);
				System.out.println(Cappuccino(money, cpprice) + "남은가격");
			} else if (num == 3) {
				CaffeLatte(money, crprice);
				System.out.println(CaffeLatte(money, crprice) + "남은가격");
			}
		
		} else {
			System.out.println("금액이 적습니다.");
		}
		
		
		
		sc.close();
	}

	
	static void CoffieMenu() {
		System.out.println("-----자판기-----");
		System.out.println("메뉴");
		System.out.println("\t1. 아메리카노(3000)\n\t2. 카푸치노(4500)\n\t3. 카페라떼(4000)\n\t4. 아포카토(5000)");
	}
	
	static int Americano(int money, int amprice) {
		if (money > amprice) {
			money = money - amprice;
		} else {
			System.out.println("금액이 적습니다.");
		}
		
		return money;
	}
	
	static int Cappuccino(int money, int cpprice) {
		if (money > cpprice) {
			money = money - cpprice;
		} else {
			System.out.println("금액이 적습니다.");
		}
		return money;
	}
	
	static int CaffeLatte(int money, int crprice) {
		if (money > crprice) {
			money = money - crprice;
		} else {
			System.out.println("금액이 적습니다.");
		}
		
		return money;
	}
	
	static int Affogatto(int money, int agprice) {
		if (money > agprice) {
			money = money - agprice;
		} else {
			System.out.println("금액이 적습니다.");
		}	
		return money;
	}
	
	
	
	
	

}