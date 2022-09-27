package amolMule.array2;

/* Assignment - 26 : 21st Sep'2022
find out frequency of each character from given input using single while loop.
String str = "technocreditst";  */

public class ArrayProgram {

	void getFrequecyLetter(String str) {
		str = str.toLowerCase();
		while (str.length() - 1 > 0) {
			int originalLength = str.length();
			char ch = str.charAt(0);
			str = str.replace(Character.toString(ch), "");
			// str=str.replace(ch,' ');
			int newLength = str.length();
			int freq = originalLength - newLength;
			System.out.println("Charcter " + ch + " & Count is: " + freq);
		}
	}

	public static void main(String[] args) {
		ArrayProgram ap = new ArrayProgram();
		String input = "TechnoCredits";
		System.out.println("Frequency of each letter from from input tring is: " + input);
		ap.getFrequecyLetter(input);

	}

}
