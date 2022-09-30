package nikitaPhase;

public class Palindrome {
	/* Define a method to reverse a number and 
    check if the "reversed number is the same 
    as the original number." */
    
    public void checkPalindrome(int num){
        
        //Save the original number for comparison:
        int orgNum = num;
        System.out.println("Original Number: " + orgNum);
        
        //Define a variable to save the reversed number:
        int revNum = 0;
        
        //Define a variable to save the current digit of the number:
        int current_digit = 0;
        
        //Define a loop to reverse the number:
        while(num > 0){
            
            //Separate the last digit of the number:
            current_digit = num % 10;
            
            //Update "reverse num" variable:
            revNum = (revNum * 10)+(current_digit);
            
            //Decrease the number:
            num = (num / 10);
            
        }
        //Print "reversed" number:
        System.out.println("Reversed Number: " + revNum);
        //System.out.println();
        
        /*Check if the reversed number is the same 
        as the original number.*/
        if (revNum == orgNum){
            System.out.println("Output:---Number is PALINDROME---");
        }
        else{
            System.out.println("Output:---Number is NOT PALINDROME---");
        }
    }
    //Define a main method:
    public static void main(String[] args){
        
        //Create an object of the class:
    	Palindrome palli = new Palindrome();
        
        //Call "checkPalindrome" method on the object:
        palli.checkPalindrome(171);  //121, 131, 171, 191, 16461:PALINDROME
        System.out.println();
        System.out.println();
        palli.checkPalindrome(658);  //122, 658, 236: Not PALINDROME 
    }
}
