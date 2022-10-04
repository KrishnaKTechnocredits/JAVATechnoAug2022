package nikitaPhase;

public class ReverseNum {
	//Define a method to reverse the number:
    public void reverseNum(int num){
        
        //Store original number:
        int orgNum = num;
        
        //Define a variable to store current digit:
        int current_digit = 0;
        
        //Print original number:
        System.out.println("Original Number: " + orgNum);
        
        //Print Reverse number:
        System.out.print("Reverse Number: ");
        
        //Define a loop to separate digits from the number:
        while(num > 0){
            
            current_digit = num % 10;
            
            //Print the current digit:
            System.out.print(current_digit);
            
            //Decrease the number:
            num = num / 10;
        }
    }
    //Define a main method:
    public static void main(String[] args){
        //Create an object:
        ReverseNum revNum = new ReverseNum();
        
        //Call "reverseNum" method on object:
        revNum.reverseNum(997); //687,997,199,623,999,121
        System.out.println();
    }
}
