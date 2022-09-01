package anujaD;

class PrintprimeNumber {
	int count=0;
	int sum;
	int average;
	void primeNumber(int num) {
		boolean flag=true;
		for(int Index = 2;Index<=num/2;Index++) {
		if(num%Index == 0) {
			//System.out.println(num+ " is not a prime number");
			flag = false;
			 break;
		}
	}
			 if(flag == true) {
			System.out.println(num+ " is  a prime number");
			count++;
			sum=sum+num;
			average= sum / count;
		}
	}	
	
	void range(int start,int end) {
		System.out.println("count of prime numbers within same range : ");
		  for(int Index =start;Index<=end;Index++) {
			primeNumber (Index);
		  }
		  System.out.println( "Total num of prime numbers within same range : " +count);
		  System.out.println( "sum of all prime numbers within same range : " +sum);
		  System.out.println( "avg of prime numbers within same range : "  + average);
		  
	}
	public static void main(String[] args) {
		new PrintprimeNumber().range(100,120);
	}
}
