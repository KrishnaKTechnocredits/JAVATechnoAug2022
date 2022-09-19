package hardikBhatia.Assignments;

public class Assignment15FivePrimeNumberSumReturnType {
	boolean checkingPrimeNumber(int number) {
		for(int index=2;index<=number/2;index++){
			if(number%index==0){
				return false;
			}	
		}
		return true;
	}
	
	void gettingSumPrimeNumber(int number) {
		int count = 0;
		int sum = 0;
		while(count <= 5) {
			if(checkingPrimeNumber(number)) {
				sum = sum + number;
				count++;
			}
		}
		System.out.println("Sum of PrimeNumber " + sum);
	}
	
	public static void main(String[] args) {
		Assignment15FivePrimeNumberSumReturnType fivePrimeNumberSumReturnType = new Assignment15FivePrimeNumberSumReturnType();
		fivePrimeNumberSumReturnType.gettingSumPrimeNumber(1);
	}
}
