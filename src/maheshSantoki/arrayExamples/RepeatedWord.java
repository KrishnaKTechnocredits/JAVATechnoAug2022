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
         Swati   */
package maheshSantoki.arrayExamples;

public class RepeatedWord {
	// Print all the repeated word in given string.
	void repeatWord(String input) {
		String arr[] = input.split(" ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					System.out.println(arr[i]);
				}
			}
		}
	}

	// Print all the non repeated word in given string.
	void nonRepeatedWord(String input) {
		String arr[] = input.split(" ");
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for (int j = 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j]) && (i!=j)) {
					flag = false;
				}
			}
			if (flag) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {

		String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";

		RepeatedWord repeatedword = new RepeatedWord();
		System.out.println("--> Repeated Words : ");
		repeatedword.repeatWord(str);
		System.out.println("--> Non-Repeated Words : ");
		repeatedword.nonRepeatedWord(str);
	}
}
