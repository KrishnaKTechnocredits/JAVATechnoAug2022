/* 5) Return count of vowels in a given String.
input : maulik
output : 3

6) Write a method to count vowels of each name in given array.
input : {"Ashish","Aditty","Manjiri","Ankita"}
output : Ashish -> 2
         Aditty -> 2
		 Manjiri -> 3
		 Ankita -> 3
 */
package harshalRane.Assignments.assignment20;

public class Assignment20Program5And6 {
	private int getCountOfVovels(String name) {
		int count = 0;
		name = name.toLowerCase();

		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == 'a' || name.charAt(index) == 'e' || name.charAt(index) == 'i'
					|| name.charAt(index) == 'o' || name.charAt(index) == 'u') {
				count++;
			}
		}
		return count;
	}

	int[] getCountOfVovelsArray(String[] name) {
		int[] output = new int[name.length];
		for (int index = 0; index < name.length; index++) {
			output[index] = getCountOfVovels(name[index]);
		}
		return output;
	}

	void display(String[] name, int[] output) {
		for (int index = 0; index < name.length; index++) {
			System.out.println("---------------------");
			System.out.println(name[index] + "--->" + output[index]);
		}
	}

	public static void main(String[] args) {
		Assignment20Program5And6 a = new Assignment20Program5And6();

		System.out.println("Count of vowels in a given String \"Maulik\" are: --->" +a.getCountOfVovels("Maulik"));

		String[] input = { "Ashish", "Aditty", "Manjiri", "Ankita" };
		int[] output = a.getCountOfVovelsArray(input);
		a.display(input, output);
	}
}
