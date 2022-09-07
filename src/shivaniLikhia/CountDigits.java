//Program 4 : Write a method to return count of digits in a given string.
//input : "Te8chno3cred7it9s"
//output : 4

package shivaniLikhia;

public class CountDigits{
	
	int getCountDigits(String name) {
		int nameLength = name.length();
		int count = 0;
		boolean isDigitFlag;
		for(int index=0;index<=nameLength-1;index++){
			isDigitFlag = Character.isDigit(name.charAt(index));
			if(isDigitFlag==true) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(new CountDigits().getCountDigits("Te8chno3cred7it9s"));
	}
}
