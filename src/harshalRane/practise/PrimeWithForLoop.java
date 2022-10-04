package harshalRane.practise;

public class PrimeWithForLoop {
	static void isPrime(int num) {
		boolean flag = true;
		for(int index=2;index<num/2;index++) {
			if(num%index==0) {
				flag = false;
				System.out.println(num + " Is NOT Prime");	
				break;
			}
		}
		if(flag) {
			System.out.println(num + " Is Prime");		
		}
	}
	
	public static void main(String[] args) {
		isPrime(8);
		isPrime(13);
		isPrime(5);
	}
}
