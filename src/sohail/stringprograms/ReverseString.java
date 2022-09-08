//Program 1 : Write a method to return reverse name
//input : Maulik
//output : kiluaM

package sohail.stringprograms;

public class ReverseString {
	
	String getReverseString(String str) {
		for (int index=str.length()-1; index>=0 ; index --) {
			char rev=str.charAt(index);
			System.out.print(rev);
		}			
		return null;
		
	}

	public static void main(String[] args) {
		ReverseString reversestring=new ReverseString();
		reversestring.getReverseString("Maulik");

	}

}
