/*Program 2: Write a method to print all the words having atleast one digit.

String input = "Good mor9ning fr3iends t2hi2s is technocredits";
output : mor9ning
         fr3iends
         t2hi2s*/

package pankajBhatt;

public class Assignment23_P2_16Sep2022 {
	
	void getWordsHavingNumber(String input){
		String[] arr = input.split(" ");
		
		for(int index = 0; index < arr.length; index++) {
			boolean flag = false;
			for (int index2 = 0; index2 < arr[index].length(); index2++){
				if( Character.isDigit(arr[index].charAt(index2))) {
					flag = true;
					break;
				}
			}
			if(flag)
				System.out.println(arr[index]);
		}
	}

	public static void main(String[] args) {
		String input = "Good mor9ning fr3iends t2hi2s is technocredits";
		Assignment23_P2_16Sep2022 assignment23_P2_16Sep2022 = new Assignment23_P2_16Sep2022();
		assignment23_P2_16Sep2022.getWordsHavingNumber(input);
	}
}
