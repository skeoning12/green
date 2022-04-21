package test01;

public class ScoreManage {

	public static void main(String[] args) {

		int[] scores = {83, 54, 62, 92, 49, 58, 77, 85, 36, 100};
		int count = 0;
		int total = 0;
		double avg = 0.0;
		
		for (int i = 0; i < scores.length; i++) {
			total = total + scores[i];
			avg = total * 1.0 / scores.length;
			
			if (scores[i] < 60) {
				count++;
			}
		
		}
	
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("60점 미만 점수 개수 : " + count);
	
		int max = scores[0];
		int min = scores[0];
		int nine = 0;
		int eight = 0;
		int seven = 0;
		int six = 0;
		int dum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if(scores[i] > max) {
				max = scores[i];
			} 

			if(scores[i] < min) {
				min = scores[i];
			}
			
			switch (scores[i]/10) {
			case 10: 
			case 9: nine++;
				break;
			case 8: eight++;
				break;
			case 7: seven++;
				break;
			case 6: six++;
				break;
			default: dum++;
				break; 
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("90점 이상 : " + nine);
		System.out.println("80점 이상 : " + eight);
		System.out.println("70점 이상 : " + seven);
		System.out.println("60점 이상 : " + six);
		System.out.println("60점 미만 : " + dum);
	
	}

}
