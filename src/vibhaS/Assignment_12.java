package vibhaS;

public class Assignment_12 {
	int primeCount=0;
	int sumOfPrime=0;
	int avgOfPrime=0;
	
	void getPrimeNum(int num) {
		boolean flag=true;
		for(int index=2;index<=num/2;index++) {
			if(num%index==0) {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("Given Number is  a prime number "+num);	
			primeCount++;
			sumOfPrime=sumOfPrime+num;
			avgOfPrime=sumOfPrime/primeCount;
		}
	}
	
	void getProcessData(int num1,int num2) {
		for(int index=num1;index<=num2;index++) {
			getPrimeNum(index);
		}
		System.out.println("");	
		System.out.println("Total prime count is "+primeCount);
		System.out.println("Total Sum of prime Num is "+sumOfPrime);
		System.out.println("Total Average of prime Num is "+avgOfPrime);
	}
	
	public static void main(String[] args) {
		Assignment_12 assignment_12=new Assignment_12();
		assignment_12.getProcessData(100,120);
	}
}
