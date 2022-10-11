package nikeshM.ArrayProgram;

public class SumOfGivenArrey {
	int getSumOfPrime(int[] input) {
		int sum = 0;
		int range = 2;
		int ans = 0;
		boolean isPrime = true;
		for (int index = 0; index < input.length; index++) {
			if (input[index] % range == 0) { 
				sum = input[index];
				ans = ans + sum;
				
			}
		}
		System.out.print(ans);
		return sum;
	}		
		
	

	public static void main(String[] args) {
		int[] input = { 10, 11, 15, 6 };
		new SumOfGivenArrey().getSumOfPrime(input);

	}
}
