/*Program 2: Print all the non repeated word in given string.
String str = "Maulik Puja Hindavi Shubham hindavi Shubham Titiksha Swati";
output : Maulik 
         Puja
         Titiksha
         Swati */
package adittyThakare.stringoperations;

public class Assignment25_Program2 {

	void printNonRepeatedWordsInString(String input) {
		String[] arr = input.split(" ");

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = 1; j < arr.length; j++) {
				if (arr[i].equalsIgnoreCase(arr[j]) && i != j) {
					count++;
					arr[j] = "";
				}
			}
			if (count == 1) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment25_Program2 assignment25 = new Assignment25_Program2();
		String input = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
		System.out.println("Print all the non-repeated word in given string!");
		System.out.println("\nInput string: "+input+"\nOutput:");
		assignment25.printNonRepeatedWordsInString(input);
	}
}
