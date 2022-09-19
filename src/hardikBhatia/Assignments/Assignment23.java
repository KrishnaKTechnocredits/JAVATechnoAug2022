package hardikBhatia.Assignments;

public class Assignment23 {

    String findMaxLengthStringInput(String input){
        String[] splitedInput = input.split(" ");
        String maxLengthString = splitedInput[0]; 
        for(int index = 1; index < splitedInput.length; index++){
            if(maxLengthString.length() < splitedInput[index].length()){
                maxLengthString = splitedInput[index];
            }
        }
        return maxLengthString;
    }
    
    boolean CheckInputHasDigit(String input) {
    	for(int index = 0; index < input.length(); index++) {
    		if(Character.isDigit(input.charAt(index))) {
    			return true;
    		}
    	}
    	return false;
    }
    void checkWordHavingAtleastOneDigit(String input) {
    	 String[] splitedInput = input.split(" "); 
         for(int index = 0; index < splitedInput.length; index++){
             if(CheckInputHasDigit(splitedInput[index])) {
            	 System.out.println(splitedInput[index]);
             }
         }
    }
    
    int getCountUpperCase(String input) {
    	int count = 0;
    	for(int index = 0; index < input.length(); index++) {
    		if(Character.isUpperCase(input.charAt(index))) {
    			count++;
    		}
    	}
    	return count;
    }
    
    String checkInoutHavingUpperCase(String input) {
    	 String[] splitedInput = input.split(" "); 
    	 int maxUpperCase = 0;
    	 String stringWithMaxUpper = "";
    	 for(int index = 0; index < splitedInput.length; index++){
    		 if(maxUpperCase < getCountUpperCase(splitedInput[index])) {
    			 maxUpperCase = getCountUpperCase(splitedInput[index]);
    			 stringWithMaxUpper = splitedInput[index];
    		 }
    	 }
    	return stringWithMaxUpper;
    }
    
    boolean stringContainsDigitOrUppercase(String input) {
    	for(int index = 0; index < input.length(); index++) {
    		if(!Character.isDigit(input.charAt(index)) && !Character.isUpperCase(input.charAt(index))) {
    			return true;
    		}
    	}
    	return false;
    }
    String printStringWithoutUpperCaseDigit(String input) {
    	String[] splitedInput = input.split(" "); 
    	 for(int index = 0; index < splitedInput.length; index++){
    		 if(!stringContainsDigitOrUppercase(splitedInput[index])) {
    			 return splitedInput[index];
    		 }
    	 }
    	return "";
    }

    public static void main(String args[]){
        Assignment23 assignment23 = new Assignment23();
        String input = "Good morning friends this is technocredits";
        
        System.out.println(input);
        System.out.println(assignment23.findMaxLengthStringInput(input));
        
        System.out.println("=========================================================");
        String input2 = "Good mor9ning fr3iends t2hi2s is technocredits";
        System.out.println(input2);
        assignment23.checkWordHavingAtleastOneDigit(input2);
        
        System.out.println("=========================================================");
        String input3 = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
        System.out.println(input3);
        System.out.println(assignment23.checkInoutHavingUpperCase(input3));
        
        System.out.println("=========================================================");
        String input4 = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
        System.out.println(input4);
        System.out.println(assignment23.checkInoutHavingUpperCase(input4));
    }
}