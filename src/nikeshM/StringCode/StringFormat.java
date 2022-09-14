package nikeshM.StringCode;

public class StringFormat {
	String getRearrange(String str) {
		int length = str.length();
		String tempLetter = "";
		String tempDigit = "";
		String output ;
		for (int index = 0; index < length; index++) {
			char ch = str.charAt(index);
			if (Character.isLetter(ch)) {
				tempLetter = tempLetter + ch;
			}
			else if (Character.isDigit(ch)) {
				tempDigit = tempDigit + ch;
			}
		}
		 output= tempDigit + tempLetter;
		return output;
	}
	public static void main(String[] args) {
		StringFormat temp = new StringFormat();
	String word = temp.getRearrange("te2c6h4tr");	
	System.out.print(word);
	}
}
