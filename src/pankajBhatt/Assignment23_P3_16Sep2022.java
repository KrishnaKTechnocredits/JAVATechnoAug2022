/*Program 3: Write a method to return word having maximum uppercase.

String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
output : FR3ienDs*/

package pankajBhatt;

public class Assignment23_P3_16Sep2022 {

	void getWordsHavingMaximumUpperCase(String input){
		String[] arr = input.split(" ");
		int counter = 0;
		int stringIndex = 0;
		for(int index = 0; index < arr.length; index++) {
			int count = 0;
			for (int index2 = 0; index2 < arr[index].length(); index2++){
				if( Character.isUpperCase(arr[index].charAt(index2)) ) {
					count++;
				}
			}
			if(counter < count) {
				counter = count;
				stringIndex = index ; 
			}
		}
		System.out.println(arr[stringIndex]);
	}

	public static void main(String[] args) {
		String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		Assignment23_P3_16Sep2022 assignment23_P3_16Sep2022 = new Assignment23_P3_16Sep2022();
		assignment23_P3_16Sep2022.getWordsHavingMaximumUpperCase(input);
	}
}