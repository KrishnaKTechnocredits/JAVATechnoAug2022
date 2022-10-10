package priyankaD.assignments_20_30;

public class Assignment_23_3_4 {
	//Program 3: Write a method to return word having maximum uppercase.
	//String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
	//output : FR3ienDs
		int getUpperCaseCount(String word) {
			int count=0;
			for(int index=0;index<word.length();index++) {
				if(Character.isUpperCase(word.charAt(index))) {
					count++;
				}
			}return count;
		}
		String getMaxUpperCaseWord(String input) {
			String[] wordArray=input.split(" ");
			int maxUpperCaseCount=0;
			String maxUpperCaseString="";
			for(int index=0;index<wordArray.length;index++) {
				int upperCaseCount=getUpperCaseCount(wordArray[index]);
				if(upperCaseCount>maxUpperCaseCount) {
					maxUpperCaseCount=upperCaseCount;
					maxUpperCaseString=wordArray[index];
				}
			}return maxUpperCaseString;
		}
	//Program 4: Write a method to print all the words having no digits and uppercase.
	//String input = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
	//output : techno
	//is
		boolean isWordContainDigitAndUpperCase(String word) {
			for(int index=0;index<word.length();index++) {
				char ch=word.charAt(index);
				if(Character.isDigit(ch)|| Character.isUpperCase(ch)) {
					return false;
				}
			}return true;
		}
		void wordsHavingNoDigitsAndUpperCase(String input) {
			String[] words=input.split(" ");
			for(int index=0;index<words.length;index++) {
				boolean flag=isWordContainDigitAndUpperCase(words[index]);
				if(flag) {
					System.out.println(words[index]);
				}
			}
		}
		public static void main(String[]args) {
			Assignment_23_3_4 assignment=new Assignment_23_3_4();
			System.out.println(assignment.getMaxUpperCaseWord("Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits"));
			System.out.println("------------------------------------");
		    assignment.wordsHavingNoDigitsAndUpperCase("Good mor9ning techno fr3iends t2Hi2s is tEchnocredits");
		}
}
