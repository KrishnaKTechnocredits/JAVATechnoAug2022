/*
 Program 2 :
Write a method to print all pallindrome input from given array.

input : {"radar","techhpet","madam","maulikkilum"};
output : radar
         madam

 */

package swapnilMaheshwari.Assignment31_PalindramePrograms;

import java.util.Scanner;

public class PalindramStringFromArray {
	boolean isPalindram (String[] arr) {
		boolean flag= true;
			String str=arr.toString();
			for (int i=0 , j=str.length()-1;i<j;i++,j--) {
				if (str.charAt(i)!=str.charAt(j)) {
					flag=false;
					break;
				}
				
			}
			return flag;
		}
		public static void main(String[] args) {
			PalindramString palindramString = new PalindramString();
			boolean flag;
			String[] arr= {"radar","techhpet","madam","maulikkilum"};
			for (int i=0;i<arr.length;i++) {
			flag=palindramString.isPalindram(arr[i]);
			if(flag==true) {
				System.out.println(arr[i]);
			}
		}
		}

}
