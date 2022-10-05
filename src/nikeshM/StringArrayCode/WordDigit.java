package nikeshM.StringArrayCode;
//Program 2: Write a method to print all the words having atleast one digit.
//
//String input = "Good mor9ning fr3iends t2hi2s is technocredits";
//output : mor9ning
//         fr3iends
//         t2hi2s
public class WordDigit {
		boolean getWordDigit(String input) {
			int length = input.length();
			for (int index = 0 ; index<input.length() ; index++) {
				char ch = input.charAt(index);
				if (Character.isDigit(ch)) {
					return true;
				}
				
			}
			return false;
		}
			void printWordDigit(String name) {
				String [] arr = name.split(" ");
				for (int index = 0 ; index<arr.length; index++) {
					boolean status = getWordDigit(arr[index]);
					if(status) {
						System.out.println(arr[index]);
					}
				}		
			}


	public static void main(String[] args) {
		WordDigit wordcount = new  WordDigit();
		String name = "Good mor9ning fr3iends t2hi2s is technocredits";
			wordcount.printWordDigit(name);
		
			}
}
