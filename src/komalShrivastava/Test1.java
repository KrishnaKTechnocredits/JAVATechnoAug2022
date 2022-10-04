package komalShrivastava;

public class Test1 {

	void divibleBy3and7(int start, int end) {
		System.out.println("First 3 numbers divisble by 3 and 7 in the range " + start + " : " + end + " are ");
		int count = 0;
		for(int index = start; index<=end; index++) {
			if(count >= 3)
				break;
			else if(index%3==0 && index%7==0) {
				count++;
				System.out.println(index + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.divibleBy3and7(20, 100);
	}
}