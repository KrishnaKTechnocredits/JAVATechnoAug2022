package priyankaD.assignments_31_40;
import java.util.Arrays;
public class Assignment_31 {
/*Program 1 :Write a method to find whether given String is pallindrome.
	        input : radar
	                aabcbaa
	                abcabc*/
	    boolean findPallindromeString(String input) {
	    	boolean flag=true;
	    	for(int index=0,j=input.length()-1;index<j;index++,j--) {
	    		if(input.charAt(index)!=input.charAt(j)){
	    			flag=false;
	    		}
	    	}return flag;
	    }
	    void getOutputPallindromeString(String input) {
	    	boolean flag=findPallindromeString(input);
	    	System.out.println("Input String->"+input);
	    	if(flag)
	    		System.out.println(input+" is a pallindrome string.");
	    	else
	    		System.out.println(input+" is not a pallindrome string.");
	   }
/*Program 2 :Write a method to print all pallindrome input from given array.
             input : {"radar","techhpet","madam","maulikkilum"};
	    	 output : radar
	    	         madam*/
	    void printAllPallindromeInputInArray(String[]arr) {
	    	boolean flag=true;
	    	for(int index=0;index<arr.length;index++) {
	    		flag=findPallindromeString(arr[index]);
	    		if(flag)
	    			System.out.println(arr[index]);
	    	}
	    }
	    public static void main(String[]args) {
	    	Assignment_31 assignment=new Assignment_31();
	    	assignment.getOutputPallindromeString("radar");
	    	assignment.getOutputPallindromeString("aabcbaa");
	    	assignment.getOutputPallindromeString("abcabc");
	    	System.out.println("--------------------");
	    	String[]arr={"radar","techhpet","madam","maulikkilum"};
	    	System.out.println("Input String ->"+Arrays.toString(arr));
	    	System.out.println("output-");
	    	assignment.printAllPallindromeInputInArray(arr);
	    }
}
