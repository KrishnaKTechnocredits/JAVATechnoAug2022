/*1. We need to do sum of first 5 prime number, using return keyword
output: (2 + 3 + 5 + 7 + 11) = 28*/

package shrutiArora;
public class Assignment15 {
	int getSumOfFirst5Prime(int totalNum) {
		int num = 2;
		int count = 1;
		int sum = 0 ;
		
		while(num>=2 && count<=totalNum) {
			boolean isPrime = isPrime(num);
			if(isPrime) {
				sum = sum + num;
			    count++;
			}
			num++;
		}
		return sum;
	}
   static private boolean isPrime(int num) {
		boolean flag = true;
		for(int index = 2 ; index <= num/2 ; index++) {
			if(num%index==0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		Assignment15 assignment15 = new Assignment15();
		System.out.println("***************************************Program to return sum of first five prime***********************");
		System.out.println("Output:");
		int sum = assignment15.getSumOfFirst5Prime(5);
		System.out.print(sum);
	}
}