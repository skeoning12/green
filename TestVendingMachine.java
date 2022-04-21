package test01;

import java.util.Scanner;


public class TestVendingMachine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		VendingMenu();
		int price = 0;
		int num = 0;
		System.out.println("�ݾ��� �־��ּ���");

		for (;;) {
			price = sc.nextInt();
			System.out.println(price + "��");

			if (price >= 3000) {
				switch (price / 1000) {
				case 10:
				case 5:
					MenuList();
					num = sc.nextInt();
					CoffieMenu(num, price);
					if (price < 3000) {
						System.out.println("�����ϽǼ� �ִ� �޴��� �����ϴ�.");
						System.out.println("��ȯ �ݾ� : " + price);
					}
					ReturnMoney(price);
				case 4:
					MenuList1();
					num = sc.nextInt();
					CoffieMenu1(num, price);
					if (price < 3000) {
						System.out.println("�����ϽǼ� �ִ� �޴��� �����ϴ�.");
						System.out.println("��ȯ �ݾ� : " + price);
					}
					ReturnMoney(price);
				case 3:
					MenuList2();
					num = sc.nextInt();
					CoffieMenu2(num, price);
					if (price < 3000) {
						System.out.println("�����ϽǼ� �ִ� �޴��� �����ϴ�.");
						System.out.println("��ȯ �ݾ� : " + price);
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
			System.out.println("�ܵ� : " + price);
			PriceZero();
		} 
	}
	
	static void MenuList() {
		System.out.println("\t1. �Ƹ޸�ī��(3000)\n\t2. īǪġ��(4500)\n\t3. ī���(4000)\n\t4 .����ī��(5000)");
		System.out.println("�޴��� �������ּ���.");
	}
	static void MenuList1() {
		System.out.println("\t1. �Ƹ޸�ī��(3000)\n\t3. ī���(4000)");
		System.out.println("�޴��� �������ּ���.");
	}
	static void MenuList2() {
		System.out.println("\t1. �Ƹ޸�ī��(3000)");
		System.out.println("�޴��� �������ּ���.");
	}
	
	static void VendingMenu() {
		System.out.println("-----���Ǳ�-----");
		System.out.println("�޴�");
		System.out.println("\t1. �Ƹ޸�ī��(3000)\n\t2. īǪġ��(4500)\n\t3. ī���(4000)\n\t4. ����ī��(5000)");
	}
	static int CoffieMenu(int num, int price) {
//		System.out.println("\t1. �Ƹ޸�ī��(3000)\n\t2. īǪġ��(4500)\n\t3. ī���(4000)\n\t4 .����ī��(5000)");
//		System.out.println("�޴��� �������ּ���.");
			
			if (num > 0 && num < 5) {
				if (num == 1) {
					Americano(num, price);
					Coffie();
					System.out.println("�ܵ� : " + Americano(num, price));
					price = Americano(num, price);
				} else
				if (num == 2) {
					Cappuccino(num, price);
					Coffie();
					System.out.println("�ܵ� : " + Cappuccino(num, price));
					price = Cappuccino(num, price);
				} else
				if (num == 3) {
					CaffeLatte(num, price);
					Coffie();
					System.out.println("�ܵ� : " + CaffeLatte(num, price));
					price = CaffeLatte(num, price);
				} else
				if (num == 4) {
					Affogato(num, price);
					Coffie();
					System.out.println("�ܵ� : " + Affogato(num, price));
					price = Affogato(num, price);
				}
			} else {
				System.out.println("�޴��� ���� �����Դϴ�.");
				CoffieMenu(num, price);
			}
			return price;
		
	}
	static int CoffieMenu1(int num, int price){
//		System.out.println("\t1. �Ƹ޸�ī��(3000)\n\t3. ī���(4000)");
//		System.out.println("�޴��� �������ּ���.");
//		
			if (num != 1 || num != 3) {
			}
			if (num == 1) {
				Americano(num, price);
				Coffie();
				System.out.println("�ܵ� : " + Americano(num, price));
				price = Americano(num, price);
			} else if (num == 3) {
				CaffeLatte(num, price);
				Coffie();
				System.out.println("�ܵ� : " + CaffeLatte(num, price));
				price = CaffeLatte(num, price);
			} else {
				System.out.println("�޴��� ���� �����Դϴ�.");
				CoffieMenu(num, price);
		}
		return price;
	
	}
	static int CoffieMenu2(int num, int price){
//		System.out.println("\t1. �Ƹ޸�ī��(3000)");
//		System.out.println("�޴��� �������ּ���.");
		
			if (num == 1) {
				Americano(num, price);
				Coffie();
				System.out.println("�ܵ� : " + Americano(num, price));
				price = Americano(num, price);
			} else {
				System.out.println("�޴��� ���� �����Դϴ�.");
				CoffieMenu(num, price);
		}
			return price;
	}
	
	static void PriceZero() {
		System.out.println("�ܾ��� �����մϴ�.");
	}
	
	static void Coffie() {
		System.out.println("�ֹ��Ͻ� Ŀ�ǰ� ���Խ��ϴ�.");
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
