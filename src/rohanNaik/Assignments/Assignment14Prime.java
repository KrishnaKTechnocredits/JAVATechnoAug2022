//with for loop
package rohanNaik.Assignments;
class Assignment14Prime{
	
	boolean flag=true;
	int index=0;
	
	void isPrimeFor(int num) {
				
		for(int n=1; n<=num; n++) {
			for (index=2; index <= n / 2; index++) {
				if (n % index == 0) {
					//System.out.println(n + " is not prime");
					flag = false;
					break;
				}
				else
					flag = true;
			}
		
			if (flag == true) {
				System.out.println(n);
			}
		}
	}
	
	
	void isPrimeWhile(int number) {
		
		int m=1;
		while(m<=number) {
			for (index=2; index <= m / 2; index++) {
				if (m % index == 0) {
					//System.out.println(m + " is not prime");
					flag = false;
					break;
				}
				else
					flag = true;
			}
		
			if (flag == true) {
				System.out.println("*"+m);
			}
			m++;
		}
		
		
		
	}
	
	public static void main(String[] args) {
		Assignment14Prime prime = new Assignment14Prime();

		prime.isPrimeFor(20);
		System.out.println("-----------------");
		prime.isPrimeWhile(20);
	}
}