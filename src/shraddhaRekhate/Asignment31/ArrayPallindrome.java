package shraddhaRekhate.Asignment31;

import java.util.Arrays;

public class ArrayPallindrome {
	//radar-radar
		boolean isPallindrome(String str) {
			for(int i=0,j=str.length()-1;i<j;i++,j--) {
				if(str.charAt(i)!=str.charAt(j)) {
					return false;
					//System.out.println(str+ " is not pallindrome");
					//break;
				}
				//System.out.println(str+" is pallindrome");
			}
			return  true;
		}
		
		 void printAllPallindromeInputFromGivenArray(String[] input) {
			boolean flag=true;
			System.out.println("input"+Arrays.toString(input));
			for(int index=0;index<input.length;index++) {
				  flag=isPallindrome(input[index]);
				if(flag) {
					 System.out.println(input[index]);
				}
			}
		}
		
		
		public static void main(String[] args) {
			ArrayPallindrome arryPallindrom= new ArrayPallindrome();
			String[] input= {"radar","techhpet","madam","maulikkilum"};
			arryPallindrom.printAllPallindromeInputFromGivenArray(input);
			
		}
	

}
