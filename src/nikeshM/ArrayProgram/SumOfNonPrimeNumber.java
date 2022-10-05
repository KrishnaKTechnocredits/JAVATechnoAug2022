package nikeshM.ArrayProgram;

//1) Write a method to return sum of all not prime numbers from given array.
//input : {11,13,17,22,44}
//output : 66
//Hint : (22+44 = 66)

public class SumOfNonPrimeNumber {

	int getSum(int[] number) {
		int ans = 0;
		int range = 2;
		int sum = 0;
		boolean flag = true;
		for ( int index = 0; index <= number.length-1; index++) {
			if (number[index]%range == 0) {
				flag = false;
				sum = number[index] ;
				ans = ans+sum;
				
			}
			
		}
		System.out.println("Sum Are " + ans);
		return sum;
	}

	public static void main(String[] args) {
		int [] input = {11,13,17,22,44};
		new SumOfNonPrimeNumber().getSum(input);

	}
}
