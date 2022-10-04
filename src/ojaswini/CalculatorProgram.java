package ojaswini;

public class CalculatorProgram {
	int number1=7;
	int number2=3;
	int ans=0;

void subtraction(){
	ans = number1-number2;
	System.out.println("subtraction is " +ans);
    }
void multiplication(){
	ans = number1*number2;
	System.out.println("multiplication is " +ans);
    }
void division(){
	ans = number1/number2;
	System.out.println("division is " +ans);
    }
void addition(){
	ans = number1+number2;
	System.out.println("addition is " +ans);
    }

public static void main(String[] args){
	Calculator s1 = new Calculator();
	s1.subtraction();
	s1.multiplication();
	s1.division();
	s1.addition();
    }
}


	


