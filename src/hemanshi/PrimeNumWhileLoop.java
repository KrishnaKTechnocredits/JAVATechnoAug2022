package hemanshi;


public class PrimeNumWhileLoop {
	int count;
	void primeNum(int n)
	{
		boolean flag=true;
		for(int index=2;index<=n/2;index++){
			if(n%index==0){
				flag=false;
				break;
			}
		}
		if(flag==true){
			count++;
			System.out.println(n);
		}
	}
	
	void printFirst5(int iteration){
		int num=2;
		System.out.println("First Five Prime Numbers are:");
		
		while(num>=2 && count !=iteration){
			primeNum(num);
			num++;
		}
	}
	
	public static void main(String[] args){
		new PrimeNumWhileLoop().printFirst5(5);

     }
}
