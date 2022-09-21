/*
Program 2 : Return count of visible trees. [15 - 20 mins, max - 30 mins]

input : {3,7,5}
output : 2

input : {3,5,11,9,10,13}
output : 4

 */
package shridharKumbhar.Assignment11_20;

import java.util.Arrays;

public class Test4_P2 {
	
	int getAssendinght(int[] arr) {
		
		int maxNum = arr[0];
		int n =1;
		
		for(int i = 1 ; arr.length > i ;i++) {
			if(maxNum< arr[i]) {
				maxNum = arr[i];
				n++;
			}
		}
		
		return n;
	}

public static void main(String[] args) {
	Test4_P2 p2 = new Test4_P2();
	
	int[] input1 = {3,7,5};
	int[] input2 = {3,5,11,9,10,13};
	
	System.out.println("input1 : "+Arrays.toString(input1));
	System.out.println("output : "+ p2.getAssendinght(input1));
	System.out.println(" ");
	System.out.println("input2 : "+Arrays.toString(input2));
	System.out.println("output : "+ p2.getAssendinght(input2));
	
}		
}

