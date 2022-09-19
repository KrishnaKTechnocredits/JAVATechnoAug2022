package hardikBhatia.Assignments;

public class Assignment18StringRearrangeFrequency {
	//1) Write a program to rearrange String in given format.
	String rearrangeString(String input){
        String allCharacter = "";
        String allDigit = "";
        for(int i = 0; i < input.length();i++){
            if(Character.isDigit(input.charAt(i))) {
            	allDigit += input.charAt(i);
            }else if(Character.isAlphabetic(input.charAt(i))) {
            	allCharacter += input.charAt(i);
            }
        }
        return allDigit+allCharacter;
    }
	
	//2) Write a program to rearrange String in given format.
	// Uppercase letters + digits + LowerCase letter.
	String rearrangeStringUpperDigitLower(String input){
        String allDigit = "";
        String allUpperCase = "";
        String allLowerCase = "";
        for(int i = 0; i < input.length();i++){
            if(Character.isDigit(input.charAt(i))) {
            	allDigit += input.charAt(i);
            }else if(Character.isUpperCase(input.charAt(i))) {
            	allUpperCase += input.charAt(i);
            }else if(Character.isLowerCase(input.charAt(i))) {
            	allLowerCase += input.charAt(i);
            }
        }
        return allUpperCase+allDigit+allLowerCase;
    }
	
	//3) Find frequency of given character from given String.
	int findFrequencyCharacter(String input, char targetCharater){
       int frequency = 0;
       input = input.toLowerCase();
       targetCharater = Character.toLowerCase(targetCharater);
        for(int i = 0; i < input.length();i++){
            if(targetCharater == input.charAt(i)) {
            	frequency++;
            }
        }
        return frequency;
    }
	
	public static void main(String[] args) {
		Assignment18StringRearrangeFrequency assignment18StringRearrangeFrequency = new Assignment18StringRearrangeFrequency();
		
		System.out.println("Input String : te2cH4no");
		System.out.println(assignment18StringRearrangeFrequency.rearrangeString("te2cH4no"));
		System.out.println("===========================================");
		
		System.out.println("Input String rearrange(Uppercase letters + digits + LowerCase letter): t8EcHNo5Cred3iTs");
		System.out.println(assignment18StringRearrangeFrequency.rearrangeStringUpperDigitLower("t8EcHNo5Cred3iTs"));
		System.out.println("===========================================");
		
		System.out.println("Input String Find Frequency: TechnoTtcredits");
		System.out.println(assignment18StringRearrangeFrequency.findFrequencyCharacter("TechnoTtcredits", 't'));
    }
}
