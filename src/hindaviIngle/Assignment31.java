/*
 * Assignment - 31 : 29th Sep'2022

Program 1 :
Write a method to find whether given String is pallindrome.

input : radar
output : radar is pallindrom

input : aabcbaa
output : aabcbaa is pallindrom

input : abcabc
output : abcabc is not a pallindrom


Program 2 :
Write a method to print all pallindrome input from given array.

input : {"radar","techhpet","madam","maulikkilum"};
output : radar
         madam
 */

package hindaviIngle;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment31 {
	
	boolean getPalindromString(String name){
		boolean flag=false;
		for(int i=0,j=name.length()-1;i<j;i++,j--){
			if(name.charAt(i)!=name.charAt(j)){
				flag =true;
				System.out.println(name+" is not pallindrom");
				break;
				}							
		}
		if(!flag){
			System.out.println(name+" is pallindrom");
		}
		return flag;
	}
	
	void getPalidromfromArrya(String[] strArry) {
		//boolean flag;
		for(int index=0;index<=strArry.length-1;index++) {
		boolean flag= getPalindromString(strArry[index]);	
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Assignment31 a31=new Assignment31();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter counter to check multiple Strings: ");
		int count=sc.nextInt();
		while(count>0) {
		System.out.println("\n");
		System.out.println("Enter String : ");
		String name=sc.next();
		a31.getPalindromString(name);
		count--;
		}
		System.out.println("\n");
		String[] strArry= {"radar","techhpet","madam","maulikkilum"};
		System.out.println("Input Array : "+Arrays.toString(strArry));
		System.out.println("\n");
		a31.getPalidromfromArrya(strArry);

	}

}
