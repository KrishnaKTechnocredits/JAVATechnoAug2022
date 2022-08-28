package sagarY;

class PrimeList{

	void showPrime(int num1, int num2){
		if (num1==1){
			boolean status=true;
			for(int index1=num1; index1<=num2; index1++){
				status=true;
				for (int index2=2; index2<=Math.sqrt(index1); index2++){
					if(index1%index2==0){
						System.out.print("NonPrime Numbers between 2 to 50 are: ");
						System.out.println(index1 + "  ");
					status=false;
					break;
					}
				}
				if(status==true){
				System.out.print("Prime Numbers between 2 to 50 are: ");
				System.out.println(index1 + "  ");
				}
			}	
		}else
			System.out.println("1 is neither a Prime number nor a Composite number.");
	}
	public static void main(String[] args){
		PrimeList primeList = new PrimeList();
		System.out.println();
		primeList.showPrime(1,1);
		primeList.showPrime(2,50);
		System.out.println();
	}
}
