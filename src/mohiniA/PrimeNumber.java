package mohiniA;

class PrimeNumber{
		void isPrime(int num){
			boolean status= true;
				if(num > 0){
					for(int index=2 ;index<=num/2 ;index++)
					{
						if(num % index ==0){
							status=false;
							System.out.println(num + " Number is not PrimeNumber");
							break;
						}
					}
						if(status == true)
							System.out.println(num + " Number is PrimeNumber");
				}else
					System.out.println(num + " Invalid input");
		}

	public static void main(String[] args){
		PrimeNumber num1 = new PrimeNumber();
		num1.isPrime(15);
		num1.isPrime(17);
		num1.isPrime(-90);
	}
	
}