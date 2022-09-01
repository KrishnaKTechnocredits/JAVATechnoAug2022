package maheshSantoki;

public class Mathemetics {

	void interest(double P, double T, double R) {
		double simpleinterest = 0;
		simpleinterest = (P * T * R) / 100;
		System.out.println("Simple interest is : " + simpleinterest + " Rupees");
	}

	void temprature(double fahrenheit) {
		double celsius = 0;
		celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("celsius of given fahrenheit is : " + celsius + " *C");
	}

	public static void main(String[] a) {
		Mathemetics mathemetics = new Mathemetics();
		mathemetics.interest(12000.0, 2.0, 2.0);
		mathemetics.interest(70000.0, 12.5, 3.5);

		mathemetics.temprature(70.0);
		mathemetics.temprature(95.5);
	}
}
