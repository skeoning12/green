package toilet;

public class Toilet {
	
	public void handWash(String name) {
		System.out.println(name + " 손을 씻는다.");
	}
	
	public void open(String name) {
		System.out.println(name + " 문을 엽니다.");
	}
	public void close(String name) {
		System.out.println(name + " 문을 닫습니다.");
	}
	public void privateWork(String name) {
		System.out.println(name + " 화장실 사용중");
	}
	
	public void useToilet(String name) {
		handWash(name);
		synchronized (this) {
			open(name);
			privateWork(name);
			close(name);
		}
		
	}

}
