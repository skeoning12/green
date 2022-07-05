package horseRun;

public class HorseRun {
	
	public void first(String name) {
		System.out.println(name + " 도착");
	}
	
	public void second(String name) {
		System.out.println(name + " 도착");
	}
	
	public void third(String name) {
		System.out.println(name + " 도착");
	}
	
	public synchronized void arrival(String name) {
		first(name);
		//second(name);
		//third(name);
		
	}
}
