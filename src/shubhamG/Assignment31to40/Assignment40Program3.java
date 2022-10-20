package shubhamG.Assignment31to40;

/*
Program 3 : Return a reverse String [Method : inplace reverse].
*/
public class Assignment40Program3 {

	String inPlaceReverseString(String str) {

		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(j);
			if (i == 0) {
				str = ch2 + str.substring(i + 1, j) + ch1;
			} else {
				str = str.substring(0, i) + ch2 + str.substring(i + 1, j) + ch1 + str.substring(j + 1);
			}
		}
		return str;
	}

	public static void main(String[] args) {
		Assignment40Program3 inplaceReverse = new Assignment40Program3();

		String str = "technocredits";
		System.out.println("Input string is : " + str);
		System.out.println("String after reversal is : " + inplaceReverse.inPlaceReverseString(str));

	}
}
