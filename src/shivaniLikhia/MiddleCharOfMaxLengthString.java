//Program 1 : (20 mins)
//Return middle character of max length String from given array.
//input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
//output : c

package shivaniLikhia;

public class MiddleCharOfMaxLengthString {

	char getMaxLengthString(String[] arr) {
		String maxStr = "";
		char middleChar;
		for(int index=0;index<arr.length;index++) {
			if(arr[0].length()<arr[index].length()) {
				maxStr = arr[index];
			}
		}
		int maxStrLength = maxStr.length();
		if(maxStrLength%2==0) {
			middleChar = maxStr.charAt(maxStr.length()/2-1);
		}
		else {
			middleChar = maxStr.charAt(maxStr.length()/2);
		}
		return middleChar;
	}
	
	public static void main(String[] args) {
		MiddleCharOfMaxLengthString middleCharOfMaxLengthString = new MiddleCharOfMaxLengthString();
		String[] arr = {"Krishna","Maulik","Aashvi","Technocredits","Harsh"};
		System.out.println(middleCharOfMaxLengthString.getMaxLengthString(arr));
	}
}
