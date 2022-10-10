/*Program 5 : 
Return character holding given Ascii value.
input : 69
output : E*/

package swatiM.assignments.ascii;

public class Assignment36_Program5 {

	char getCharacterOfGivenAsciiValue(int asciiNum) {
		char ch = (char) asciiNum;
		return ch;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment36_Program5 assignment36_Program5 = new Assignment36_Program5();
		int asciiNum = 69;
		System.out.println("Given ASCII --> " + asciiNum);
		System.out.println("Corresponding character --> " + assignment36_Program5.getCharacterOfGivenAsciiValue(asciiNum));
	}


}
