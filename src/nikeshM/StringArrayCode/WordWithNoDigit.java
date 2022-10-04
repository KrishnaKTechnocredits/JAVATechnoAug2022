package nikeshM.StringArrayCode;
//Program 4: Write a method to print all the words having no digits and uppercase.
//String input = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
//output : techno
//         is
public class WordWithNoDigit {
	boolean getWordNoDigit(String input) {
		int length = input.length();
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch) || Character.isDigit(ch))
				return false;
			}
			return true;
		}
		
		void printWordWithLowerCase (String name) {
			String [] arr = name.split(" ");
			for (int index = 0 ; index<arr.length ; index++) {
				boolean status = getWordNoDigit(arr[index]);
				if (status) {
					System.out.println(arr[index]);
				}
			}
		}
	public static void main(String[] args) {
		WordWithNoDigit P4 = new WordWithNoDigit();
		String input = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		P4.printWordWithLowerCase(input);
			
	}
	
}
