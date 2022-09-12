package kiran;

/*
 * Program 1 : Return middle character of max length String from given array.
 * input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"} output : c
 */

/*
 * Program 2 : Write a method to return middle character of each elements from given array.
 * input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"} output : Mahesh
 * -> h Avni -> v Harshal -> s Aditty -> i Rahul -> h
 */

public class ArrayTest2 {
	char getMidChar(String str){
		int len=str.length();
		char midchar;
		if(len%2==0) {
			midchar=str.charAt(len/2-1);
			return midchar;
		}
		else {
			midchar=str.charAt(len/2);
			return midchar;
		}		
	}
	
	String maxLengthString(String[] arr) {
		String maxStr="";
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()>maxStr.length()) {
				maxStr=arr[i];
			}
		} return maxStr;
	}
	
	void getMidCharArray(String[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			System.out.println(getMidChar(arr[i]));
		}
		
	}
	public static void main(String[] args) {
		ArrayTest2 obj=new ArrayTest2();
		
		String[] a1=new String[] {"Krishna","Maulik","Aashvi","Technocredits","Harsh"};
		String maxString=obj.maxLengthString(a1);
		System.out.println("Middle character of maximumlength string "+maxString+" is : "+obj.getMidChar(maxString));
		String[] a2=new String[] {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"};
		System.out.println("Middle charaters of following string array :");
		obj.getMidCharArray(a2);
	}

}
