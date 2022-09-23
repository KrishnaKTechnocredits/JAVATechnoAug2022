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
package asthaSrivastava.array.split;

class RepeatedWords {

	//method to find all repeated words
	void printRepeatedWord(String name) {
		String arr[] = name.split(" ");
		int count;
		System.out.println("All the repeated word in given string :");
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					count++;

				}
			}
			if (count > 1)
				System.out.println(arr[i]);

		}
	}

	//method to find non repeated words 
	
	void printNonRepeatedWord(String word) {
		String arr[] = word.split(" ");
		int count;
		System.out.println("All the non repeated word in given string :");
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					count++;
					arr[j]="";

				}
			}
			if (count == 1 && arr[i] != "" )
				System.out.println(arr[i]);

		}
	}
		
	
	public static void main(String[] args) {
		RepeatedWords test = new RepeatedWords();
		String input = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
		test.printRepeatedWord(input);
		System.out.println("--------------");
		test.printNonRepeatedWord(input);

	}
}
