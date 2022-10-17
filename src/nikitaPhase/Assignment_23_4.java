package nikitaPhase;

 /*Write a method to print all the words having no digits and uppercase.*/

public class Assignment_23_4 {

	boolean isWordContainDigitAndUpperCase(String name) {

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isDigit(ch))
				return false;
			if(Character.isUpperCase(ch))
				return false;
		}
		return true;
	}
	
	String wordsHavingNoDigitsAndUpperCase(String name) {
		String[] arr = name.split(" ");
		System.out.println("Input: " + name);
		String containDigit = "";
		for (int i = 0; i < arr.length; i++) {
			boolean flag = isWordContainDigitAndUpperCase(arr[i]);
			if (flag)
				containDigit = containDigit + arr[i] + "\n";
		}
		return containDigit;
	}

	public static void main(String[] args) {
		System.out.println("Program 4: Write a method to print all the words having no digits and uppercase.");
		
		Assignment_23_4 prg2 = new Assignment_23_4();
		String s1 = prg2.wordsHavingNoDigitsAndUpperCase("Good mor9ning techno fr3iends t2Hi2s is tEchnocredits\n");
		System.out.println("Words which contain no digits and UpperCase in above sentence are: \n" + s1);
	}
}

