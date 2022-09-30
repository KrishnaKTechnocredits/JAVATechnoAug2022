/*Program 3 : 
write a method to verify number is palindrome.

input : 1221
output : 1221 is a palindrome number

input : 1231
output : 1231 is not a palindrome number*/

package gauravSahu.assignments;

import java.util.Arrays;

public class Assignment32C {
	
	void getPallindrom(int num) {
		int givennum = num;
		int remain = 0;
		String revnum = " ";
		while(num>0) {
			remain = num%10;
			num = num/10;
			revnum = revnum + remain;
			
		}if(String.valueOf(givennum) == revnum) {
			System.out.println(givennum + " It is a palindrom number");
		}else {
			System.out.println(givennum + " It is not a palindrom number");
		}
	}
	
	public static void main(String[] args) {
		Assignment32C a32 =new Assignment32C();
		int[] arr  = {1221,1231};
		System.out.println("Given number string : " + Arrays.toString(arr));
		for(int num : arr) {
			a32.getPallindrom(num);
			
		}
	}

}
