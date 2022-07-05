package horseRun;

public class HorseMain {

	public static void main(String[] args) {
		HorseRun horseRun = new HorseRun();
		
		Horse horse1 = new Horse("1번마", horseRun);
		Horse horse2 = new Horse("2번마", horseRun);
		Horse horse3 = new Horse("3번마", horseRun);
		
	
		horse1.start();
		horse2.start();
		horse3.start();
	}

}
