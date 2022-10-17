/*Program 3 : Return a reverse String [Method : inplace reverse].*/package gauravSahu;

public class Assignment40C {
	
	void getReverseString(String str) {
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(j);
			if (i == 0)
				str = ch2 + str.substring(i + 1, j) + ch1;
			else
				str = str.substring(0, i) + ch2 + str.substring(i + 1, j) + ch1 + str.substring(j + 1);
		}
		System.out.println("Reversed String : " + str);
	}

	public static void main(String[] args) {
		Assignment40C a40 = new Assignment40C();
		String input = "Gaurav";
		System.out.println("Given String : " + input);
		a40.getReverseString(input);
	}
}
