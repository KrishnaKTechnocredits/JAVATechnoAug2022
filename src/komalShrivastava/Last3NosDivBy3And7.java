package komalShrivastava;

public class Last3NosDivBy3And7 {

	void last3NosDivBy3and7(int start, int end){
		int count = 0;
		System.out.println("Last 3 Numbers divisible by 3 and 7 in the range " + start + ":" + end);
		for (int i=end; i>=start; i--) {
			if (i%3==0 && i%7==0) {
				count++;
				System.out.println(i + " ");
			}
			if(count == 3)
				break;
		}
	}
	
	public static void main(String[] args) {
		new Last3NosDivBy3And7().last3NosDivBy3and7(10, 200);
	}
}