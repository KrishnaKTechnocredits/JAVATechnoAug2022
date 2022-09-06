package sohail;
public class PrimeNumberN {
	void calPrime(int num){	
		boolean flag=true;
		for (int index=2; index<=num/2; index++) {
			if(num%index==0) {
			flag=false;
			break;				
		}
		if(flag==true) {			
			System.out.println(num);			
		}	
		break;
	}
	
}

	void printprimenum(int end) {
	for(int num=1;num<=end;num++) {
		calPrime(num);
	}
	
}
public static void main(String[] args) {
	PrimeNumberN primenumbern= new PrimeNumberN();
	primenumbern.printprimenum(50);

	}

}
