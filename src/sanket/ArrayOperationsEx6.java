/*Assignment - 25 : 20th Sep'2022

Program 1: Print all the repeated word in given string.
String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
output : Hindavi 
         Shubham 

Program 2: Print all the non repeated word in given string.
String str = "Maulik Puja Hindavi Shubham hindavi Shubham Titiksha Swati";
output : Maulik 
         Puja
         Titiksha
         Swati
*/

package sanket;

public class ArrayOperationsEx6 {

	void getRepeatString(String arr) {

		String[] tempInput = arr.split(" ");

		for (int index = 0; index < tempInput.length; index++) {
			String tempWord = tempInput[index];
			int count = 0;
			for (int j = index + 1; j < tempInput.length; j++) {
				if (tempWord.equals(tempInput[j])) {
					count++;
					break;
				}
			}
			if (count > 0) {
				System.out.println(tempInput[index]);
			}
		}
	}
	
	void getNonRepeatString(String arr) {

		String[] tempInput = arr.split(" ");

		for (int index = 0; index < tempInput.length; index++) {
			String tempWord = tempInput[index];
			int count = 0;
			for (int j = 0; j < tempInput.length; j++) {
				if (tempWord.equals(tempInput[j]) && (index != j)) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(tempInput[index]);
			}
		}
	}

	public static void main(String[] args) {

		String input = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
		ArrayOperationsEx6 arrayOperations = new ArrayOperationsEx6();
		System.out.println("The input String is : " + input);
		System.out.println("The repetitive word in given string is :");
		arrayOperations.getRepeatString(input);
		
		System.out.println("-----------------------------------------------");
		
		System.out.println("The input String is : " + input);
		System.out.println("The non-repetitive word in given string is :");
		arrayOperations.getNonRepeatString(input);
	}
}