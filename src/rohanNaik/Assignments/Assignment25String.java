/*Program 1: Print all the repeated word in given string.
String str = "Maulik rohan Puja Hindavi Shubham Hindavi Shubham Titiksha Swati rohan rohan";
output : Hindavi 
         Shubham
         
Program 2: Print all the non repeated word in given string.
String str = "Maulik Puja Hindavi Shubham hindavi Shubham Titiksha Swati";
output : Maulik 
         Puja
         Titiksha
         Swati 

*/
package rohanNaik.Assignments;

public class Assignment25String {

	void nonRepeatedWords(String input2) {
		String[] arr = input2.split(" ");

		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			boolean flag = false;
			for (int i = 0; i < arr.length; i++) {
				if (index == i) {
					i++;
				}
				if(str.equals(arr[i])) {
					flag = false;
					break;
				}
				else
					flag = true;					
			}
			if(flag == true)
				System.out.println(str);
		}
	}

	void repeatedWords(String input) {

		String[] arr = input.split(" ");

		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];

			for (int i = 0; i < arr.length; i++) {

				if (index == i) {
					i++;
				}
				if (i < arr.length)
					if (str.equals(arr[i])) {
						if (index < i)
							System.out.println(str);
					}

			}
		}

	}

	public static void main(String[] args) {
		Assignment25String obj = new Assignment25String();

		String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati rohan rohan";
		System.out.println("Repeated words are : ");
		obj.repeatedWords(str);
		System.out.println("---------------------------------------");
		System.out.println("Non Repeated words are : ");
		obj.nonRepeatedWords(str);

	}

}
