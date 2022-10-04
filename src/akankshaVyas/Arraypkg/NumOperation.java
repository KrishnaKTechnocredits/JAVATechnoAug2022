/*
 * Assignment - 32 : 30th Sep'2022

Program 1 : 
Write a method to verify number is Armstrong or not.

input : 153
output : 153 is an Armstrong number

input : 123
output : 123 is not an Armstrong number
 
Program 2 : 
Write a method to return reverse number.
input : 123
output : 321

Program 3 : 
write a method to verify number is palindrome.

input : 1221
output : 1221 is a palindrome number

input : 1231
output : 1231 is not a palindrome number
 */


package akankshaVyas.Arraypkg;

public class NumOperation {

	int getArmstrongNum(int num) {
		int orignalNum=num;int sum = 0;
		System.out.println("Remainder is -");
		while(num>0) {
			int r=num %10;		//give remainder
						System.out.println(r);	 //print remainder
			sum = sum +(r*r*r); 	//sum of remainder^3 
			num=num/10; 		//num short
		}
		
		System.out.println("total sum is - " + sum);		// total sum
		if(sum==orignalNum)
			System.out.println(orignalNum + " is Armstrong num \n");
		else
			System.out.println(orignalNum + " is not Armstrong num \n");
		return sum;
		}
		
int getRevNum(int num) {
	int orignalNum=num;
	int revNum=0;
		while(num>0) {
		int r=num%10;
		num=num/10;
		revNum=revNum*10+r;
	}
	//	System.out.println(" \nThe reverse num of " +orignalNum + " is - " +revNum);
		return revNum;
}


 void getPallindromeNum(int num) {
	 
	 if(num==getRevNum(num))
		 System.out.println(num + " is Palindrome \n");
	 else
		 System.out.println(num + " is not Palindrome \n");
 }

void display(int num) {
	System.out.println(" \nThe reverse num of " +num + " is - " +getRevNum(num));
	}

public static void main (String[] args) {
	NumOperation numOperation=new NumOperation();
	numOperation.getArmstrongNum(153);
	numOperation.getArmstrongNum(123);
	numOperation.getPallindromeNum(1221);
	numOperation.getPallindromeNum(1231);
	numOperation.display(123);
	
}
}
