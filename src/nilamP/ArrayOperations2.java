/*Write a method to replace element with sum of other elements.

input : {12,2,11,17}
output : {30,40,31,25}

Hint : 12 should be replaced with - 2+11+17
          2 should be replaced with - 12 + 11+ 17
          11 should be replaced with - 12+2+17
          17 should be replaced with - 12+2+11 */
package nilamP;

import java.util.Arrays;

public class ArrayOperations2 {
 int [] getNumReplaceWith(int [] input) {
	 
	 int [] output= new int [input.length];
	 
	 for(int i=0;i<input.length;i++) {
		 int sum=0;
		 for(int j=0; j<input.length;j++) {
			 if(i != j) {
				 sum =sum+input[j];
			 }
		 }
		 output[i]=sum;
	 }
	return output;
	 
 }
 public static void main(String args[]) {
	 ArrayOperations2 ao = new ArrayOperations2();
	 int [] intput= {12,2,11,17};
	 System.out.println("Input : "+Arrays.toString(intput));
	 int [] output=ao.getNumReplaceWith(intput);
	 System.out.println("Output : "+Arrays.toString(output));
 }
}
