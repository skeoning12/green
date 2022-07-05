package threadEx;

class ThreadEx extends Thread{
	private String name;
	
	public ThreadEx(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " : " + (i + 1));
		}
	}
}

public class ThreadTestMain {

	public static void f1() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("f1 : " + (i + 1));
		}

	}

	public static void f2() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("f2 : " + (i + 1));
		}

	}
	
	
	public static void main(String[] args) {
		
		ThreadEx t1 = new ThreadEx("손기응");
		ThreadEx t2 = new ThreadEx("응기손");
		
		try {
		t1.start();
		t1.join(); //join 메소드는 위에 메소드가 끝날때까지 기다리게하는 메소드
		t2.start();
		t2.join();
		} catch(InterruptedException e1) {
			e1.printStackTrace();
		}
		
		
		
//		f1();
//		f2();
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("main : " + (i +1));
		}
	}

}
