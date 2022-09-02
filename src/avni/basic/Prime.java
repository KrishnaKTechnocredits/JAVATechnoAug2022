package avni.basic;
class Prime{

   void isPrime(int num){
	   if(num>0){
			boolean flag = true;
			int n=(num/2);
			for(int i=2;i<=n;i++){
				if(num%i ==0){
					flag = false;
					break;
				}
			}
		if(flag = false)
			System.out.println("not prime");
		else
			System.out.println("prime");
	   }
	   
    }
	public static void main(String[] args){
		Prime prime = new Prime();
		prime.isPrime(17);
		prime.isPrime(18);
	}
}