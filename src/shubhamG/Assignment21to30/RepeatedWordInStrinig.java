package shubhamG.Assignment21to30;

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

public class RepeatedWordInStrinig {

	void getRepeatedWord(String str) {
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					if (arr[j].equals(arr[i])) {
						count++;
					}
				} else if (i == j) {
					count = 0;
				}
			}
			if (count > 0)
				System.out.println(arr[i]);
		}
	}

	void getNonRepeatedWord(String str) {
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					if (arr[j].equals(arr[i])) {
						count++;
					}
				}
			}
			if (count == 0)
				System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		RepeatedWordInStrinig repeat = new RepeatedWordInStrinig();

		String str1 = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
		System.out.println("Repeated words in the given string are : ");
		repeat.getRepeatedWord(str1);

		System.out.println("\nNon Repeated words in the given string are : ");
		repeat.getNonRepeatedWord(str1);
	}
}
