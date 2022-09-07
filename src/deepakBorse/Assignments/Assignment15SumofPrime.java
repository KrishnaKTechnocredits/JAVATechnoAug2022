package deepakBorse.Assignments;

public class Assignment15SumofPrime {
	int countp=0;
	void isPrime(int num) {
		boolean primeflag=true;
		for(int index=2;index<=num/2;index++) {
			if(num % index==0) {
				primeflag=false;
				break;
			}
		}
		if(primeflag==true)
				System.out.println(num);
		
		
	}
	
	void firstNnumber(int num) {
		while (countp!=num) {
			isPrime(countp);
			break;
		}
		countp++;
	}
	
	public static void main(String[] arg) {
		new Assignment15SumofPrime().firstNnumber(5);
	}

}
