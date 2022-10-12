/*Assignment - 25 : 20th Sep'2022

Program 1: Print all the repeated word in given string.
String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
output : Hindavi 
         Shubham 	 */

package pankajBhatt;

public class Assignment25_P1_20Sep2022 {
	
	void getRepeatedWords(String str) {
		String[] arr = str.split(" ");
		for(int index = 0; index < arr.length; index++ ) {
			for(int index1 = index+1; index1 < arr.length; index1++ ) {
				if(arr[index].equals(arr[index1])) {
					System.out.println(arr[index]);
				}
			}
		}
	}

	public static void main(String[] args) {
		String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
		Assignment25_P1_20Sep2022 assignment25_20Sep2022 = new Assignment25_P1_20Sep2022();
		assignment25_20Sep2022.getRepeatedWords(str);
	}
}
