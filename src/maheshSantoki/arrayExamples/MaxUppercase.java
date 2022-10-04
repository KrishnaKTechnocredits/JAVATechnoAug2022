/*Program 3: Write a method to return word having maximum uppercase.

String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
output : FR3ienDs*/
package maheshSantoki.arrayExamples;

public class MaxUppercase {
	int maxUpperCase(String name) {
		int count=0;
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(Character.isUpperCase(ch)) {
				count++;
			}
		}
		return count;
	}
	
	String splitString(String input) {
		String[] arr=input.split(" ");
		int maxCount=0;
		String output=" ";
		for(int i=0;i<arr.length;i++) {
			int numOfUpper=maxUpperCase(arr[i]);
			if(numOfUpper>maxCount) {
				maxCount=numOfUpper;
				output=arr[i];
			}
				
		}
		return output;
	}
	public static void main(String[] args) {
		MaxUppercase maxuppercase=new MaxUppercase();
		String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		System.out.println(input);
		System.out.println("Maximum uppercase word is : "+maxuppercase.splitString(input));
	}
}
