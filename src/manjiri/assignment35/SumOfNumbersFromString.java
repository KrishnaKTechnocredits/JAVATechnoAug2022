/*Program 1 : return sum of all the numbers from given String.
input : i have 15 years and 3 months of experience.
output : 18
Hint : Exception handling, Interger.parseInt(string str) -> to convert string to int. 
if we couldn't covert string to int for any word, it throws NumberFormatException.*/

package manjiri.assignment35;

public class SumOfNumbersFromString {
	
	int getSumOfNumbersFromString(String str){
		String[] arr = str.split(" ");
		int sum = 0;
		for (int index = 0; index < arr.length; index ++) {
			try {
				int num = Integer.parseInt(arr[index]);
				sum += num;
			}catch(NumberFormatException ne) {
				//System.out.println("Cannot be converted to number");
			}	
		}
		return sum;
	}
	
	public static void main(String[] args) {
		String input = "i have 15 years and 3 months of experience.";
		int ans = new SumOfNumbersFromString().getSumOfNumbersFromString(input);
		System.out.println("Sum of Numbers in "+input+" is: " + ans );
	}
}
