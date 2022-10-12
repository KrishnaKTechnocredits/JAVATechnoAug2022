package priyankaD.assignments_20_30;
import java.util.Arrays;
public class Assignment_20_3_4 {
//3) Write a method to return sum of all even numbers in given array.
//input : {10,11,15,6}
//output : 16
	 int getSumOfEvenNum(int[] arr) {
    	 int sum=0;
    	 for(int index=0;index<arr.length;index++) {
    		 if(arr[index]%2==0)
    			 sum=sum+arr[index];
    	 }return sum;
     }
 //4) Write a method to return difference of sum of all even numbers and odd numbers in given array.
 //	 input : {10,11,15,6}
 // output : 10
     int getDiffBetEvenAndOddSum(int[] arr) {
    	 boolean flag=true;
    	 int evenNum=0;
    	 int oddNum=0;
    	 int difference=0;
    	 for(int index=0;index<arr.length;index++) {
    		 if(arr[index]%2==0) {
    			 flag=true;
    		     evenNum=evenNum+arr[index];
    		     break;
    		     }
    		 if(flag==false)
    		     oddNum=oddNum+arr[index];
    		 }
    	 difference=evenNum-oddNum;
		return difference;
     }
     public static void main(String[] args) {
    	 Assignment_20_3_4 assignment1=new Assignment_20_3_4();
    	 int[] arr= {11,10,15,6};
    	 System.out.println(Arrays.toString(arr));
    	 System.out.println("Sum of even Numbers is--"+assignment1.getSumOfEvenNum(arr));
    	 System.out.println("Difference between sum of even and odd numbers is--"+assignment1.getDiffBetEvenAndOddSum(arr));
     }
}
