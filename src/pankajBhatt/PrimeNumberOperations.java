package pankajBhatt;

public class PrimeNumberOperations {
	int count=0;
	int sum =0; 
	double avg;

	void primeNumber(int number) {
		int flag = 0;
		for(int i =2; i <= number / 2; i++){
			if( number % i == 0 ){
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println(number + ", is prime");
			count++;
			sum+=number;
		}
	}
	
	void checkRange(int start, int end) {
		for ( int index = start ; index <= end ; index++) {
			primeNumber(index);
		}
		System.out.println("Total prime numbers in range "+start+", "+end+" is : "+count);
		System.out.println("Sum of prime Numbers in range "+start+", "+end+" is : "+sum);
		System.out.println("Average of prime Numbers in range "+start+", "+end+" is : "+(sum/count));

	}
	
	public static void main(String[] args) {
		PrimeNumberOperations primeNumberOperations = new PrimeNumberOperations();
		primeNumberOperations.checkRange(100, 120);
	}

}
