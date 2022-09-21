/*Assignment - 23 : 16th Sep'2022
 * 
 * Program 3: Write a method to return word having maximum uppercase.

String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
output : FR3ienDs
 */

package deepakPatil.Assignment23StringExamples;

public class StringSplitEx3 {
	
String getWordHavingMaxUppercase(String input){
		
		String[] inputArr = input.split(" ");
		String maxUpperCaseWord="";
		int maxUpperCase=0;
		
		for(int i=0;i<inputArr.length;i++){
			int maxUpperCaseCount=0;
			for(int j=0;j<inputArr[i].length();j++){
				if(Character.isUpperCase(inputArr[i].charAt(j)))
					maxUpperCaseCount++;
			}
			if(maxUpperCaseCount>maxUpperCase){
				maxUpperCase=maxUpperCaseCount;
				maxUpperCaseWord=inputArr[i];
			}
		}
	
		return maxUpperCaseWord;
	}
	
	
	public static void main(String[]args){
		String input="Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		System.out.println("Given input string is: "+input);
		System.out.println("Word having maximum upppers case from given input is :"+new StringSplitEx3().getWordHavingMaxUppercase(input));
	}

}
