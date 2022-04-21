package ch02;


class Friend{
	//멤버변수
	String name;
	String phone;
	//멤버메소드
	void showInfo(){
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + phone);
			
	}

}
public class FunctionTest {
	// 함수옆에는 항상 ()가 필요
	public static void main(String[] args) {
				// void = 비어있는 자료형(정의되지 않은 자료형)
		
		Friend f = new Friend();
		FunctionTest fn = new FunctionTest();
		f.name = "손기응";
		f.phone = "010-9077-1924";
		f.showInfo();
		fn.f();
	}

	public void f() {
		System.out.println("f함수가 호출되었습니다.");
	}

	

}
