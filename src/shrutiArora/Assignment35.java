/* Assignment - 35 : 7th Oct'2022

Program 1 : return sum of all the numbers from given String.
input : i have 15 years and 3 months of experience.
output : 18
Hint : Exception handling, Interger.parseInt(string str) -> to convert string to int. 
if we couldn't covert string to int for any word, it throws NumberFormatException.

Program 2: return sum of all the digits from given String.
input : i have 15 years and 3 months of experience.
output : 9
Hint : Using Exception handling*/
package shrutiArora;
public class Assignment35 {
	int getSumOfNumbersFromString(String str){
		String[] arr = str.split(" ");
		int sum = 0;
		for (int index = 0; index < arr.length; index ++) {
			try {
				int num = Integer.parseInt(arr[index]);
				sum += num;
			}catch(NumberFormatException ne) {
				//System.out.println("String can't be converted to number");
			}	
		}
		return sum;
	}
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
				//System.out.println(" String Can't be converted to number");
			}	
		}
		return sum;
	}
	public static void main(String[] args) {
		Assignment35 a35 = new Assignment35();
		System.out.println("***************************************************************Program-1*********************************************");
		String str1 = "i have 15 years and 3 months of experience.";
		System.out.println("input: " + str1);
		int sum = a35.getSumOfNumbersFromString(str1);
		System.out.println( "Output: " +sum);
        System.out.println("***************************************************************Program-2*********************************************");
		System.out.println("input: " + str1);
		int sumOfDigit = a35.getSumOfDigitsFromString(str1);
		System.out.println("output:" + sumOfDigit);
	}
}