package priyankaD.tests;
import java.util.Arrays;
public class Test4_1 {
	//Program 1 :
	//Write a method to return sum of all the digits present in each elements from given array.
	//input : {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"}
	//output : Mahesh -> 5
			   //Avni -> 9
			   //Puja -> 9
			   //Harshal -> 0
			   //Aditty -> 8
			   //Rahul -> 0
	    int getSumofDigitsInDigitsbetString(String name) {
	    	int sum=0;
	    	for(int index=0;index<name.length();index++) {
	    		if(Character.isDigit(name.charAt(index))) {
	    		int num=Character.getNumericValue(name.charAt(index));
	    			sum=sum+num;
	    			}
	    	}return sum;
	    }
	    int[] getDigitInArray(String[] arr) {
	    	int[] output=new int[arr.length];
	    	for(int index=0;index<arr.length;index++) {
	    		output[index]=getSumofDigitsInDigitsbetString(arr[index]);
	    	}
	    	return output;
	    }
	    public static void main(String[]args) {
	    	Test4_1 test=new Test4_1();
	    	String[] arr= {"Ma1he4sh", "A9vni", "P1uj3a5", "Harshal", "A4d4itty", "Rahul"};
	    	System.out.println(Arrays.toString(arr));
	    	int[]output=test.getDigitInArray(arr);
	    	for(int index=0;index<arr.length;index++) {
	    		System.out.println(arr[index]+"-->"+output[index]);
	    	}
	    }
}
