/*Program 1 : 
//WAP to return String by encrypting all characters from given string by its next character.

//input : apdz
//output : bqea*/
package akankshaSharma.assignment36;

public class Program1 {
	String processedString(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'Z') {
				output = output + 'A';
			} else if (ch == 'z') {
				output = output + 'a';
			} else {
				if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
					ch++;
				}
				output = output + ch;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Program1 test = new Program1();
		String input = "apdz";
		String output = test.processedString(input);
		System.out.println(output);
	}

}
