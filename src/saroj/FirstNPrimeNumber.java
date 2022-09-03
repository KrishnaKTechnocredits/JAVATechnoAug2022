package saroj;

public class FirstNPrimeNumber {

void primeCount(int num){
		
		int count = 0;
		int chkNum=2;	
		
		while(count<num){
			int index =2;
			boolean status = true;
			
			while(index<=chkNum/2 ){
				if(chkNum % index  == 0){
				
				status = false;
				
				break;
				}
				index++;
			}			
			if(status){
			System.out.println(chkNum + " is a prime number");
			count++;
			}
			chkNum++;
		}
		
}		
	public static void main(String[] args){
		FirstNPrimeNumber firstNPrimeNumber = new FirstNPrimeNumber();
		firstNPrimeNumber.primeCount(5);
	}
}
