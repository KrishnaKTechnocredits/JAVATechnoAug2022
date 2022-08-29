package ojaswini;

public class CalculatorParameterised {
	 void add(int x,int y){
		   System.out.println("Addition of two no.s is " + (x+y));
		   }
		   
		   void sub(int x,int y){
		   System.out.println("Subtraction of two no.s is " + (x-y));
		   }
		   
		   void mul(int x,int y){
		   System.out.println("Multiplication of two no.s is " + (x*y));
		   }
		   
		   void div(int x,int y){
		   System.out.println("Division of two no.s is " + (x/y));
		   }
		   
		   public static void main(String[] args){
		   CalculatorParameterised calculatorparameterised = new CalculatorParameterised();
		   calculatorparameterised.add(100,200);
		   calculatorparameterised.sub(200,100);
		   calculatorparameterised.mul(2,5);
		   calculatorparameterised.div(200,200);
		   }
}
