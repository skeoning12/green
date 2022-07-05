package toilet;

public class ToiletMain {
	public static void main(String[] args) {
		Toilet toilet = new Toilet();
		
		User user1 = new User("홍길동", toilet);
		User user2 = new User("임꺽정", toilet);
		User user3 = new User("일지매", toilet);
	
		
		user1.start();
		user2.start();
		user3.start();
	}
}
