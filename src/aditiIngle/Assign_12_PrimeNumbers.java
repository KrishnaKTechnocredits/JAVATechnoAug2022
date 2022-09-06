package aditiIngle;
class Assign_12_PrimeNumbers{
	static int count =0;
	static int sum =0;
	void primeNumbers(int startIndex, int endIndex){	
		for(int index=startIndex; index<=endIndex; index++){
			boolean flag = true;
			for(int j=2; j<index; j++){
				if(index%j==0){
					flag = false;
				}
			}
			if(flag == true){
					System.out.println(index);
					count++;
					sum= sum+index;
				}
		}
		
	}
	public static void main(String[] args){
		Assign_12_PrimeNumbers assign_12_PrimeNumbers = new Assign_12_PrimeNumbers();
		System.out.println("Prime numbers between range 100 and 200 are: ");
		assign_12_PrimeNumbers.primeNumbers(100,200);
		System.out.println("Count of all prime numbers between 100 and 200 is: "+ count);
		System.out.println("Sum of all prime numbers between 100 and 200 is: "+ sum);
		System.out.println("Average of all prime numbers between 100 and 200 is: "+ (sum/count));
	}
}