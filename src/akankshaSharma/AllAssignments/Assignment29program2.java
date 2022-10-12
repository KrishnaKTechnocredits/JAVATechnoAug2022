//Shift all zero's at the beginning of the an array.

//input : {10,0,0,3,4,5,0,9}
//output : {0,0,0,10,3,4,5,9}

package akankshaSharma.AllAssignments;

import java.util.*; 

public class Assignment29program2 {
	int[] processedArray(int [] arr){ 
        int [] output = new int [arr.length];
        int count=0;
        for (int index=0; index<arr.length; index++){
            if (arr[index]!=0){ 
                count++; 
                output[count+3]= arr[index]; 
            } 
        } 
            return output; 
        
    } public static void main(String[] args){ 
    	Assignment29program2 test = new Assignment29program2 (); 
        int [] arr = {12,1,0,3,4,0,-23,0,6,0}; 
        int [] result = test.processedArray(arr); 
        System.out.println(Arrays.toString(result)); }

}
