/*Assignment - 35 : 7th Oct'2022

Program 1 : return sum of all the numbers from given String.
input : i have 15 years and 3 months of experience.
output : 18
Hint : Exception handling, Interger.parseInt(string str) -> to convert string to int. 
if we couldn't covert string to int for any word, it throws NumberFormatException.
*/
package adittyThakare.exceptionHandling;

public class Assignment35_Program1 {

	int getSumOfNumbersFromString(String str) {
		int result = 0;
		String[] arr = str.split(" ");

		for (int index = 0; index < arr.length; index++) {
			try {
				int num = Integer.parseInt(arr[index]);
				result = result + num;
			} catch (NumberFormatException e) {
				// TODO: handle exception
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment35_Program1 assignment35_Program1 = new Assignment35_Program1();
		String str = "i have 15 years and 3 months of experience.";
		System.out.println("Input String: " + str);
		System.out
				.println("\nSum of numbers from given String: " + assignment35_Program1.getSumOfNumbersFromString(str));
	}

}
