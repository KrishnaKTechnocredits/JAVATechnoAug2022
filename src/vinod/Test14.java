package vinod;

public class Test14 {
	void findRequiredNumber(int targetNumber) {
		int numCount =0, addition=0, startNumber=1;
		System.out.println("Total count number of required to get addition ad "+targetNumber+" is: ");
		while(addition<targetNumber) {
			addition = addition + startNumber;
			numCount++;
			startNumber++;
		}
		System.out.println(numCount);
		System.out.println(addition);
	}
	
	public static void main(String[] args) {
		Test14 test14 = new Test14();
		
		test14.findRequiredNumber(50);
		test14.findRequiredNumber(17);
	}

}
