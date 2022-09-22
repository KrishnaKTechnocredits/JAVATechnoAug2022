/*
Assignment - 26 : 21st Sep'2022
find out frequency of each character from given input using single while loop.
String str = "Hemanshi";
 */


package hemanshi;

public class Assignment_26 {
	
	void getFrequencyOfChar(String name) {
		name = name.toLowerCase();

		while (name.length() > 0) {
			char ch = name.charAt(0);
			int orignalLength = name.length();
			name = name.replace(ch + "", "");
			int newLength = name.length();
			System.out.println(ch + " Frequency -> " + (orignalLength - newLength));
		}
	}

	public static void main(String[] args) {
		Assignment_26 assignment_26 = new Assignment_26();
		assignment_26.getFrequencyOfChar("Hemanshi");
	}


}
