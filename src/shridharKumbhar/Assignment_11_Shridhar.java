//Simple interest and F to C convertor
package shridharKumbhar;

public class Assignment_11_Shridhar {

	void simpleInterest(int principle, double time, double rate) {
		double simpleInterest = ((principle * time * rate) / 100);
		System.out.println("Simpleinterest is " + " : " + simpleInterest);
	}

	void fahrenheitToCelcsius(double fahrenheit) {
		double celsius = ((fahrenheit - 32) * 5) / 9;
		System.out.println(fahrenheit + "F" + " = " + String.format("%.2f", celsius) + "C");
	}

	public static void main(String[] args) {
		Assignment_11_Shridhar assignment_11_Shridhar = new Assignment_11_Shridhar();
		System.out.println("Entered values: priciple amount , time (in yrar), rate (in %) ");
		assignment_11_Shridhar.simpleInterest(1000, 2, 4);
		assignment_11_Shridhar.simpleInterest(10000, 2.5, 4.74);
		System.out.println("                              ");
		System.out.println("fahrenheit To Celcsius ");
		assignment_11_Shridhar.fahrenheitToCelcsius(100);
		assignment_11_Shridhar.fahrenheitToCelcsius(57.6);
	}
}
