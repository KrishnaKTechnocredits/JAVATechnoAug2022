package anujaD;

public class Simpleinterest {
	
		void Interest (double principleamount, double time, double rate) {
			 double Simple = (principleamount * time * rate) /100; 
			System.out.println("Simple Interest :" +Simple);
		}
		
		void Celsius (double fahrenheit) {
			double Celsius = (fahrenheit - 32) * 5 / 9;
			System.out.println("Celsius is :" +Celsius);
			
		}
		public static void main(String[] args) {
			Simpleinterest simpleinterest = new Simpleinterest();
			simpleinterest.Interest(50,60,30);
			simpleinterest.Celsius(100);
			
			
		}
		
}
