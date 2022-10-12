package shraddhaRekhate.Assignment24;
//Write a method to replace element with sum of other elements.
//
//input : {12,2,11,17}
//output : {30,40,31,25}
//
//Hint : 12 should be replaced with - 2+11+17
//          2 should be replaced with - 12 + 11+ 17
//          11 should be replaced with - 12+2+17
//          17 should be replaced with - 12+2+11 

import java.util.Arrays;

public class ReplaceElementWithSum {
	void replaceElementWitSumofOther(int[] input){
		int[] output=new int[input.length];
	 for(int index=0;index<input.length;index++) {
		 int sum=0;
		 for(int innerIndex=0;innerIndex<input.length;innerIndex++) {
			 if(index!=innerIndex) {
				 sum=sum+input[innerIndex];
				 } 
		 }
		 output[index]=sum;
	 }
	 System.out.println(Arrays.toString(output));
	 }
  public static void main(String[] args) {
	  ReplaceElementWithSum replaceElementWithSum= new ReplaceElementWithSum();
	  int[] input={12,2,11,17};
	  replaceElementWithSum.replaceElementWitSumofOther(input);
  }
	
	  
}
