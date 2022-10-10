package nikitaPhase;

public class Armstrong {
	//Define a method:
    public void checkNum(int num){
        
        //Save input number as a original number:
        int orgNumber = num;
        
        //Define a dummy variable to store every digit of the inputed number:
        int current_digit = 0;
        
        //Define a variable to store reminder:
        // int reminder = 0;
        
        //Define a "sum" variable:
        int sum = 0;
        
        //Break the number into single digit & perform addition of the cubes of the numbers:
        while(num > 0){
            
            current_digit = (num) % (10);
            
            sum = (sum) + (current_digit*current_digit*current_digit);
            
            num = (num) / (10);
            
        }
        //Check sum == Original Number:
        if (sum == orgNumber){
            System.out.println("Given Number: "+orgNumber);
            System.out.println("--Number is ARMSTRONG--");
        }
        else{
            System.out.println("Given Number: "+orgNumber);
            System.out.println("--Number is NOT ARMSTRONG--");
        }
    }
    // Define a main method:
    public static void main(String[] args){
        
        //Create an object of the class:
        Armstrong armStrong = new Armstrong();
        
        //Call "checkNum" method:
        armStrong.checkNum(153); //153,370,371,407: Armstrong  //123,564,789,999: Not Armstrong
    }
}
