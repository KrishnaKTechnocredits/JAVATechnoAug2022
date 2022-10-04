/*
 Assignment - 29 : 27th Sep'2022
Program 1 : 
Shift all Zero's at the end of an array.
input : {10,0,0,3,4,5,0,9}
output : {10,3,4,5,9,0,0,0}
Program 2 : 
Shift all zero's at the beginning of the an array.
input : {10,0,0,3,4,5,0,9}
output : {0,0,0,10,3,4,5,9}*/

package hemanshi;
import java.util.Arrays;

public class Assignment_29 {
	
       int[] getEndZero(int[] input) {
    	   int[] output = new int[input.length];
   		   for(int index=0, outputIndex=0; index<input.length; index++) {
   			   if(input[index]!=0) {
   				     output[outputIndex] = input[index];
   				     outputIndex++;
    			   
    		   }
    	   }
    	   return output;
    	   
       }
       
       int[] getStartZero(int[] input) {
    	   int[] output = new int[input.length];
    	   int countZero=0;
    	   for(int index=0; index<input.length; index++) {
    		   if(input[index]==0) {
    			   countZero++;
    		   }
    	   }
    	   
    	   for(int index=0, outputIndex=countZero; index<input.length; index++ ) {
    		   if(input[index]!=0) {
    			   output[outputIndex]=input[index];
    			   outputIndex++;
    		   }
    	   }
    	   return output;
       }
       
       public static void main(String[] args) {
       Assignment_29 assignment_29 = new Assignment_29();
       
       int[] n1 = {10,0,0,3,4,5,0,9};
       System.out.println("Shift all Zero at the end.");
       System.out.println("Input: "+Arrays.toString(n1));
       System.out.println("Output: "+ Arrays.toString(assignment_29.getEndZero(n1)));
		System.out.println("");
		
		
		System.out.println("Shift all Zero's at the start.");
		System.out.println("Input: "+Arrays.toString(n1));
		System.out.println("Output: "+ Arrays.toString(assignment_29.getStartZero(n1)));
		System.out.println("");
       }
}
