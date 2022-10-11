package priyankaD.assignments_20_30;

public class Assignment_23_1_2 {
	//Program 1:Write a method to return maximum length word from given input.
	//String input = "Good morning friends this is technocredits";
	//output : technocredits
	    String maxLengthwordInString(String input) {
	    	String[] words=input.split (" ");
	    	int maxLength=words[0].length();
	    	String maxLengthWord="";
	    	for(int index=0;index<words.length;index++) {
	    		if(maxLength<words[index].length()) {
	    			maxLength=words[index].length();
	    			maxLengthWord=words[index];
	    		}
	    	}return maxLengthWord;
	    }
	//Program 2: Write a method to print all the words having atleast one digit.
	//String input = "Good mor9ning fr3iends t2hi2s is technocredits";
	//output : mor9ning
	        //fr3iends
	        //t2hi2s
	    boolean isWordcontainDigit(String word) {
	    	for(int index=0;index<word.length();index++) {
	    		if(Character.isDigit(word.charAt(index))) {
	    			return true;
	    		}
	    	}return false;
	    }
	    void wordsContainingDigits(String input) {
	           String[] wordArray=input.split(" ");
	           for(int index=0;index<wordArray.length;index++) {
	        	   boolean flag=isWordcontainDigit(wordArray[index]);
	        	   if(flag) {
	        		   System.out.println(wordArray[index]);
	        	   }
	           }
	    }
	    public static void main(String[]args) {
	    	Assignment_23_1_2 assignment23=new Assignment_23_1_2();
	        String input=assignment23.maxLengthwordInString("Good Morning Friends This Is Technocredits");
	        System.out.println(input);
	        System.out.println("------------------------------------");
	       assignment23.wordsContainingDigits("Good mor9ning fr3iends t2hi2s is technocredits");
	    
       }
}