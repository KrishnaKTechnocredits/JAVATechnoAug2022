package nikitaPhase;

 /*Write a method to return word having maximum uppercase.*/

public class Assignment_23_3 {
	
	int wordContainUpperCaseCount(String name) {
		int count = 0;

		for (int i = 0; i <= name.length() - 1; i++) {
			char ch = name.charAt(i);
			if (Character.isUpperCase(ch))
				count++;
		}
		return count;
	}

	String wordsHavingMaxUppercase(String name) {
		System.out.println("Input: " + name);
		String[] arr = name.split(" ");
		String tempString = "";
		int tempCount = 0;

		for (int i = 0; i < arr.length; i++) {
			int count1 = wordContainUpperCaseCount(arr[i]);
			if (tempCount < count1) {
				tempCount = count1;
				tempString = arr[i];
			}
		}
		return tempString;
	}

	public static void main(String[] args) {
		System.out.println("Program 3: Write a method to return word having maximum uppercase.");
		
		Assignment_23_3 prg2 = new Assignment_23_3();
		String s1 = prg2.wordsHavingMaxUppercase("'Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits'\n");
		System.out.println("Output:Word which contain max Uppercase in above sentence are: \n" + s1);
	}
}

