
//Program 1 : 
//Write a method to return reverse number.
//input : 123
//output : 321

package titikshaG;

public class Reversenumber {
	void numberReverse(int number) {
		
		int reverNumber=0;;
		int reminder=0;;
		while(number>0) {
			reminder=number % 10;//remainder = 1234 % 10 = 4
			reverNumber=reverNumber*10+reminder;//reverse = 0 * 10 + 4 = 0 + 4 = 4
			number=number/10;//number = 1234 / 10 = 123
			}
			System.out.println("Reverse of number is "+ " " + reverNumber);
		}
//Program 2 : 
//write a method to verify number is palindrome.
//input : 1221
//output : 1221 is a palindrome number
//input : 1231
//output : 1231 is not a palindrome number
	
	void checkingPalindromeNumber(int number) {
		int originalnumber=number;
		int reverNumber=0;
		int reminder=0;
		while(number>0) {
			reminder=number % 10;
			reverNumber=reverNumber * 10 + reminder;
			number=number / 10;
		}
			if(originalnumber==reverNumber) 
			System.out.println(originalnumber +" "+"Number is palindrome");
			else 
			System.out.println(originalnumber +" "+"number is not palindrome");}
//Program 3:
//Program 3.1 : 
//Write a method to verify number is Armstrong or not.
//input : 153
//output : 153 is an Armstrong number
//input : 123x
//output : 123 is not an Armstrong number
	void armstromeNumber(int number)
	{
		int OriginalNumber=number;
		int remainder=0;
		int sumOfDigit=0;
		while(number>0) {
			remainder=number%10;//It will give output as 3 for input 153
			sumOfDigit=sumOfDigit+remainder*remainder*remainder;//0+3*3*3
			number=number/10;//153/10=15
			}
		if(OriginalNumber==sumOfDigit) {
			System.out.println(OriginalNumber +" "+"Number is armstrome");}
		else {
			System.out.println(OriginalNumber +" "+"Number is not armstrome");}
	}
	

	public static void main(String[] args) {
		Reversenumber reversenumber=new Reversenumber();
		int input=1234;
		System.out.println("-------------Program 1-REVERSE NUMBER-----------------");
		System.out.println("Input is "+ input);
		reversenumber.numberReverse(input);
		System.out.println();
		
		System.out.println("-------------Program 2-PALINDROME-----------------");
		int input2=1221;
		int input3=1231;
		int input4=1234;
		System.out.println("Input is "+ input2);
		reversenumber.checkingPalindromeNumber(input2);
		System.out.println();
		System.out.println("Input is "+ input3);
		reversenumber.checkingPalindromeNumber(input3);
		System.out.println();
		System.out.println("Input is "+ input4);
		reversenumber.checkingPalindromeNumber(input4);
		System.out.println();
		
		System.out.println("-------------Program 3-ARMSTROME-----------------");
		int arminput1=153;
		System.out.println("Input for Armstrome number is:" +" "+arminput1);
		reversenumber.armstromeNumber(arminput1);
		System.out.println();
		int arminput2=123;
		System.out.println("Input for Armstrome number is:" +" "+arminput2);
		reversenumber.armstromeNumber(arminput2);}
	}


