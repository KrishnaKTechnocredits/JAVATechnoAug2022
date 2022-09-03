//check prime numbers or not;
package maheshSantoki.primeNumberEx;
class primeNumber{
	
	void primenum(int n){
		int c=0;
		for(int i=1;i<=n;i++){
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
			System.out.println(n + " is Prime number");
		else
			System.out.println(n + " is Non-Prime number");
	}
	public static void main(String[] a){
		primeNumber primenumber = new primeNumber();
		primenumber.primenum(7);
		primenumber.primenum(5);
		primenumber.primenum(3);
		primenumber.primenum(56);
		primenumber.primenum(122);
	}
}