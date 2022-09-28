package shraddhaRekhate.Assignment22;

import java.util.Arrays;

public class ReplaceIndex {
	int[] replaceCurrentIndexWithZero(int[] input){
		  //to declare output array
		  int[] output= new int[input.length];
	      for (int index=0;index<input.length-1;index++){
		    if(input[index]>input[index+1]){
			  output[index]=0;
		    }else{
				output[index]=input[index];
			}
	      }
	     output[input.length-1]=input[input.length-1];
		  return output;
	  }
	  
	  
	   public static void main(String[] args){ 
	      ReplaceIndex replaceIndex= new ReplaceIndex();
		  int[] input={10,20,30,22,44,21,92,89};
		  System.out.println("input array is"+ Arrays.toString(input));
		  int[] output=replaceIndex.replaceCurrentIndexWithZero(input);
		  System.out.println("output array is"+ Arrays.toString(output));
		}
}
