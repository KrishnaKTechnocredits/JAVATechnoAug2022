package manjiri.primenumbers;

public class PrintPrimeNumbers {
	int count;
	int sum;
	
	void checkPrimeNumber(int num) {
		boolean flag = true;
		for (int index = 2;index <= Math.sqrt(num);index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			count ++;
			sum += num;
			System.out.println(num +" "+ "is a prime number");
		}
	}
	
	void printAllPrimeNumbers(int startNum, int endNum) {
		if (startNum < endNum) {
			for (int num = startNum;num <= endNum; num++) {
				checkPrimeNumber(num);
			}
			System.out.println("Total prime numbers in range "+ startNum +" and "+ endNum +" is: "+count);
			System.out.println("Sum of prime numbers in range "+ startNum +" and "+ endNum +" is: "+sum);
			System.out.println("Average of prime numbers in range "+ startNum +" and "+ endNum +" is: "+((float)sum/count));
		}else {
			System.out.println("Invalid Range!!");
		}		
	}
	
	public static void main(String[] args) {
		new PrintPrimeNumbers().printAllPrimeNumbers(100,120);
		
	}
}
