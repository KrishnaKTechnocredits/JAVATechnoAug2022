package asthaSrivastava;

public class PrimeNo{   // Find Prime Number

	void findPrimeNo(int num){
		boolean resultStatus = true;
		
		if(num<=0){
			System.out.println(num + ":Invalid Input");
		} else{
			for(int input= 2;input<=num/2;input++){
				if(num%input == 0){
					resultStatus = false;
					System.out.println(num +" is not a Prime Number");
					break;
				}
			}
			if(resultStatus == true){
				System.out.println(num +" is a Prime Number");
			}
		}		
	}
	
	public static void main(String[] args){
		PrimeNo primeNo =new PrimeNo();
		primeNo.findPrimeNo(15);
		primeNo.findPrimeNo(17);
		primeNo.findPrimeNo(-90);
	}
}			