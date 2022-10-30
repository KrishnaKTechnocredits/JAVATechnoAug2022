package shubhamG.Assignment31to40;

public class Assignment40Program4 {
/*
* Program 4 : Return a reverse String [Use : StringBuilder].
* 
*/
	String reverseStringUsingStringBuilder(String str) {
		
		StringBuilder sb =new StringBuilder(str);
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		String input="technocredits";
		System.out.println("Input String is: "+input);
		System.out.println("String after doing inplace reverse using string Builder is: "+new Assignment40Program4().reverseStringUsingStringBuilder(input));
	}
}
