package nikitaPhase;

	
/* Program 1 : return sum of all the numbers from given String.
	input : i have 15 years and 3 months of experience.
	output : 18
	Hint : Exception handling, Interger.parseInt(string str) -> to convert string to int. 
			if we couldn't covert string to int for any word, it throws NumberFormatException.

	Program 2: return sum of all the digits from given String.
	input : i have 5 years and 5 months of experience.
	output : 9
	Hint : Using Exception handling*/
			 

public class Assignment_35 {
	
		// Program 1
			int returnSumOfNumbers(String input) {
				String[] inputArr = input.split(" ");
					int sum = 0;
					int num = 0;
					System.out.print("Sum of Numbers: -  ");
					for (int index = 0; index < inputArr.length; index++) {
						try {
							num = Integer.parseInt(inputArr[index]);
							System.out.print("\"" + num + "\"" + " ");
							sum = sum + num;
						} catch (NumberFormatException ne) {
						}
					}
					System.out.print(" is - ");
					return sum;
				}

				// Program 2:
			  int returnSumOfAllDigits(String input) {
					String[] inputArr = input.split(" ");
					int sum = 0;
					int num = 0;
					System.out.print("Sum of Digits: - ");
					// Outer for loop to traverse through all elements in array
					for (int index = 0; index < inputArr.length; index++) {
						// Inner for loop to find the digits in every array element
						for (int innerIndex = 0; innerIndex < inputArr[index].length(); innerIndex++) {
							try {
								char ch = inputArr[index].charAt(innerIndex);
								num = Integer.parseInt(String.valueOf(ch));
								System.out.print("\"" + num + "\"" + " ");
								sum = sum + num;
							} catch (NumberFormatException ne) {
							}
						}
					}
					System.out.print(" is - ");
					return sum;
				}

public static void main(String[] args) {
		Assignment_35 assignment35 = new  Assignment_35();
		String input = "I have 5 years and 5 months of experience";
		System.out.println("Input String: - " + input);
		System.out.println(" ");
		System.out.println(assignment35.returnSumOfNumbers(input));
		System.out.println(" ");
		System.out.println(assignment35.returnSumOfAllDigits(input));
   }
}
			
