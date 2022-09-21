package ashishBramhe;

public class A14_PrimeNumberWhileLoop {
	
	void printFirstNPrimeNumbers(int n) {
		boolean flag = true;
		int count=0, num=2;
		System.out.println("First " + n + " prime numbers are : ");
		while(count!=n) {
			flag = true;
			for(int i=2; i<=(num/2); i++) {
				if(num%i==0) {
					flag = false;
					break;
				}				
			}
			if(flag==true) {
				System.out.println(num);
				count++;
			}			
			num++;		
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A14_PrimeNumberWhileLoop primeNumberWhileLoop = new A14_PrimeNumberWhileLoop();
		primeNumberWhileLoop.printFirstNPrimeNumbers(5);
	}
}
