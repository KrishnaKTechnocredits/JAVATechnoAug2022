/*
5) Return count of vowels in a given String.
input : maulik
output : 3
*/
package akankshaVyas.ArrayWork;

public class CountVowelString {

	int getVowelCount(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == 'a' || str.charAt(index) == 'e' || str.charAt(index) == 'i'
					|| str.charAt(index) == 'o' || str.charAt(index) == 'u') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("count of vowels in a given String");
		System.out.println(new CountVowelString().getVowelCount("maulik"));
		System.out.println(new CountVowelString().getVowelCount("aaradhy"));
	}

}
