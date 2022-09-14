//Assignment - 17 : 7th Sep'2022
//Program 1 : Write a method to return reverse name
//input : Maulik
//output : kiluaM

package shivaniLikhia;

public class ReturnReverse {
	
	String getReverseName(String name) {
		String revName = "";
		int nameLength = name.length();
		for(int index=nameLength-1;index>=0;index--) {
			revName = revName + name.charAt(index);
		}
		return revName;
	}
	
	public static void main(String[] args) {
		System.out.println(new ReturnReverse().getReverseName("Maulik"));
		
	}
}
