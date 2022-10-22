/*Assignment 40 : 16th Oct'2022
Program 3 : Return a reverse String [Method : inplace reverse].*/
package adittyThakare.collections;

public class Assignment40_Program3 {
	
	String getReversedString(String input) {
		for (int i = 0, j = input.length() - 1; i < j; i++, j--) {
			char ch = input.charAt(i);
			char ch1 = input.charAt(j);
			if (i == 0) {
				input = ch1 + input.substring(i + 1, j) + ch;
			} else {
				input = input.substring(0, i) + ch1 + input.substring(i + 1, j) + ch + input.substring(j + 1);
			}
		}
		return input;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment40_Program3 assignment40_Program3 = new Assignment40_Program3();
		String str = "technocredits";
		System.out.println("Input String: "+str);
		System.out.println("Reversed String "+assignment40_Program3.getReversedString(str));

	}

}
