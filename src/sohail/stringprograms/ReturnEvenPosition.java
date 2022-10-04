//Program 2 : Write a method to return even position characters from given String. 
//input : technocredits
//output : ehordt



package sohail.stringprograms;

public class ReturnEvenPosition {
	
	String getEvenPosition(String str) {
	
		for (int index=0; index<=str.length(); index++) {
			if(index%2==0) {
			  char evenstr=str.charAt(index);
				System.out.print(evenstr);
			}			
		}
		return str;
				
	}
	public static void main(String[] args) {
		ReturnEvenPosition returnevenposition=new ReturnEvenPosition();
		returnevenposition.getEvenPosition("technocredits");
	}
}
