package komalShrivastava;

public class PrimeNumberSumAvg {
	int count = 0;
	int sum = 0;
	int avg;
	
	void primeNumber(int start, int end) {	
		System.out.println("Prime Numbers in the range " + start + ":" + end + " are");
		for(int num=start; num<=end; num++) {
			boolean primeFlag = true;
			for(int index=2;index<start;index++) {
				if(num%index == 0) {
					primeFlag=false;
					break;
				}	
			}
			if(primeFlag == true) {
				System.out.print(num + " ");
				count++;
				sum = sum+num;
			}
		}
	}
	
	void primeSumAvg() {
		avg = sum/count;
		System.out.println();
		System.out.println("Total Prime Numbers are " + count);
		System.out.println("Sum of Prime Numbers is : " + sum);
		System.out.println("Avg of Prime Numbers is : " + avg);
	}
	
	public static void main(String[] args) {
		PrimeNumberSumAvg primeNumberSumAvg = new PrimeNumberSumAvg();
		primeNumberSumAvg.primeNumber(100, 120);
		primeNumberSumAvg.primeSumAvg();
	}
}