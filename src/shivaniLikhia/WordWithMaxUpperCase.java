/*Program 3: Write a method to return word having maximum uppercase.
String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
output : FR3ienDs			 
*/
package shivaniLikhia;

public class WordWithMaxUpperCase {
	int getCountOfWordWithMaxUpperCase(String str) {
		int count = 0;
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
			if(Character.isUpperCase(ch)) {
				count++;
			}
		}
		return count;
	}
	String getWordWithMaxUpperCase(String input) {
		int maxCapsCount = 0;
		String maxCapsWord = "";
		String[] arr = input.split(" ");
		for(int index=0;index<arr.length;index++) {
			int maxCapsCount1 = getCountOfWordWithMaxUpperCase(arr[index]);
			if(maxCapsCount<maxCapsCount1) {
				maxCapsCount = maxCapsCount1;
				maxCapsWord = arr[index];
			}
		}
		return maxCapsWord;
	}
	public static void main(String[] args) {
		String name = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		System.out.println("The word with maximum uppercase in the given array is : ");
		System.out.println(new WordWithMaxUpperCase().getWordWithMaxUpperCase(name));
	}
	
}
