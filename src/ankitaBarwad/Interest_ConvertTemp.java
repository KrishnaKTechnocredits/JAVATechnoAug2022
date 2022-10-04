package ankitaBarwad;

public class Interest_ConvertTemp {

	void calculateSimpleInterest(double principleAmt, double time, double rate) {
		double simpleInterest = (principleAmt * time * rate) / 100;
		System.out.println("Simple interest is : " + simpleInterest);
	}

	void convertTemperature(double fahrenheit) {
		double celsius = ((fahrenheit - 32) * 5) / 9;
		System.out.println("Temperature in Celsius is :" + celsius);
	}

	public static void main(String[] args) {
		Interest_ConvertTemp interestConvertTemp = new Interest_ConvertTemp();
		interestConvertTemp.calculateSimpleInterest(3000, 8.1, 3.4);
		interestConvertTemp.convertTemperature(50.0);
	}

}
