/*Create a class to satisfy below requirements. 
 a) Print all the prime numbers between range 100->120. (parameterized method)
     Print total count of prime numbers within same range.
     Print sum of all prime numbers within same range
     Print avg of prime numbers within same range
*/
package asthaSrivastava.primeNumber;

public class PrimeNoFromRange {
	int sum =0;
	int avg =0;
	int count =0;
	
	void checkPrimeNo( int num) {
		boolean primeFlag = true;
		for (int index=2;index<=num/2;index++) {
			if(num%index==0) {
				primeFlag =false;
				break;
		}
	}
		if(primeFlag == true) {
			System.out.println(num +" is a Prime Number");
		}
			count ++;
			sum = sum + num;
			avg = (sum/count);
	}			

	void printAllPrimeNum(int startIndex, int endIndex){
		for(int num=startIndex;num<=endIndex;num++) {
			checkPrimeNo(num);
		}
			System.out.println("Sum of all the Prime Number is: " + sum);
			System.out.println("Average of all the Prime Number is: " + avg);
			System.out.println("Total prime number within range from "+startIndex+" to "+endIndex+" are: " +count);
	}
	
	public static void main(String[] args) {
		new PrimeNoFromRange().printAllPrimeNum(100,120);
	}
}
