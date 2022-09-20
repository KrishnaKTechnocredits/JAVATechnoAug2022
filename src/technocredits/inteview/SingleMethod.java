package technocredits.inteview;

public class SingleMethod {

	boolean isWordHavingDigit(String word) {
		for(int i=0;i<word.length();i++) {
			char ch = word.charAt(i);
			if(Character.isDigit(ch)) {
				return true;
			}
		}
		return false;
	}
	
	void m1(int i, short s) {
		
	}
	
	void m1(short a, int b) {
		
	}
	
	void printWordHavingDigitFromArray(String input) {
		String[] arr = input.split("-");
		for(int index=0;index<arr.length;index++) {
			String word = arr[index]; // saroj Maulik
			boolean flag = isWordHavingDigit(word);
			if(flag)
				System.out.println(word);
		}
	}
	
	public static void main(String[] args) {
		String str = "Sar44oj-Maulik-K2ris5hna-A2ashvi-Harsh-Margi";
		new SingleMethod().printWordHavingDigitFromArray(str);
	}
}
