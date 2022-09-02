package avni;
/* Assignment - 14 : 2nd Sep'2022
Using While loop

Program 1: 
Print first N prime numbers.
N should be passed as parameter in the method.
Hint : 5 pass as parameter, method should print first 5 prime numbers.

sample input : 5
output : 2
              3
              5
              7
              11 */

public class PrimeWithCount{
	int count=0 ;
	
	void prime(int n){
		boolean flag = true ;
		int i=2 ;
		while(i<n){
			if(n%i==0){
				flag=false ;
				break ;
			}
				i++ ;
		}
			if(flag == true){
				System.out.println(n);
				count++ ;
			}
	}
	
	void primeCount(int c){
		if(c>0){
			System.out.println("2");
			int num = 3 ;
			while(count<c-1){
				prime(num);
				num++ ;
			}
		}
	}
	
	public static void main(String[] args){
		PrimeWithCount primeWithCount = new PrimeWithCount();
		primeWithCount.primeCount(5);
	}
}
