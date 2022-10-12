package namratamishra.stringOperations;
/*
Write a method to print all the words having atleast one digit.

String input = "Good mor9ning fr3iends t2hi2s is technocredits";
output : mor9ning
         fr3iends
         t2hi2s	
         */

public class StringAllWordsHavingDigit {

	void getAllWordsHavingDigit(String[] brr) {
		System.out.println("All words having digits are:");

		for (int i = 0; i < brr.length; i++) {

			for (int index = 0; index < brr[i].length(); index++) {

				boolean flag = Character.isDigit(brr[i].charAt(index));

				if (flag) {
					System.out.println(brr[i]);
					break;
				}

			}

		}
	}

	public static void main(String[] args) {
		String input = "Good mor9ning fr3iends t2hi2s is technocredits";
		String[] arr = input.split(" ");
		StringAllWordsHavingDigit awhd = new StringAllWordsHavingDigit();
		awhd.getAllWordsHavingDigit(arr);

	}

}
