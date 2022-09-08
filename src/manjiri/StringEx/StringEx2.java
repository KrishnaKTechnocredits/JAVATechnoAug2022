package manjiri.StringEx;

public class StringEx2 {
	
	int getCountOfDigits(String name) {
		int count = 0;
		char ch;
		for (int index = 0; index < name.length(); index++) {
			ch = name.charAt(index);
			if(Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}
	
	int getSumOfDigits(String name) {
		char ch;
		int index = 0;
		int digit;
		int sum = 0;
		while(index != name.length()-1) {
			ch = name.charAt(index);
			if(Character.isDigit(ch)) {
				digit = Character.getNumericValue(ch);
				sum += digit;
			}
			index++;			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		StringEx2 stringEx2 = new StringEx2();
		System.out.println(stringEx2.getCountOfDigits("Te8chno3cred7it9s"));
		System.out.println(stringEx2.getSumOfDigits("Te8chno3cred7it9s"));
	}
	

}
