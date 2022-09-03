package shivaniLikhia;
class CountPrime{
	
	int primeCount = 0;
	int primeSum = 0;
	int avgPrime = 0;
	
	void primeNumber(int num){
		boolean n = true;
		if(num<1){
			System.out.println("\n" + num +" : Given number is Invalid Number");
		}
		else{
			for(int index=2;index<=num/2;index++){
				if(num%index==0){
					n=false;
					break;
				}
			}
			if(n==true){
				System.out.println("\n" + num + " is a prime Number");
				primeCount++;
				primeSum = primeSum+num;
				avgPrime = primeSum/primeCount;
			}
		}
	}
	
	void countPrimeNumber(int startRange, int endRange) {
		for(int index=startRange;index<=endRange;index++) {
			primeNumber(index);
		}
		
		System.out.println("");
		System.out.println("Total prime count between range " + startRange + " and " + endRange + " is : " +primeCount);
		System.out.println("Sum of total Prime Number between range " + startRange + " and " + endRange + " is : " +primeSum);
		System.out.println("Average of total Prime Number between range " + startRange + " and " + endRange + " is : " +avgPrime);
	}
	public static void main(String[] args){
		
		CountPrime countPrime = new CountPrime();
		countPrime.countPrimeNumber(100,120);
		
	}
}
