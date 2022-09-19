/*
 * 
 Write a method to return sum of all the digits present in each elements from given array.
input : {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"}
output : Mahesh -> 5
         Avni -> 9
         Puja -> 9
         Harshal -> 0
         Aditty -> 8
         Rahul -> 0

 * 
 */


package shridharKumbhar.Assignment11_20;

import java.util.Arrays;

public class Test4_P1 {
	
	int getdigitsum(String name) {
		
		int sum =0;
		
		for(int i =0; i < name.length() ;i++ ) {
			if (Character.isDigit(name.charAt(i)))
				sum = sum + Character.getNumericValue(name.charAt(i));
		}
		return sum;
	}
	
	
	String getletters(String name) {
		
		String onlyName = " ";
		
		for(int i =0; i < name.length() ;i++ ) {
			
			char ch = ' ';
			
			if(Character.isLetter(name.charAt(i))) {
				ch = name.charAt(i);
				onlyName = onlyName + ch ;
			}
		}
		return onlyName;
	}
	
	void outPut(String[] arr) {
		
		for (int i =0; arr.length >i;i++) {
			System.out.println(getletters(arr[i]) +" -> "+getdigitsum(arr[i]) );
		}
	}
	
	public static void main(String[] args) {
		Test4_P1 test = new Test4_P1();
		
		String[] arrey = {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"};
		
		System.out.println("Input array: "+ Arrays.toString(arrey));
		test.outPut(arrey);
	}

}
