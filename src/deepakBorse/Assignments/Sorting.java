package deepakBorse.Assignments;

import java.util.Arrays;

class Sorting {
 void sortofArray(int[] input){
     int[] output=new int[input.length];
     for(int index=0; index<input.length;index++){
         for(int outindex=1;outindex<input.length;outindex++){
             if (input[index]<=input[outindex] &&index!=outindex){
                 output[index]=input[index];
             }
             System.out.println(Arrays.toString(output));
         }
     }
    
 }
 
 public static void main(String[] args) {
	 Sorting Sortprogram=new Sorting();
     
     int[] input={10,10,11,12,14,15,11,0,1,0,0};
     Sortprogram.sortofArray(input);
     //System.out.println("Hello, World!");
 }
}