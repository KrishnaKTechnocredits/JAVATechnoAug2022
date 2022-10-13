package gauravSahu.Practice;

public class Practice1 {
	
	
	void getMissingNum(int[] input, int range) {
		int actualsum = range*(range+1)/2;
		int expectedsum = 0;
		for(int num : input) {
			expectedsum += num;
		}System.out.println("Missing number is : " + (actualsum - expectedsum));
		
	}
	
	public static void main(String[] args) {
		Practice1 p1 = new Practice1();
		int[] input = {1,2,4,5};
		int range = 5;
		p1.getMissingNum(input,range);
	}

}
