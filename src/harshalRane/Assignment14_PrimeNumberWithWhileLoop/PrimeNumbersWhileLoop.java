package harshalRane.Assignment14_PrimeNumberWithWhileLoop;

class PrimeNumbersWhileLoop
{
	int count;
	void primeNumbers(int num)
	{
		boolean flag=true;
		for(int index=2;index<=num/2;index++){
			if(num%index==0){
				flag=false;
				break;
			}
		}
		if(flag==true){
			count++;
			System.out.println(num);
		}
	}
	
	void printFirstFive(int iteration){
		int num=2;
		System.out.println("First Five Prime Numbers are:");
		
		while(num>=2 && count !=iteration){
			primeNumbers(num);
			num++;
		}
	}
	
	public static void main(String[] args){
		new PrimeNumbersWhileLoop().printFirstFive(5);
	}
}