package ch02;


class Friend{
	//�������
	String name;
	String phone;
	//����޼ҵ�
	void showInfo(){
		System.out.println("�̸� : " + name);
		System.out.println("��ȣ : " + phone);
			
	}

}
public class FunctionTest {
	// �Լ������� �׻� ()�� �ʿ�
	public static void main(String[] args) {
				// void = ����ִ� �ڷ���(���ǵ��� ���� �ڷ���)
		
		Friend f = new Friend();
		FunctionTest fn = new FunctionTest();
		f.name = "�ձ���";
		f.phone = "010-9077-1924";
		f.showInfo();
		fn.f();
	}

	public void f() {
		System.out.println("f�Լ��� ȣ��Ǿ����ϴ�.");
	}

	

}
