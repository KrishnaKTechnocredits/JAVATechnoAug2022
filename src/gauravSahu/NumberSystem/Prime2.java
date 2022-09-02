package gauravSahu.NumberSystem;

public class Prime2 {

	static int count; 
	static int sum;
	static float avg;
	
	void checkprime(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}if (flag == true) {
			System.out.println(num + "  is a prime number" );
				count++;
				sum = sum + num;	
				avg = sum/count;
		} 
	}
	

	void checknum(int startnum, int endnum) {
		for (int num = startnum; num <= endnum; num++) {
			checkprime(num);
		}
	}

	public static void main(String[] args) {
		new Prime2().checknum(10, 100);
		System.out.println("Total prime number is " + count);
		System.out.println("Total sum of prime numbers " + sum );
		
		System.out.println("Average of prime numbers " + avg );
	}
}
