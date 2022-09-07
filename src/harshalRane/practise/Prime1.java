package harshalRane.practise;

public class Prime1 {
	void isPrime(int num) {
		boolean flag=true;
		for(int index=2;index<num/2;index++)
			if(num%index==0) {
				flag = false;
				break;
			}
		if(flag) {
			System.out.println("Number is Prime " +num);
		}
	}
	
	public static void main(String[] args) {
		new Prime1().isPrime(5);
	}
}
