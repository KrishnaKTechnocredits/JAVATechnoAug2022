/*Program 2: return sum of all the digits from given String.
input : i have 15 years and 3 months of experience.
output : 9
Hint : Using Exception handling*/

package manjiri.assignment35;

public class SumOfDigitsFromString {
	int getSumOfDigitsFromString(String str){
		String[] arr = str.split(" ");
		int sum = 0;
		int numDigit = 0;
		
		for (int index = 0; index < arr.length; index ++) {
			try {
				int num = Integer.parseInt(arr[index]);
				while(num != 0) {
					numDigit = num % 10;
					sum += numDigit;
					num = num /10;
				}	
			}catch(NumberFormatException ne) {
				//System.out.println("Cannot be converted to number");
			}	
		}
		return sum;
	}
	
	public static void main(String[] args) {
		String input = "i have 15 years and 3 months of experience.";
		int ans = new SumOfDigitsFromString().getSumOfDigitsFromString(input);
		System.out.println("Sum of Numbers in "+input+" is: " + ans );
	}
}
