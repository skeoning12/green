package horseRun;

public class Horse extends Thread{
	
	private String name;
	private HorseRun horseRun;
	
	public Horse(String name, HorseRun horseRun) {
		this.name = name;
		this.horseRun = horseRun;
	}
	
	@Override
	public void run() {
		//horseRun.first(name);
		horseRun.arrival(name);
	}
}
