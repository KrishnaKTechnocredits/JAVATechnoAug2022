
/*Write a method to count vowels of each name in given array.
input : {"Ashish","Aditty","Manjiri","Ankita"}
output : Ashish -> 2
         Aditty -> 2
		 Manjiri -> 3
		 Ankita -> 3
*/
package namratamishra.Array;

class ArrayCountofVowels {

	int getCountVowelsArray(String str) {
		str = str.toLowerCase();
		int count = 0;

		for (int index = 0; index <= str.length() - 1; index++) {

			if (str.charAt(index) == 'a' || str.charAt(index) == 'e' || str.charAt(index) == 'i'
					|| str.charAt(index) == 'o' || str.charAt(index) == 'u')
				count++;
		}
		return count;

	}

	public static void main(String[] args) {

		String[] input = { "Ashish", "Aditty", "Manjari", "Ankita" };
		for (int i = 0; i < input.length; i++) {

			ArrayCountofVowels acv = new ArrayCountofVowels();
			int count = acv.getCountVowelsArray(input[i]);
			System.out.println(input[i] + ".....>" + count);
		}
	}
}