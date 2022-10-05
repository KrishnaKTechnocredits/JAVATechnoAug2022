package swapnilMaheshwari.Assignment32_Arms_Reverse_PalindNumbers;
/*
 Program 3 : 
write a method to verify number is palindrome.

input : 1221
output : 1221 is a palindrome number

input : 1231
output : 1231 is not a palindrome number

 
 */

import java.util.Scanner;

public class PalindramNumber {
	void getPalindramNumber (int num) {
		int r=0;
		int reverseNum=0;
		int OrginalNum=num;
		while (num>0) {
			r=num%10;
			reverseNum=reverseNum*10+r;
			num=num/10;
		}
		if (reverseNum==OrginalNum)
			System.out.println("Number is Palindram :"+OrginalNum);
		else
			System.out.println("Number is not a Palindram:"+OrginalNum);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=scanner.nextInt();
		new PalindramNumber().getPalindramNumber(num);
	}
}
