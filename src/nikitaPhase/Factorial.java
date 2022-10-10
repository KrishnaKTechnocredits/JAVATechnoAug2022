package nikitaPhase;
import java.util.Scanner;

public class Factorial {
	//Define a method to get factorial of given number:
    int getFactorial(int num){
        //Save original number:
        int OrgNum = num;
        
        //Print the input:
        System.out.print("Factorial of number "+ num + " is: ");
        
        //Define a variable to save the multiplication:
        int mul = 1;
        
        //Define a loop:
        for(int index=1; index <= num; index++){
            //Update "mul" variable:
            mul = mul * index; 
            //num--;
        }
        return mul;
    }
    //Define main method:
    public static void main(String[] args){
        //Create an object:
        Factorial fact = new Factorial();
        
        //Call "getFactorial" method on object:
        int result = fact.getFactorial(10);   
        
        //Print the result:
        System.out.println(result);
    }
}
