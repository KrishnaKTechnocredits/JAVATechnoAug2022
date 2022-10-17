package nikitaPhase;

/*Write a method to print all the words having atleast one digit*/


public class Assignment_23_2 {
	boolean isWordContainDigit(String name) {

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isDigit(ch))
				return true;
		}
		return false;
	}

	String wordsHavingDigits(String name) {
		String[] arr = name.split(" ");
		System.out.println("Input: " + name);
		String containDigit = "";
		for (int i = 0; i < arr.length; i++) {
			boolean flag = isWordContainDigit(arr[i]);
			if (flag)
				containDigit = containDigit + arr[i] + "\n";
		}
		return containDigit;
	}

	public static void main(String[] args) {
		System.out.println("Program 2: Write a method to print all the words having atleast one digit.");
		
		Assignment_23_2 prg2 = new Assignment_23_2();
		String s1 = prg2.wordsHavingDigits("'Good mor9ning fr3iends t2hi2s is technocredits'\n");
		System.out.println("Output: Words which contain min one digits in above sentence are: \n" + s1);
	}
}
