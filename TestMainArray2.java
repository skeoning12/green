package ch01;

import java.util.Random;

public class TestMainArray2 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		Random rdice = new Random();
	;
		int[] num = new int[6];
		for (int i = 0; i < 10; i++) {
			int dice = rd.nextInt(6) +1;
			num[dice-1] = num[dice-1] + 1;
//			if(dice==1) {
//				System.out.println("1 ���Խ��ϴ�.");
//				num[0]++;
//				//continue;
//			} else if(dice==2){
//				System.out.println("2 ���Խ��ϴ�.");
//				num[1]++;
//				//continue;
//			} else if(dice==3) {
//				System.out.println("3 ���Խ��ϴ�.");
//				num[2]++;
//				//continue;
//			} else if(dice==4) {
//				System.out.println("4 ���Խ��ϴ�.");
//				num[3]++;
//				//continue;
//			} else if(dice==5) {
//				System.out.println("5 ���Խ��ϴ�.");
//				num[4]++;
//				//continue;
//			} else {
//				System.out.println("6 ���Խ��ϴ�.");
//				num[5]++;
//				//continue;
//			}
		}
			System.out.println("-----------���------------");
			System.out.println(num[0] + "�� ���Խ��ϴ�.");
			System.out.println(num[1] + "�� ���Խ��ϴ�.");
			System.out.println(num[2] + "�� ���Խ��ϴ�.");
			System.out.println(num[3] + "�� ���Խ��ϴ�.");
			System.out.println(num[4] + "�� ���Խ��ϴ�.");
			System.out.println(num[5] + "�� ���Խ��ϴ�.");
			System.out.println("�� Ƚ��");
			System.out.println(num[0] + num[1] + num[2] + num[3] + num[4] + num[5]);
			System.out.println("--------------------");
	
		int[] num2 = new int[6];
		
		for (int i = 0; i < 10; i++) {
			int num3 = rdice.nextInt(6)+1;
			
			switch(num3) {
				case 6:
					num2[5]++;
					break;
				case 5:
					num2[4]++;
					break;
				case 4:
					num2[3]++;
					break;
				case 3:
					num2[2]++;
					break;
				case 2:
					num2[1]++;
					break;
				case 1:
					num2[0]++;
					break;
			}
		}
			System.out.println(num2[0]+"���Խ��ϴ�.");
			System.out.println(num2[1]+"���Խ��ϴ�.");
			System.out.println(num2[2]+"���Խ��ϴ�.");
			System.out.println(num2[3]+"���Խ��ϴ�.");
			System.out.println(num2[4]+"���Խ��ϴ�.");
			System.out.println(num2[5]+"���Խ��ϴ�.");
			System.out.println("����Ƚ��-------------------------------------");
			System.out.println(num2[0]+num2[1]+num2[2]+num2[3]+num2[4]+num2[5]);
	}

}
