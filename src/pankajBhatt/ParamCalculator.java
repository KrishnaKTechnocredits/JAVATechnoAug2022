package pankajBhatt;

class ParamCalculator{
		
	void add(int number1, int number2){
		System.out.println("Sum of two given Numbers is : "+(number1 + number2));
	}
	
	void subtract(int number1, int number2){
		System.out.println("Difference of two given Numbers is : "+(number1 - number2));
	}
	
	void multiply(int number1, int number2){
		System.out.println("Mutiplication of two given Numbers is : "+(number1 * number2));
	}
	
	void devide(int number1, int number2){
		System.out.println("Devision of two given Numbers is : "+(number1 / number2));
	}	
	
	public static void main(String[] srgs){
		ParamCalculator paramCalculator = new ParamCalculator();
		paramCalculator.add(100,5);
		paramCalculator.subtract(100,5);
		paramCalculator.multiply(100,5);
		paramCalculator.devide(100,5);
	}
}