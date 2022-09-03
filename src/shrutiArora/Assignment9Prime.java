package shrutiArora;
public class Assignment9Prime {
	void printPrimeNum(int num) {
		 boolean flag = true ;
		   if(num>0) {
			   for(int index = 2 ; index<=num/2;index++) {
			    	if(num%index==0) {
					  System.out.println(num + " number is not a Prime number");
					   flag = false;
					   break;
			        }
			  }
			  if(flag) {
				System.out.println(num +" is a prime number");
			  }
		 }
		 else {
			System.out.println( num +" not a valid number");
		 }
	}
	public static void main(String[] args) {
		Assignment9Prime assignment9Prime = new Assignment9Prime();
		System.out.println("**************************************PrimeNumberProgram**********************************");
		assignment9Prime.printPrimeNum(15);
		assignment9Prime.printPrimeNum(17);
		assignment9Prime.printPrimeNum(-90);
	}
}