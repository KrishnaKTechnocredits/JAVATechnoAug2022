package shivaniLikhia;
class ParameterCalculator{
	
	void add(int number1, int number2){
		System.out.println("The addition of two numners is " + (number1 + number2));
	}
	
	void sub(int number1, int number2){
		System.out.println("The substraction of two numners is "  + (number1 - number2));
	}
	
	void mul(int number1, int number2){
		System.out.println("The multiplication of two numners is "  + (number1 * number2));
	}
	
	void div(int number1, int number2){
		System.out.println("The division of two numners is "  + (number1 / number2));
	}
	
	public static void main(String[] args){
	
		ParameterCalculator parameterCalculator = new ParameterCalculator();
		parameterCalculator.add(10,5);
		parameterCalculator.sub(10,5);
		parameterCalculator.mul(10,5);
		parameterCalculator.div(10,5);
	
	}
}