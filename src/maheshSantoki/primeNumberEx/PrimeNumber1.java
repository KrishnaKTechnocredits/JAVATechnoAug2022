//Prime number
//Mahesh santoki
package maheshSantoki.primeNumberEx;
class PrimeNumber1
{			
			void prime(int n)
			{
				if(n==1)
				{
					System.out.println( n + " Not prime number");
				}
				else if(n==0)
				{
					System.out.println( n + " invalid number");
				}
				else if(n>1){
				boolean flag=true;
				for(int i=2;i<=n/2;i++)
				{
					if(n%i == 0)
					{
						flag=false;
						System.out.println(n + " is not prime number.");
						break;
					}
				}
					if(flag==true)
						{
							System.out.println(n+" is prime number");
						}
				}
				else 
					System.out.println( n + " Is Invalid number");
			}
			public static void main(String[] a){
				PrimeNumber1 primenumber = new PrimeNumber1();
				primenumber.prime(15);
				primenumber.prime(17);
				primenumber.prime(-90);
				primenumber.prime(1);
			}
}
