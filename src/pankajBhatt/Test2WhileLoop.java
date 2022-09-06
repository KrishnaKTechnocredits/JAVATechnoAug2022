package pankajBhatt;

public class Test2WhileLoop {
	
	void countNumbers(int num) {
		
		int initial = 1; 
		int sum = 0; 
		int count = 0; 
		
		while (sum <= num) { 
			sum = sum + initial; 
			initial++;
			if(sum != num) {
				count++;
			} 
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Test2WhileLoop test2WhileLoop = new Test2WhileLoop();
		test2WhileLoop.countNumbers(7);
	}
}
