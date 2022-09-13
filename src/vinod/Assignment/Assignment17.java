package vinod.Assignment;

public class Assignment17 {
	
	String reverseString(String inputString) {
		String reverseString ="";
		
		for (int index=inputString.length()-1; index>=0; index--) {
			reverseString = reverseString + inputString.charAt(index);
		}
		return reverseString;
	}
	
	String getEventPositionCharacter(String inputString){
		String targetString ="";
		
		for (int index=0; index<=inputString.length()-1; index++){
		  if(index%2==1) {
			targetString = targetString + inputString.charAt(index);		
		}
	}
	return targetString;
	}
	
	int getsumOfDigits(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch))
				sum = sum + Character.getNumericValue(ch);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		String input ="Maulik", input1 = "tecnocredits", input2 ="Te8chno3cred7it9s";
		
		System.out.println("\nInput String: "+input+"\nReversed String: "+assignment17.reverseString(input));
		System.out.println("\nInput String: "+input1+"\nEven Position characters: "+assignment17.getEventPositionCharacter(input1));
		System.out.println("\ninput String: "+input1+"\nsum of Digits: "+assignment17.getsumOfDigits(input2));
		
	}

}
