/*Program 1:
Write a method to return maximum length word from given input.
String input = "Good morning friends this is technocredits";
output : technocredits
String[] arr = input.split(" ");
*/
package maheshSantoki.arrayExamples;

public class MaxLengthWord {
	String getMaxLengthWord(String input) {
		String[] arr = input.split(" ");
		String maxLen=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length() > maxLen.length()) {
				maxLen=arr[i];
			}
		}
		return maxLen;
	}
	public static void main(String[] args) {
		MaxLengthWord maxlengthword=new MaxLengthWord();
		String input = "Good morning friends this is technocredits";
		System.out.println(input);
		System.out.println("Maximum Length Word is : "+maxlengthword.getMaxLengthWord(input));
	}
}