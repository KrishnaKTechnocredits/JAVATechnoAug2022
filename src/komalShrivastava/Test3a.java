/*Program 1 :
Return middle character of max length String from given array.
input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
output : c */

package komalShrivastava;

public class Test3a {
	
	String getMaxLengthString(String[] input) {
		int maxLength = input[0].length();
		String name = input[0];
		for(int index = 1; index < input.length; index++) {
			if(maxLength < input[index].length())
				name = input[index];
		}
		return name;
	}

	char getMiddleCharacter(String input) {
		int length = input.length();
		if(length%2==0)
			length = length/2-1;
		else
			length = length/2;
		return input.charAt(length);
	}
	
	public static void main(String[] args) {
		Test3a test3a = new Test3a();
		
		String[] inputName = {"Krishna","Maulik","Aashvi","Technocredits","Harsh"};
		String nameWithMaxLength = test3a.getMaxLengthString(inputName);
		char ch = test3a.getMiddleCharacter(nameWithMaxLength);
		System.out.println("Maximum Length String in given Array is : " + nameWithMaxLength );
		System.out.println("Middle Character in above String is : " + ch);
	}
}