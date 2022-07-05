package toilet;

public class User extends Thread {
	
	private String name;
	private Toilet toilet;
	

	public User(String name, Toilet toilet) {
		this.name = name;
		this.toilet = toilet;
	
	}

	@Override
	public void run() {
		toilet.useToilet(name);
	}
}
