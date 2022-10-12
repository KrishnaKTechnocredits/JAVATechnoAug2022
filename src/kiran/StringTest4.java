package kiran;

public class StringTest4 {
	
	/*Program 1:
	 * Write a method to return maximum length word from given input.
	 * String input = "Good morning friends this is technocredits";
	 * output : technocredits

String getMaxLengthWord(String input){
	
}

String[] arr = input.split(" ");
	 * 
	 * */
	String getMaxLengthWord(String input){
		String[] arr=input.split(" ");
		String max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()>max.length()) {
				max=arr[i];
			}
		}
		return max;
	}
	
	
	/*Program 2: Write a method to print all the words having atleast one digit.

String input = "Good mor9ning fr3iends t2hi2s is technocredits";
output : mor9ning
         fr3iends
         t2hi2s*/
	boolean isWordHavingDigit(String word) {
		
		for(int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			if(Character.isDigit(ch))
				return true;
		}
		return false;
	}
	
	void printWordHavingDigit(String input) {
		String[] arr=input.split(" ");
		for(int i=0;i<arr.length;i++) {
			boolean flag=isWordHavingDigit(arr[i]);
			if(flag)
				System.out.println(arr[i]);
		}
	}
	
	/*Program 3: Write a method to return word having maximum uppercase.

String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
output : FR3ienDs	*/
	
	int getUppercaseCountInWord(String word) {
		int uppercaseCount=0;
		for(int i=0;i<word.length()-1;i++) {
			char ch=word.charAt(i);
			if(Character.isUpperCase(ch))
				uppercaseCount++;
		}
		return uppercaseCount;
	}
	
	String getWordHavingMaxUppercase(String input) {
		String[] arr=input.split(" ");
		int maxUpperWordCount=0;
		String tempString="";
		for(int i=0;i<arr.length;i++) {
			int tempCount=getUppercaseCountInWord(arr[i]);
			if(maxUpperWordCount<tempCount) {
				maxUpperWordCount=tempCount;
				tempString=arr[i];
			}
		}
		return tempString;
	}

	/*Program 4: Write a method to print all the words having no digits and uppercase.
String input = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
output : techno
         is*/
	boolean isnoDigitnoUppercase(String word) {
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			if(Character.isDigit(ch)|| Character.isUpperCase(ch))
				return false;
		}
		return true;
	}
	
	void printNoDigitNoUppercaseWord(String input) {
		String arr[]=input.split(" ");
		for(int i=0;i<arr.length;i++) {
			boolean flag=isnoDigitnoUppercase(arr[i]);
			if(flag) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		StringTest4 obj=new StringTest4();
		String input1 = "Good morning friends this is technocredits";
		System.out.println(input1);
		System.out.println("maxlength word is: "+obj.getMaxLengthWord(input1));
		
		System.out.println();
		
		String input2 = "Good mor9ning fr3iends t2hi2s is technocredits";
		System.out.println(input2);
		obj.printWordHavingDigit("words having atleast one digit"+input2);	

		System.out.println();
		
		String input3 = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		System.out.println(input3);
		System.out.println("word having maximum uppercase: "+obj.getWordHavingMaxUppercase(input3));
		
		
		System.out.println();
		StringTest4 obj1=new StringTest4();
		String input4 = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		System.out.println(input4);
		obj1.printNoDigitNoUppercaseWord(input4);	
		
	}

}
