package sohail;
public class PrimeRange {	
	int primeSum;
	int primeaverage;
	int count;
	void calPrime(int num){	
			boolean flag=true;
			for (int index=2; index<=num/2; index++) {
				if(num%index==0) {
					flag=false;	
					count++;
					System.out.println("Not Prime "  +num );
					break;				
			}
			if(flag==true) {
				count++;
				System.out.println("No is Prime"  +num);
				primeSum=primeSum+num;		
				primeaverage=primeSum/count;
			}			
		}
			System.out.println("Sum of Prime Numbers"+primeSum);
			System.out.println("Average of Prime Numbers" +primeaverage);
	}	
	
	void printprimenum(int start, int end) {
		for(int num=start;num<=end;num++) {
			calPrime(num);
		}
		
	}
	public static void main (String[] args) {
		PrimeRange primerange= new PrimeRange();
		primerange.printprimenum(100,120);
		
	}

}