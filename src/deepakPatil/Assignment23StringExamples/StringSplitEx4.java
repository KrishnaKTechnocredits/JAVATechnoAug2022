/*Assignment - 23 : 16th Sep'2022
 * 
 * Program 4: Write a method to print all the words having no digits and uppercase.
String input = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
output : techno
         is
 */

package deepakPatil.Assignment23StringExamples;

public class StringSplitEx4 {
	
void printWordsNoDigitAndUppercase(String input){
		
		String[] arrStr= input.split(" ");
		
		for(int i=0;i<arrStr.length;i++){
			boolean flag=true;
			for(int j=0;j<arrStr[i].length();j++){
				if(Character.isDigit(arrStr[i].charAt(j)) || Character.isUpperCase(arrStr[i].charAt(j))){
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.println(arrStr[i]);
		}
	}
	
	public static void main(String[]args){
		String input="Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		System.out.println("Given input string is:" +input);
		System.out.println("Words having no digit and no uppercase from given string are as below:");
		new StringSplitEx4().printWordsNoDigitAndUppercase(input);
	}

}
