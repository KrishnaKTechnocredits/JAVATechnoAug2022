package deepakPatil;

public class PrimeNumber1 {
	
	void findPrime(int startIndex, int endIndex) {
		
		for(int i=startIndex; i<=endIndex; i++) {
			
			boolean status=true;
			for(int j=2; j<i; j++) {
				if(i%j==0) 
					status=false;
			}
			if(status==true)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		PrimeNumber1 primeNumber1 = new PrimeNumber1();
		primeNumber1.findPrime(3,15);

	}

}
