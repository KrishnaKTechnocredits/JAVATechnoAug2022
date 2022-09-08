package harshalRane.practise;

public class PrimeMethodInsideMethod {
static int count=0;
	
	static  boolean isPrime(int num) {
		boolean flag=true;
		int index=2;
		
		while(index<=num/2) {
			if(num%index==0) {
				flag=false;
				break;
			}
			index++;
		}
		if(flag) {
			count++;
			System.out.println(num);
		}
		return true;
	}
	
	static int firstnPrime(int loop) {
		int number=2;
		while(count<loop) {
			isPrime(number);
			number++;
		}
		return number;
	}
	
	public static void main(String[] args) {
		firstnPrime(5);
	}
}
