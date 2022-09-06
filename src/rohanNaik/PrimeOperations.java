package rohanNaik;

public class PrimeOperations {
	
	void primeRange(int start, int end) {
		int count=0;
		int sum=0;
		int avg=0;
		
		for(int num=start;num<=end;num++) {
			boolean flag=true;
		
			for(int index=2;index<=num/2;index++){
				if(num%index==0){
					flag = false;
					break;
				}
			}
			if(flag== true) {
				System.out.println(num + " is Prime!");
				count++;
				sum=sum+num;
				avg=sum/count;
			}
				
		
		}
		
		System.out.println("total count of prime numbers within the range: "+count);
		System.out.println("Sum of prime numbers within the range: "+sum);
		System.out.println("avg of prime numbers within same range: "+avg);

	}
	public static void main(String[] args) {
		PrimeOperations operations = new PrimeOperations();
		operations.primeRange(100,120);
	}
}