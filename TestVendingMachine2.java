package test01;

import java.util.Scanner;

public class TestVendingMachine2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CoffieMenu();
		
		System.out.println("�ݾ��� �־��ּ���.");
		int money = sc.nextInt();
		String am = "�Ƹ޸�ī��";
		String cp = "īǪġ��";
		String cr = "ī���";
		String ag = "����ī��";
		int amprice = 3000;
		int cpprice = 4500;
		int crprice = 4000;
		int agprice = 5000;
		
		if(money >= 3000) {
			System.out.println("\t1." + am + " = " + amprice +
								"\n\t2." + cp + " = " + cpprice + 
								"\n\t3."+ cr + " = " + crprice +
								"\n\t4." + ag + " = " + agprice);
			System.out.println("�޴��� ������ �ּ���.");
			int num = sc.nextInt();
			if (num == 1) {
				Americano(money, amprice);
				System.out.println(Americano(money, amprice) + "��������");
			} else if(num == 2) {
				Cappuccino(money, cpprice);
				System.out.println(Cappuccino(money, cpprice) + "��������");
			} else if (num == 3) {
				CaffeLatte(money, crprice);
				System.out.println(CaffeLatte(money, crprice) + "��������");
			}
		
		} else {
			System.out.println("�ݾ��� �����ϴ�.");
		}
		
		
		
		sc.close();
	}

	
	static void CoffieMenu() {
		System.out.println("-----���Ǳ�-----");
		System.out.println("�޴�");
		System.out.println("\t1. �Ƹ޸�ī��(3000)\n\t2. īǪġ��(4500)\n\t3. ī���(4000)\n\t4. ����ī��(5000)");
	}
	
	static int Americano(int money, int amprice) {
		if (money > amprice) {
			money = money - amprice;
		} else {
			System.out.println("�ݾ��� �����ϴ�.");
		}
		
		return money;
	}
	
	static int Cappuccino(int money, int cpprice) {
		if (money > cpprice) {
			money = money - cpprice;
		} else {
			System.out.println("�ݾ��� �����ϴ�.");
		}
		return money;
	}
	
	static int CaffeLatte(int money, int crprice) {
		if (money > crprice) {
			money = money - crprice;
		} else {
			System.out.println("�ݾ��� �����ϴ�.");
		}
		
		return money;
	}
	
	static int Affogatto(int money, int agprice) {
		if (money > agprice) {
			money = money - agprice;
		} else {
			System.out.println("�ݾ��� �����ϴ�.");
		}	
		return money;
	}
	
	
	
	
	

}