/*Assignment - 23 : 16th Sep'2022
 * 
 * Program 2: Write a method to print all the words having atleast one digit.

String input = "Good mor9ning fr3iends t2hi2s is technocredits";
output : mor9ning
         fr3iends
         t2hi2s
 */

package deepakPatil.Assignment23StringExamples;

public class StringSplitEx2 {

	void printWordHavingDigit(String input){
		String[] inputStr = input.split(" ");
		
		for(int i=0;i<inputStr.length;i++){
			boolean flag=false;
			for(int j=0;j<inputStr[i].length();j++){
				if(Character.isDigit(inputStr[i].charAt(j))){
					flag=true;
					break;
				}
			}	
			if(flag)
				System.out.println(inputStr[i]);
		}
	}
	
	public static void main(String[]args){
		String input="Good mor9ning fr3iends t2hi2s is technocredits";
		System.out.println("Given input string is: "+input);
		System.out.println("Words having atleast one digit from given input as below:");
		new StringSplitEx2().printWordHavingDigit(input);	
	}
}
