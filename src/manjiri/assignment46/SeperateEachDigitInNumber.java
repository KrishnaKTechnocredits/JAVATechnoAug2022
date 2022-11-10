/*Java Program To Separate Each Digit From Number*/

package manjiri.assignment46;

public class SeperateEachDigitInNumber {
	void getEachDigitFromNumber(int num){
		int temp = 0;
		while(num > 0) {
			temp = num%10;
			num = num/10;
			System.out.print(temp + " ");
		}
	}
	
	void getEachDigitFromNumberOrderMaintained(int num){
		System.out.println();
		int temp = 0;
		int rem = 0;
		while(num > 0) {
			rem = num %10; //123
			temp = temp*10 + rem;
			num = num/10;
		}
		getEachDigitFromNumber(temp);
	}
	
	public static void main(String[] args) {
		SeperateEachDigitInNumber seperateDigit = new SeperateEachDigitInNumber();
		seperateDigit.getEachDigitFromNumber(1238798);
		seperateDigit.getEachDigitFromNumberOrderMaintained(9878974);
	}
}
