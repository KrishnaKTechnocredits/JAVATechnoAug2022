package pankajBhatt;

class Calculator{
	
	int number1 = 10;
	int number2 = 5;
	int ans = 0;
	
	void add(){
		ans = number1 + number2;
		System.out.println("Sum of two given Numbers is : "+ans);
	}
	
	void subtract(){
		ans = number1 - number2;
		System.out.println("Difference of two given Numbers is : "+ans);
	}
	
	void multiply(){
		ans = number1 * number2;
		System.out.println("Mutiplication of two given Numbers is : "+ans);
	}
	
	void devide(){
		ans = number1 / number2;
		System.out.println("Devision of two given Numbers is : "+ans);
	}	
	
	public static void main(String[] srgs){
		Calculator calc = new Calculator();
		calc.add();
		calc.subtract();
		calc.multiply();
		calc.devide();
	}
}