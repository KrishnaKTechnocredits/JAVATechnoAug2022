/*5) Return count of vowels in a given String.
input : maulik
output : 3
6) Write a method to count vowels of each name in given array.
input : {"Ashish","Aditty","Manjiri","Ankita"}
output : Ashish -> 2
         Aditty -> 2
		 Manjiri -> 3
		 Ankita -> 3
		 
		 
7) Write a method to return name having maximum length.
input : {"Ashish","Aditty","Manjiri","Ankita","Credits"}
output : Credits
		 
*/
package asthaSrivastava.arrayBasics;

public class Vowels {

	int getCountOfVowels(String str) { // Program 5 and 6
		int count = 0;
		str = str.toLowerCase();
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}

		return count;
	}

	String getMaxLength(String[] name) { //Program 7

		int maxLength = name[0].length();
		String maxLengthName = name[0];
		for (int index = 0; index < name.length; index++) {
			if (maxLength < name[index].length()) {
				maxLengthName = name[index];
			}

		}
		return maxLengthName;
	}

	public static void main(String[] args) {

		int result = new Vowels().getCountOfVowels("maulik");
		System.out.println("Count of Vowels in given String maulik is " + result);
		System.out.println("-----------------");
		
		String[] output = { "Ashish", "Aditty", "Manjiri", "Ankita" };
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i] + "->" + new Vowels().getCountOfVowels(output[i]));
		}
		System.out.println("-----------------");

		String[] input = { "Ashish", "Aditty", "Manjiri", "Ankita", "Credits" };
		System.out.println("Max Length name is "+new Vowels().getMaxLength(input));

	}

}
