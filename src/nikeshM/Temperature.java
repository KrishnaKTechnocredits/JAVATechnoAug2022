package nikeshM;
	
public class Temperature {
	void tempData(double fahrenheit ) {
		double celsius;
		celsius = (fahrenheit-32)*5/9;
		System.out.println("Room Temperature is " + celsius);
	}
	
	public static void main(String [] args) {
		Temperature temp = new Temperature();
		temp.tempData(120);
	}
}

