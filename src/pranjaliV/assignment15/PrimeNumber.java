/*Assignment - 15 : 5th Sep'2022*
	we need to do summ of first 5 prime number, 
	using return keyword
	output: (2+3+5+7+11) = 28
*/
              
package pranjaliV.assignment15;

public class PrimeNumber {
	
	int primeRange(int n) {
		int i=1;//to define the while range
		int num=2;//to check if the number is prime
		int sum =0;
		System.out.println("Sum of first "+n+" Prime Numbers is : ");
		while(i<=n) {
			boolean flag = true;
			for(int index=2; index<=num/2; index++) {
				if (num%index ==0) {
					flag = false;
					break;
				}			
			}
			if(flag==true) {
				sum = sum + num;
				//System.out.println(num);
				i++;
			}
			num++;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		int sum = primeNumber.primeRange(5);
		System.out.println(sum);
	}
}
