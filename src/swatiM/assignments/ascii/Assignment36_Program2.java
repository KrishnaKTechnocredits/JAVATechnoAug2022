/*Program 2 : 
WAP to return ascii of given character.
input : C
output : 67*/
package swatiM.assignments.ascii;

public class Assignment36_Program2 {

	int getAsciiOfGivenChar(char ch) {

		int asciiNum = ch;
		return asciiNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment36_Program2 assignment36_Program2 = new Assignment36_Program2();
		char ch = 'C';
		System.out.println("Character --> " + ch);
		System.out.println("ASCII value is --> " + assignment36_Program2.getAsciiOfGivenChar(ch));
	}

}
