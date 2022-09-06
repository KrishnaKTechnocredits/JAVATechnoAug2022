package vibhaS;

public class Assignment11 {
	
	void findSI(int principle,int rate,int time) {
		System.out.println("Simple Intrest is :- ");
		int simpleIntrest=principle*rate*time/100;
		System.out.println(" "+simpleIntrest);
	}
	void findCelsius(double fahrenheit) {
		System.out.println("Convert temprature in celsius is :- ");
		double celsius=(((fahrenheit-32)*5)/9);
		System.out.println(" "+celsius);
	}

	public static void main(String[] args) {
		Assignment11 assignment11=new Assignment11();
		assignment11.findSI(10000,5,2);
		System.out.println(" ");
		assignment11.findCelsius(4.5);
	}
}
