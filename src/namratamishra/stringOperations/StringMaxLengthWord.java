package namratamishra.stringOperations;

/*
Write a method to return maximum length word from given input.
String input = "Good morning friends this is technocredits";
output : technocredits

Hint:-String getMaxLengthWord(String input){
	
}
String[] arr = input.split(" ");

*/
public class StringMaxLengthWord {
	String getMaxLengthWord(String[] brr) {
		int maxLth = 0;
		String maxLengthWord = " ";
		for (int index = 0; index < brr.length; index++) {

			if (brr[index].length() > maxLth)
				maxLth = brr[index].length();
			maxLengthWord = brr[index];
		}
		return maxLengthWord;
	}

	public static void main(String[] args) {
		String input = "Good morning friends this is technocredits";
		String[] arr = input.split(" ");
		StringMaxLengthWord mlw = new StringMaxLengthWord();
		System.out.println(mlw.getMaxLengthWord(arr));
	}
}
