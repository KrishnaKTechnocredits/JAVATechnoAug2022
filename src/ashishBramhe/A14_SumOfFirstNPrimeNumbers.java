package ashishBramhe;

public class A14_SumOfFirstNPrimeNumbers {

	int getSumOfFirstNPrimeNumbers(int n) {
		System.out.println("Sum of first " + n + " prime numbers is : ");
		System.out.print("(");
		int sum=0, count=0, num=2;
		boolean flag=true;
		while(count!=n) {
			flag = true;
			for(int i=2; i<=(num/2); i++) {
				if(num%i==0) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				if(count==(n-1))
					System.out.print(num + ") = ");					
				else
					System.out.print(num + "+");					
				
				sum=sum+num;
				count++;
			}
			num++;
		}		
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A14_SumOfFirstNPrimeNumbers sumOfFirstNPrimeNumbers = new A14_SumOfFirstNPrimeNumbers();
		System.out.println(sumOfFirstNPrimeNumbers.getSumOfFirstNPrimeNumbers(5));
	}
}
