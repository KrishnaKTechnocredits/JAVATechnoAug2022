package shrutiArora;
public class Assignment11SimpleInterst {
	void displaySimpleInterst(int principal , int rate , int time) {
		 double simpleInterest = (principal*rate*time)/100;
		 System.out.println(simpleInterest);
	}
	void convertTemperature(double fahrenheit) {
		double celsius = (fahrenheit-32)* 5/9;
		System.out.println(celsius);
	}
	public static void main(String[] args) {
		Assignment11SimpleInterst assignment11SimpleInterst = new Assignment11SimpleInterst();
		System.out.println("*****************************SimpleInterstProgram**************************************");
		assignment11SimpleInterst.displaySimpleInterst(20000, 10, 2);
		System.out.println("***********************************TemperatureConvertProgram*****************************");
		assignment11SimpleInterst.convertTemperature(46);
	}
}