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
package nilamP;

public class StringOperations4 {
	void getRepeatedNames(String str) {
		String[] input = str.split(" ");
		for (int i = 0; i < input.length; i++) {
			boolean flag = true;
			for (int j = i + 1; j < input.length; j++) {
				if (input[i].equals(input[j]) && i != j) {
					System.out.println(input[i]);
				}
			}
		}
	}

	void getNonRepeatedNames(String str) {
		String[] input = str.split(" ");
		for (int i = 0; i < input.length; i++) {
			boolean flag = true;
			for (int j = 1; j < input.length; j++) {
				if (input[i].equals(input[j]) && i != j)
					flag = false;
			}
			if (flag) {
				System.out.println(input[i]);
			}
		}
	}

	public static void main(String[] args) {
		StringOperations4 so = new StringOperations4();
		String input = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
		System.out.println("Repeated Words are : ");
		so.getRepeatedNames(input);
		System.out.println("NonRepeated Words are : ");
		so.getNonRepeatedNames(input);
	}
}
