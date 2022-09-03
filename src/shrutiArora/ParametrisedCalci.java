package shrutiArora;

public class ParametrisedCalci {
     void addition( int num1 , int num2){
	     System.out.println("addition of num1 and num2 is: " +(num1+num2));
	 }
	 void subtraction(int num1 , int num2){
	      System.out.println("subtraction of two numbers is: " +(num1-num2));
	 }
	 void multiplication(int num1 , int num2){
	      System.out.println("multiplication of two numbers is: " + (num1*num2));
	 }
	 void division(int num1 , int num2){
	      System.out.println("division of two numbers is: " + (num1/num2));
	 }
	public static void main(String[] args){
	       ParametrisedCalci calci = new ParametrisedCalci();
		   System.out.println("********************Calculator Program ******************************");
		   calci.addition(8,2);
		   calci.subtraction(6,3);
		   calci.multiplication(8,4);
		   calci.division(16,8);
   }
}