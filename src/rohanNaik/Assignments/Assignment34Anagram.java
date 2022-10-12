/*Program 1 : How to check if two given String is the anagram of each other (using scanner class)?

Input1: catc
Input2: actc

Output: anagram
*/package rohanNaik.Assignments;

public class Assignment34Anagram {
	
	int getCharCount(String str, char ch) {
		int count = 0;
		for(int index = 0; index<str.length(); index++) {
			count = 0;
			if(str.charAt(index)== ch) {
				count++;
			}
		}
		
		
		return count;
	}
	
	boolean isAnagram(String input1, String input2) {
		if(input1.length() == input2.length()) {
			for(int index = 0; index<input1.length(); index++) {
				char ch = input1.charAt(index);
				int countch1 = getCharCount(input1,ch);
				int countch2 = getCharCount(input2,ch);
				if(countch1 != countch2) {
					return false;
				}

			}
		}
		else
			return false;
		
		return true;
	}
	
	
	public static void main(String[] args) {
		Assignment34Anagram obj = new Assignment34Anagram();
		boolean isAnagram = obj.isAnagram("catRohanca", "Rohanactca");
		if(isAnagram == true) {
			System.out.println("Anagram");
		}
		else
			System.out.println("Not Anagram");
	}

}
