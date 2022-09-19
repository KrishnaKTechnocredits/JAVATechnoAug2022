package shrutiArora;
public class Assignment14 {
	int count;
    private void primeNum(int num) {
		  boolean flag = true;
		     for(int index = 2 ; index<=num/2;index++) {
		    	if(num%index==0) {
				   flag = false;
				   break;
			}
		}
		if(flag) {
			System.out.println(num);
			count++;
		}
	}
	
	void firstFivePrimeNum(int num) {
		 int n = 2 ;
		while(n>=2 &&count<num) {
			primeNum(n);
			n++;
		}
	}
	public static void main(String[] args) {
		Assignment14 assignment14 = new Assignment14();
		System.out.println("First Five Prime numbers are: ");
		System.out.println("Output:");
		assignment14.firstFivePrimeNum(5);
	}
}