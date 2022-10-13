/*Program 4 :
Return count of digits from given String without using isDigit method of Character class..

input : te1chno2cre4di6ts 
output : 4*/

package manjiri.assignment36;

public class CountOfDigitsFromString {
	
	int getCountOfDigits(String str){
		int count = 0;
		
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			
			if(ch >= 48 && ch <= 57) {//check whether char is in ascii range of 0-9
				count++;
			}
		}	
		return count;
	}
	
	public static void main(String[] args) {
		String input = "te1chno2cre4di6ts";
		System.out.println("Count of Digits in "+input+" is: " + new CountOfDigitsFromString().getCountOfDigits(input));
	}
}
