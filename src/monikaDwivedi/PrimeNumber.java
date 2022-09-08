
package monikaDwivedi;

class PrimeNumber{	
	static void checkPrime(int n){
		int i;
		boolean flag=true;
		if(n==1 || n==0) {
			System.out.println(n+" is not a prime number.");
		}if(n<0) {
			System.out.println(n+" is not a valid number.");
		}
		else {
			for(i=2;i<=n/2;i++){
				if(n%i==0){
					System.out.println(n+" is not a prime number.");
				flag=false;
			break;
		}
	}
			if(flag==true) { System.out.println(n+" is a prime number."); }
	}
}
	public static void main(String args[]){
	checkPrime(15);
	checkPrime(17);
	checkPrime(-90);
	}
}
