package hardikBhatia;

public class Assignment17StringReverseCharAt {

	//Program 1 : Write a method to return reverse name
	String reverseString(String name) {
		String reversedString = "";
		for(int i = name.length()-1; i>= 0; i--) {
			reversedString = reversedString + name.charAt(i);
		}
		return reversedString;
	}
	
	//Program 2 : Write a method to return even position characters from given String. 
	String returnEvenPositionCharacters(String name) {
		String evenCharacters = "";
		for(int i = 0; i <= name.length()-1; i++) {
			if(i % 2 != 0) {
				evenCharacters = evenCharacters + name.charAt(i);
			}
		}
		return evenCharacters;
	}
	
	//Program 3 : Write a method to return even position characters from given String in reverse.
	String evenPositionCharactersReverse(String name) {
		System.out.println("Original String : " + name);
		return reverseString(returnEvenPositionCharacters(name));
	}
	
	//Program 4 : Write a method to return count of digits in a given string.
	int countDigitsString(String name) {
		int count = 0;
		for(int i = 0; i <= name.length()-1; i++) {
			if(Character.isDigit(name.charAt(i))) {
				count++;
			}
		}
		return count;
	}
	
	//Program 5 : Write a method to return sum of digits in a given string.
	int sumDigitsString(String name) {
		int sum = 0;
		for(int i = 0; i <= name.length()-1; i++) {
			if(Character.isDigit(name.charAt(i))) {
				sum = sum + Character.getNumericValue(name.charAt(i));
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Assignment17StringReverseCharAt assignment17StringReverseCharAt = new Assignment17StringReverseCharAt();
		System.out.println("Original String : " + "Hardik");
		System.out.println("Reversed String : " + assignment17StringReverseCharAt.reverseString("Hardik"));
		
		System.out.println("Original String : " + "technocredits");
		System.out.println("Even Characters String : " + assignment17StringReverseCharAt.returnEvenPositionCharacters("technocredits"));
		
		System.out.println("Original String : " + "technocredits");
		System.out.println("Even Characters String In Reverse : " + assignment17StringReverseCharAt.evenPositionCharactersReverse("technocredits"));
	
		System.out.println("Original String : " + "Te8chno3cred7it9s");
		System.out.println("Count of digits in a given string: " + assignment17StringReverseCharAt.countDigitsString("Te8chno3cred7it9s"));
	
		System.out.println("Original String : " + "Te8chno3cred7it9s");
		System.out.println("Sum of digits in a given string: " + assignment17StringReverseCharAt.sumDigitsString("Te8chno3cred7it9s"));
	}
}
