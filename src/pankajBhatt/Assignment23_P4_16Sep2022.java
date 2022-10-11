/*Program 4: Write a method to print all the words having no digits and uppercase.
String input = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
output : techno
         is*/

package pankajBhatt;

public class Assignment23_P4_16Sep2022 {

	void getWordsHavingNoDigitsAndUpperCase(String input){
		String[] arr = input.split(" ");
		
		for(int index = 0; index < arr.length; index++) {
			boolean flag = true;
			for (int index2 = 0; index2 < arr[index].length(); index2++){
				if( Character.isUpperCase(arr[index].charAt(index2)) || Character.isDigit(arr[index].charAt(index2))) {
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.println(arr[index]);
		}
	}

	public static void main(String[] args) {
		String input = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		Assignment23_P4_16Sep2022 assignment23_P4_16Sep2022 = new Assignment23_P4_16Sep2022();
		assignment23_P4_16Sep2022.getWordsHavingNoDigitsAndUpperCase(input);
	}
}