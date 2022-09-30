package priyankaD.assignments_20_30;
import java.util.Arrays;
public class Assignment_20_1_2 {
//1) Write a method to return sum of all not prime numbers from given array.
//input : {11,13,17,22,44}
//output : 66    
	boolean isPrime(int input) {
    	 boolean flag=true;
    	 for(int index=2;index<input/2;index++) {
    		 if(input%index==0) {
    			 flag=false;
    			 break;
    		 }
    	 }return flag;
     }
     int getSumOfNonPrimeNum(int[] num) {
    	 int sum=0;
    	 for(int index=0;index<num.length;index++) {
    		 boolean flag=isPrime(num[index]);
    		 if(flag==false)
    			 sum=sum+num[index];
    	 }return sum;
     }
//2) Write a method to return sum of all non prime numbers and should be divisible by 5 & 7 from given array.
//input : {11,35,17,105,44}
//output : 140
     int getSumOfNonPrimeNumDivBy5and7(int[] input) {
    	 int sum=0;
    	 for(int index=0;index<input.length;index++) {
    	 if(isPrime(input[index])!=true) {
    		 if(input[index]%5==0 && input[index]%7==0)
    			 sum=sum+input[index];
    	     }
    	 }
    	 return sum;
     }
     public static void main(String[]args) {
    	 Assignment_20_1_2 assignment=new Assignment_20_1_2();
    	 int[] input1= {11,13,17,22,44};
    	 System.out.println(Arrays.toString(input1));
    	 System.out.println("sum of all non Prime no. is--"+assignment.getSumOfNonPrimeNum(input1));
    	 
    	 int[]input2= {11,35,17,105,44};
    	 System.out.println(Arrays.toString(input2));
    	 System.out.println("Sum of non prime num div by 5 and 7 is--"+assignment.getSumOfNonPrimeNumDivBy5and7(input2));
     }
}
