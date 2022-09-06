package shrutiArora;

public class Calculator {
    int num1 = 10;
	 int num2 = 2;
	 void addition(){
	     System.out.println("addition of num1 and num2 is: " +(num1+num2));
	 }
	 void subtraction(){
	      System.out.println("subtraction of two numbers is: " +(num1-num2));
	 }
	 void multiplication(){
	      System.out.println("multiplication of two numbers is: " + (num1*num2));
	 }
	 void division(){
	      System.out.println("division of two numbers is: " + (num1/num2));
	 }
	public static void main(String[] args){
	       Calculator calculator = new Calculator();
		   System.out.println("********************Calculator Program ******************************");
		   calculator.addition();
		   calculator.subtraction();
		   calculator.multiplication();
		   calculator.division();
   }
}