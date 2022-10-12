/*Assignment - 35 : 7th Oct'2022
Program 1 : return sum of all the numbers from given String.
input : i have 15 years and 3 months of experience.
output : 18
Hint : Exception handling, Interger.parseInt(string str) -> to convert string to int. 
if we couldn't covert string to int for any word, it throws NumberFormatException.
Program 2: return sum of all the digits from given String.
input : i have 15 years and 3 months of experience.
output : 9
Hint : Using Exception handling
*/
package hemanshi;

public class Assignment_35 {
	
	int getSumOfNumberStringUsingException(String input) {
		System.out.println("INPUT STRING : "+input);
		String[] arr = input.split(" ");
		int sum = 0;
		int num = 0;
		for(int index=0;index<arr.length;index++) {
			try {
				num = Integer.parseInt(String.valueOf(arr[index]));
				sum = sum + num ;
				}catch(NumberFormatException nfe) {
			}
		}
		return sum;
	}
	


/* Program 2: return sum of all the digits from given String.
	input : i have 15 years and 3 months of experience.
	output : 9
	Hint : Using Exception handling*/
	
	
	int getSumOfAllDigitFromStringUsingException(String input) {
		System.out.println("Input String : "+input);
		String[] arr = input.split(" ");
		int sum = 0;
		int num = 0;
		for(int index=0;index<arr.length;index++) {
			for(int innerIndex=0;innerIndex<arr[index].length();innerIndex++) {
				try {
					char ch = arr[index].charAt(innerIndex);
					num = Integer.parseInt(String.valueOf(ch));
					sum = sum + num;
				}catch(NumberFormatException nfe){

				}
			}
		}
		return sum;
	}

	
	public static void main(String[] args) {
		Assignment_35 assignment_35 = new Assignment_35();
		
		
		System.out.println("\n***********************************************************************************");
		String input = "I have 15 years and 3 months of experience.";
		System.out.println("The sum of numbers in given String is : "+assignment_35.getSumOfNumberStringUsingException(input));
		
		
		System.out.println("\n***********************************************************************************");
		System.out.println("The sum os all the digit from the given String is : "+assignment_35.getSumOfAllDigitFromStringUsingException(input));

	}
}

