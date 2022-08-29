package sanket;

class Calculator{
	int numner1 = 10;
	int number2 = 5;
	int ans = 0;
	
		void addition(){
			int ans = numner1 + number2;
			System.out.println("Addition is is " + ans);
		}
		
		void subtraction(){
			ans = numner1 - number2;
			System.out.println("Subtraction is " + ans);
		}
		
		void multiplication(){
			int ans = numner1 * number2;
			System.out.println("Multiplication is " + ans);
		}
		
		void division(){
			int ans = numner1 / number2;
			System.out.println("Division is " + ans);
		}
		
		public static void main (String [] a){
			Calculator c1 = new Calculator();
			c1.addition();
			c1.subtraction();
			c1.multiplication();
			c1.division();
		}
}