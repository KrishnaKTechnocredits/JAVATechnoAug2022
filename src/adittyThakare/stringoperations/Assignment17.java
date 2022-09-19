/*Assignment - 17 : 7th Sep'2022

Program 1 : Write a method to return reverse name
input : Maulik
output : kiluaM

Program 2 : Write a method to return even position characters from given String. 
input : technocredits
output : ehordt

Program 3 : Write a method to return even position characters from given String in reverse.
input : technocredits
output : tdrohe

Program 4 : Write a method to return count of digits in a given string.
input : "Te8chno3cred7it9s"
output : 4

Program 5 : Write a method to return sum of digits in a given string.
input : "Te8chno3cred7it9s"
output : 27
Hint : ch = Character.charAt(index);
Character.isDigit(ch);
int num = Character.getNumericValue(ch); '9'*/
package adittyThakare.stringoperations;

public class Assignment17 {
	
	String reverseString(String inputString) {
		String reverseString="";
		
		for(int index=inputString.length()-1;index>=0;index--) {
			reverseString = reverseString + inputString.charAt(index);
		}
		return reverseString;
	}
	
	String getEvenPositionCharacters(String inputString) {
		String targetString = "";
		
		for(int index=0;index<=inputString.length()-1;index++) { 
			if(index%2==1) {
				 targetString = targetString + inputString.charAt(index); 
			}
		}
		 return targetString;	
	}
	
	String getReverseEvenPositionCharacters(String inputString) {
		
		String tempString = getEvenPositionCharacters(inputString);
		String resultString = reverseString(tempString);
		
		return resultString;
	}
	
	int getDigitCountFromString(String inputString) {
		int count=0;
		
		for(int index=0;index<=inputString.length()-1;index++) { 
			if(Character.isDigit(inputString.charAt(index))) {
				count++;
			}
		}
		return count;
	}
	
	int getDigitSumFromString(String inputString) {
		int digitSum=0;
		
		for(int index=0;index<=inputString.length()-1;index++) { 
			int ch = inputString.charAt(index);
			
			if(Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				digitSum = digitSum + num;
			}
		}
		return digitSum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment17 assignment17 = new Assignment17();
		String input="Maulik", input1="technocredits", input2="Te8chno3cred7it9s";
		
		System.out.println("Assignment17: Program for String operations!!");
		
		System.out.println("\nInput String: "+input+"\nReversed String: "+assignment17.reverseString(input));

		System.out.println("\nInput String: "+input1+"\nEven position characters: "+assignment17.getEvenPositionCharacters(input1));
		
		System.out.println("\nInput String: "+input1+"\nReversed even position characters: "+assignment17.getReverseEvenPositionCharacters(input1));
		
		System.out.println("\nInput String: "+input2+"\nNumber of digits in the String: "+assignment17.getDigitCountFromString(input2));
		
		System.out.println("\nInput String: "+input2+"\nSum of digits in the String: "+assignment17.getDigitSumFromString(input2));
	}

}
