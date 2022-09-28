package technocredits.inteview;

public class EnhanceLoopExample {

	boolean isContainsDigit(String str) {
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				return true;
			}
		}
		return false;
	}
	
	void printNameHavingDigits(String[] arr) {
		for(String name : arr) {
			boolean flag = isContainsDigit(name);
			if(flag)
				System.out.println(name + " having digit");	
		}
		
		int[] numArr = {10,20,30,40};
		int sum = 0;
		for(int num : numArr) {
			sum += num;
		}
		System.out.println(sum);
		
		double[] priceArr = {10.30,44.56,99};
		
		for(double price : priceArr) {
			if(price > 90)
				System.out.println(price);
		}
		
		String str = "Maulik";
		
		for(char ch : str.toCharArray()) {
			System.out.println(ch);
		}
	}
	
	public static void main(String[] args) {
		 
	}
}
