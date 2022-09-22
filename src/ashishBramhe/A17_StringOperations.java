package ashishBramhe;

public class A17_StringOperations {

	String getReverseString(String name) {
		String revStr = "";
		for(int i=name.length()-1; i>=0; i--)
			revStr = revStr + name.charAt(i);
		System.out.print("\n Reverse of " + name + " : ");
		return revStr;
	}
	
	String getEvenPositionCharsFromString(String name) {
		String evenPositionChars = "";
		for(int i=0; i<name.length(); i++) {
			if(i%2 == 1)
				evenPositionChars+=name.charAt(i);
		}
		System.out.print("\n String with characters at even position in " + name + " : ");
		return evenPositionChars;
	}
	
	String getEvenPositionCharsFromStringInReverse(String name) {
		String evenPositionChars = "";
		for(int i=name.length()-1; i>=0; i--) {
			if(i%2 == 1)
				evenPositionChars+=name.charAt(i);
		}
		System.out.print("\n String with characters at even position (Reverse) in " + name + " : ");
		return evenPositionChars;
	}
	
	int getDigitCountFromString(String name) {
		int countOfDigits = 0;
		for(int i=0; i<name.length(); i++) {
			if(Character.isDigit(name.charAt(i)))
				countOfDigits++;
		}
		System.out.print("\n Count of Digits from String " + name + " : ");
		return countOfDigits;
	}
	
	int getSumOfDigitsFromString(String name) {
		int sum = 0;
		for(int i=0; i<name.length(); i++) {
			if(Character.isDigit(name.charAt(i)))
				sum+=Character.getNumericValue(name.charAt(i));
		}
		System.out.print("\n Sum of Digits from String " + name + " : ");
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A17_StringOperations stringOperations = new A17_StringOperations();
		System.out.println(stringOperations.getReverseString("NEHA"));
		System.out.println(stringOperations.getEvenPositionCharsFromString("TECHNOCREDITS"));
		System.out.println(stringOperations.getEvenPositionCharsFromStringInReverse("TECHNOCREDITS"));
		System.out.println(stringOperations.getDigitCountFromString("NE3H5A52"));
		System.out.println(stringOperations.getSumOfDigitsFromString("N35E5H7A1"));
	}
}
