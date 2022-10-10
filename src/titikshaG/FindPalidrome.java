package titikshaG;
//Assignmant 31-B
//Program 2 :
//Write a method to print all pallindrome input from given array.
//input : {"radar","techhpet","madam","maulikkilum"};
//output : radar
	         //madam
import java.util.Arrays;

public class FindPalidrome {
	boolean isPallindrome(String name) {
		int index;
		int j;
		boolean flag=true;
		for(index=0,j=name.length()-1;index<j; index++,j--) {
			if(name.charAt(index)!=name.charAt(j)) {
				flag=false;
				break;}
		}	
		return flag;
	}
	void searchingPalindromeFrromArray(String[] arr) {
		for(int index=0;index<arr.length;index++) {
			if(isPallindrome(arr[index])) {
				System.out.println(arr[index]);}
			
		}
			
	}
	public static void main(String[] args) {
		FindPalidrome  findPalidrome =new FindPalidrome ();
		String[] input={"radar","techhpet","madam","maulikkilum"};
		System.out.println("\nInput String Array: " + Arrays.toString(input));
		System.out.println("From Array input palidrom strings are :" +" ");
		findPalidrome.searchingPalindromeFrromArray(input);
		}
	}
