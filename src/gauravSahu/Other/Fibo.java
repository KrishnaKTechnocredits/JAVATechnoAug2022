package gauravSahu.Other;

public class Fibo {
	
	int count;
	
	void check (int x, int y) {
			count = x + y;
			x = count;
			count = y;
			System.out.println(count);	
		}
	
	public static void main(String[] args) {
		Fibo fibo = new Fibo();
		fibo.check (0, 1);
	}
	}