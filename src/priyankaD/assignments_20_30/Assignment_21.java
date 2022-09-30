package priyankaD.assignments_20_30;
import java.util.Arrays;
public class Assignment_21 {
	//Return second highest from given array.
	//input : {10,99,33,44,89,76}
	//output : 89
	int secondMaxNumInArray(int[] arr) {
 	   int max=arr[0];
 	   int secMax=0;
 	   for(int index=0;index<arr.length;index++) {
 		       if(max<arr[index]){
 		    	   secMax=max;
 		    	   max=arr[index];
 		   }
 		       else if (secMax<arr[index])
 		    	   secMax=arr[index];
 	   }return secMax;
    }
    public static void main(String[] args) {
 	   int[] arr= {10,99,33,44,89,76};
 	   System.out.println(Arrays.toString(arr));
 	   int secMax=new Assignment_21().secondMaxNumInArray(arr);
 	   System.out.println(secMax);
    }
}
