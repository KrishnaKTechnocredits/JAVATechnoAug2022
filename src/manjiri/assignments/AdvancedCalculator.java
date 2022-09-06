package manjiri.assignments;
class AdvancedCalculator{
	
	void add(int num1, int num2){
		System.out.println("Addition is: " + (num1 + num2));
	}
	
	void sub(int num1, int num2){
		System.out.println("Substraction is: " + (num1-num2));
	}
	
	void mul(int num1, int num2){
		System.out.println("Multiplication is: " + (num1*num2));
	}
	
	void div(int num1, int num2){
		System.out.println("Division is: " + (num1/num2));
	}
	
	public static void main(String[] args){
		AdvancedCalculator advancedcalculator = new AdvancedCalculator();
		advancedcalculator.add(10,20);
		advancedcalculator.sub(100,50);
		advancedcalculator.mul(10,200);
		advancedcalculator.div(500,10);
	}
}