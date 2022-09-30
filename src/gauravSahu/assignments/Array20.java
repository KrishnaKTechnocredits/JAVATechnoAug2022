
package gauravSahu.assignments;

public class Array20 {

	String getmaxlength(String[] name) {
		int maxlength = name[0].length();
		String maxstr = name[0];

		for (int index = 0; index < name.length; index++) {

			if (maxlength < name[index].length()) {
				maxlength = name[index].length();
				maxstr = name[index];
				System.out.println("Maximum length string in array is " );
				
			}
		}
		return maxstr;
	}

	char getMiddleChar(String name) {
		int length = name.length();
		int index = 0;
		if (length % 2 == 0) {
			index = length / 2 - 1;
		} else {
			index = length / 2;
		}
		System.out.println("Middle character of string is  " );
		return name.charAt(index);
	}

	public static void main(String[] args) {
		Array20 a1 = new Array20();
		String[] name = { "Krishna", "Maulik", "Aashvi", "Technocredits", "Harsh" };
		String num = a1.getmaxlength(name);
		System.out.println(num);
		char ch = a1.getMiddleChar(num);
		System.out.println(ch);
	}

}
