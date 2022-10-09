package nikitaPhase;

//Import scanner module:
import java.util.Scanner;

public class AnagramString {
	
	//Define a method to calculate character count in given string:
    int getCharCount(String input, char ch){
        
    	//Calculate the length of the entire string:
        int strlen = input.length();
        
        //Define a count variable to track the character occurrence:
        int count = 0;
        
        //Define a for-loop to iterate over the string:
        for(int index=0; index<input.length(); index++){
            if (ch == input.charAt(index)){
                count++;
            }
        }
       return count;
    }
    
    //Define a method to check whether given strings are Anagrams:
    boolean checkString(String str1, String str2){            
        
        //Print String 1:
        System.out.println("String 1: "+ str1);
        
        //Print String 2:
        System.out.println("String 2: "+ str2);
        
        //First, check if the given strings are of equal length:
        if(str1.length() == str2.length()){
            
            //Iterate over the string to get each character one by one:
            for(int index=0; index < str1.length(); index++){
                
                //Take 1st character from str1:
                char ch = str1.charAt(index);
                
                //Check count of the fetched character in String 1:
                int countCh1 = getCharCount(str1, ch);
                
                //Check count of the fetched character in String 2:
                int countCh2 = getCharCount(str2, ch);
                
                //Check if both the counts are equal:
                if (countCh1 != countCh2){
                    return false;
                }
            }
        }else{
            return false;
        }
        return true;
    }
    //Define main method:
    public static void main(String[] args){
        //Create an object:
        AnagramString anaStr = new AnagramString();
        
        // Create a Scanner object
        Scanner myScannerObj = new Scanner(System.in);  
        System.out.println("Enter string1:");
        
        // Read user input-1
        String userInput1 = myScannerObj.nextLine();
        
        System.out.println("Enter string2:");
        
        // Read user input-2
        String userInput2 = myScannerObj.nextLine();
        
        //Call "checkString" method on object:
        boolean status = anaStr.checkString(userInput1,userInput2);    
                                                                
        if(status){
            System.out.println("---ANAGRAM STRINGS---");
        }else{
            System.out.println("---NOT ANAGRAM STRINGS---");
        }
    }
}