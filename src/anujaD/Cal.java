package anujaD;

class Cal{

		void add(int x, int y){
				int ans = x + y;
				System.out.println("Addition is " + ans);
		}
		void sub(int a, int b){
				int ans = a - b;
				System.out.println("Subtraction is " + ans);
		}
		
		void mul(int c, int d){
				int ans = c * d;
				System.out.println("Multiplication is " + ans);
		}
		
		void div(int e, int f){
				int ans = e / f;
				System.out.println("Division is " + ans);
		}
		
		public static void main(String[] args){
				Cal cal1 = new Cal();
				cal1.add(10,5);
				cal1.sub(30,20);
				cal1.mul(5,5);
				cal1.div(50,10);
		}
}
