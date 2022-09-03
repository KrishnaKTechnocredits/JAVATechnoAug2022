// Program 2: calculator
//Mahesh santoki
package maheshSantoki.startingExamples;
class Calculator{
	int number1=10;
	int number2=5;
	int ans=0;
	
	void add(){
		ans = number1+number2;
		System.out.println("Addition is " + ans);
	}
	void sub(){
		ans = number1-number2;
		System.out.println("Substraction is " + ans);
	}
	void mul(){
		ans = number1*number2;
		System.out.println("Multiplication is " + ans);
	}
	void div(){
		ans = number1/number2;
		System.out.println("division is " + ans);
	}
	
	public static void main(String[] args)
	{
		Calculator Cal= new Calculator();
		Cal.add();
		Cal.sub();
		Cal.mul();
		Cal.div();
	}
}