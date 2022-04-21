package test01;

import java.util.Scanner;


public class TestVendingMachine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		VendingMenu();
		int price = 0;
		int num = 0;
		System.out.println("금액을 넣어주세요");

		for (;;) {
			price = sc.nextInt();
			System.out.println(price + "원");

			if (price >= 3000) {
				switch (price / 1000) {
				case 10:
				case 5:
					MenuList();
					num = sc.nextInt();
					CoffieMenu(num, price);
					if (price < 3000) {
						System.out.println("선택하실수 있는 메뉴가 없습니다.");
						System.out.println("반환 금액 : " + price);
					}
					ReturnMoney(price);
				case 4:
					MenuList1();
					num = sc.nextInt();
					CoffieMenu1(num, price);
					if (price < 3000) {
						System.out.println("선택하실수 있는 메뉴가 없습니다.");
						System.out.println("반환 금액 : " + price);
					}
					ReturnMoney(price);
				case 3:
					MenuList2();
					num = sc.nextInt();
					CoffieMenu2(num, price);
					if (price < 3000) {
						System.out.println("선택하실수 있는 메뉴가 없습니다.");
						System.out.println("반환 금액 : " + price);
					}
					ReturnMoney(price);
				}

				
			} else if (price < 3000) {
				break;
			}
			sc.close();
		}
	
	}
	static void ReturnMoney(int price) {
		if (price < 3000) {
			System.out.println("잔돈 : " + price);
			PriceZero();
		} 
	}
	
	static void MenuList() {
		System.out.println("\t1. 아메리카노(3000)\n\t2. 카푸치노(4500)\n\t3. 카페라떼(4000)\n\t4 .아포카토(5000)");
		System.out.println("메뉴를 선택해주세요.");
	}
	static void MenuList1() {
		System.out.println("\t1. 아메리카노(3000)\n\t3. 카페라떼(4000)");
		System.out.println("메뉴를 선택해주세요.");
	}
	static void MenuList2() {
		System.out.println("\t1. 아메리카노(3000)");
		System.out.println("메뉴를 선택해주세요.");
	}
	
	static void VendingMenu() {
		System.out.println("-----자판기-----");
		System.out.println("메뉴");
		System.out.println("\t1. 아메리카노(3000)\n\t2. 카푸치노(4500)\n\t3. 카페라떼(4000)\n\t4. 아포카토(5000)");
	}
	static int CoffieMenu(int num, int price) {
//		System.out.println("\t1. 아메리카노(3000)\n\t2. 카푸치노(4500)\n\t3. 카페라떼(4000)\n\t4 .아포카토(5000)");
//		System.out.println("메뉴를 선택해주세요.");
			
			if (num > 0 && num < 5) {
				if (num == 1) {
					Americano(num, price);
					Coffie();
					System.out.println("잔돈 : " + Americano(num, price));
					price = Americano(num, price);
				} else
				if (num == 2) {
					Cappuccino(num, price);
					Coffie();
					System.out.println("잔돈 : " + Cappuccino(num, price));
					price = Cappuccino(num, price);
				} else
				if (num == 3) {
					CaffeLatte(num, price);
					Coffie();
					System.out.println("잔돈 : " + CaffeLatte(num, price));
					price = CaffeLatte(num, price);
				} else
				if (num == 4) {
					Affogato(num, price);
					Coffie();
					System.out.println("잔돈 : " + Affogato(num, price));
					price = Affogato(num, price);
				}
			} else {
				System.out.println("메뉴에 없는 선택입니다.");
				CoffieMenu(num, price);
			}
			return price;
		
	}
	static int CoffieMenu1(int num, int price){
//		System.out.println("\t1. 아메리카노(3000)\n\t3. 카페라떼(4000)");
//		System.out.println("메뉴를 선택해주세요.");
//		
			if (num != 1 || num != 3) {
			}
			if (num == 1) {
				Americano(num, price);
				Coffie();
				System.out.println("잔돈 : " + Americano(num, price));
				price = Americano(num, price);
			} else if (num == 3) {
				CaffeLatte(num, price);
				Coffie();
				System.out.println("잔돈 : " + CaffeLatte(num, price));
				price = CaffeLatte(num, price);
			} else {
				System.out.println("메뉴에 없는 선택입니다.");
				CoffieMenu(num, price);
		}
		return price;
	
	}
	static int CoffieMenu2(int num, int price){
//		System.out.println("\t1. 아메리카노(3000)");
//		System.out.println("메뉴를 선택해주세요.");
		
			if (num == 1) {
				Americano(num, price);
				Coffie();
				System.out.println("잔돈 : " + Americano(num, price));
				price = Americano(num, price);
			} else {
				System.out.println("메뉴에 없는 선택입니다.");
				CoffieMenu(num, price);
		}
			return price;
	}
	
	static void PriceZero() {
		System.out.println("잔액이 부족합니다.");
	}
	
	static void Coffie() {
		System.out.println("주문하신 커피가 나왔습니다.");
	}
	
	static int Americano(int num, int price) {
		int americano = 3000;
			if(price >= americano) {
			price = price - americano;
			} else {
				price = americano - price;
				PriceZero();
				return price;
			}
		return price;
	}
	
	static int Cappuccino(int num, int price) {
		int cappuccino = 4500;
		if(num == 2) {
			if(price >= cappuccino) {
				price = price - cappuccino;
			} else {
				price = cappuccino - price;
				return price;
			}
		}
		return price;
	}

	static int CaffeLatte(int num, int price) {
		int caffelatte = 4000;
		if(num == 3) {
			if(price >= caffelatte) {
			price = price - caffelatte;
			} else {
				price = caffelatte - price;
				return price;
			}
		}
		return price;
	}
	
	static int Affogato(int num, int price) {
		int affogato = 5000;
		if(num == 4) {
			if(price >= affogato) {
				price = price - affogato;
			} else {
				price = affogato - price;
				return price;
			}
		}
		return price;
	}
}
