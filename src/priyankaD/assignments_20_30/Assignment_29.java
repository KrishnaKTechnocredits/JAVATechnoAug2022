package priyankaD.assignments_20_30;
import java.util.Arrays;
public class Assignment_29 {
		/*Program 1 : 
			Shift all Zero's at the end of an array.	
			input : {10,0,0,3,4,5,0,9}
			output : {10,3,4,5,9,0,0,0}*/
	   void shiftZerosAtEnd (int[] arr) {
		   int[] output= new int[arr.length];
		   int j=0;
		   for(int index=0;index<arr.length;index++) {
			   if(arr[index]!=0) {
				   output[j]=arr[index];
				   j++;
				  }
			   }
		       System.out.println("output--> "+Arrays.toString(output));
		   }
	    /*Program 2 : 
		   Shift all zero's at the beginning of the an array.
           input : {10,0,0,3,4,5,0,9}
		   output : {0,0,0,10,3,4,5,9}*/
	   void shiftZerosAtFront(int[]arr) {
		   int[]output=new int[arr.length];
		   int j=3;
		   for(int index=0;index<arr.length;index++) {
			   if(arr[index]!=0) {
				   output[j]=arr[index];
				   j++;
			   }
		   }
		   System.out.println("output-->"+Arrays.toString(output));
	   }
	   public static void main(String[] args) {
		Assignment_29 assignment=new Assignment_29();
		int[] arr={10,0,0,3,4,5,0,9};
		 System.out.println("input-->"+Arrays.toString(arr));
		 assignment.shiftZerosAtEnd(arr);
		 System.out.println("-----------------------------");
		 System.out.println("input-->"+Arrays.toString(arr));
		 assignment.shiftZerosAtFront(arr);
	     	 }
	  }

