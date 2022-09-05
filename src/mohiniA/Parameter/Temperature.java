package mohiniA.Parameter;

public class Temperature {

	void tempFahToCelsius(int tempF) {
		double Celsius;
		Celsius = ((tempF - 32) * 5 / 9);
		System.out.println("Temptreture converted to Celsius is " + Celsius);
	}

	public static void main(String[] args) {
		Temperature temp1 = new Temperature();
		temp1.tempFahToCelsius(98);
		temp1.tempFahToCelsius(101);
		temp1.tempFahToCelsius(105);
		

	}

}
