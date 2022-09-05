/*Test2 4th September
 * findRequiredNumbers(50);

input : 50
output : 10

input : 17
output : 6

1+2+3+4+5+6+7+8+9+10 = 55*/
package adittyThakare.basicconcepts;

public class Test2 {
	
	void findRequiredNumbers(int targetNumber) {
		int numCount=0, addition=0, startNumber=1;
		
		System.out.println("Total count of numbers required to get addition as "+targetNumber+" is: ");
		
		while(addition<targetNumber) {
			addition = addition + startNumber;
			numCount++;
			startNumber++;
		}
		System.out.println(numCount);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 test2 = new Test2();
		
		test2.findRequiredNumbers(50);
		test2.findRequiredNumbers(17);
	}

}
