

/*
Return count of vowels in a given String.
input : maulik
output : 3
*/
package namratamishra.Array;
class StringCountofVowels {

	void getCountVowelsinStr(String str) {
		str = str.toLowerCase();
		int count = 0;

		for (int index = 0; index <= str.length() - 1; index++) {
			if (str.charAt(index) == 'a' || str.charAt(index) == 'e' || str.charAt(index) == 'i'
					|| str.charAt(index) == 'o' || str.charAt(index) == 'u')
				count++;

		}
		System.out.println("The no. of vowels in a given string " + str + " is :" + count);
	}

	public static void main(String[] args) {

		new StringCountofVowels().getCountVowelsinStr("MAULIK");

	}
}