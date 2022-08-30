package anujaD;

public class Simpleinterest {
	
		void interest (double principleamount, double time, double rate) {
			 double Simple = (principleamount * time * rate) /100; 
			System.out.println("Simple Interest :" +Simple);
		}
		
		void celsius (double fahrenheit) {
			double Celsius = (fahrenheit - 32) * 5 / 9;
			System.out.println("Celsius is :" +Celsius);
			
		}
		public static void main(String[] args) {
			Simpleinterest simpleinterest = new Simpleinterest();
			simpleinterest.interest(50,60,30);
			simpleinterest.celsius(100);
			
			
		}
		
}
