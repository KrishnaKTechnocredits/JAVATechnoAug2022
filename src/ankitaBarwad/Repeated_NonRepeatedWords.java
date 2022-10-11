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
         Swati */
package ankitaBarwad;

public class Repeated_NonRepeatedWords {

	void printAllRepeatedWords(String inputString) {
		String[] input = inputString.split(" ");
		System.out.println("Duplicate words in given string are :");
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if ((input[i].equals(input[j])) && (i != j))
					System.out.println(input[i]);
			}
		}
	}

	void printAllNonRepeatedWords(String inputString) {
		String[] input = inputString.split(" ");
		System.out.println("Non-Duplicate words in given string are :");
		for (int i = 0; i < input.length; i++) {
			boolean flag = true;
			for (int j = 1; j < input.length; j++) {
				if ((input[i].equals(input[j])) && (i != j))
					flag = false;
			}
			if (flag) {
				System.out.println(input[i]);
			}
		}
	}

	public static void main(String[] args) {
		Repeated_NonRepeatedWords words = new Repeated_NonRepeatedWords();
		String inputString = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
		System.out.println("Input String : " + inputString + "\n");
		words.printAllRepeatedWords(inputString);
		System.out.print("\n");
		words.printAllNonRepeatedWords(inputString);
	}
}
