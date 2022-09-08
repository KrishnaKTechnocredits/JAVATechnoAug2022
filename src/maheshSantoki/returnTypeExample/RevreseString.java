
package maheshSantoki.returnTypeExample;

public class RevreseString {

	/* Write a method to return reverse name */
	String reverseName(String name) {
		String str = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			str = str + name.charAt(i);
		}
		return str;
	}
	
	/* Write a method to return even position characters from given String.*/
	String evenPosition(String name) {
		String str = "";
		for (int i = 1; i < name.length(); i=i+2) {
				str = str + name.charAt(i);
			}
			return str;
		}
	
	/* Write a method to return even position characters from given String in reverse.*/
	String evenReversePosition(String name) {
		String str = "";
		for (int i = name.length()-1; i >=0; i--) {
			if(i%2 !=0)	
			str = str + name.charAt(i);
			}
			return str;
		}
	/* write a method to return count of digits in a given string. */  
	int getCountDigit(String name) {
		int c=0;
		for(int i=0;i<=name.length()-1;i++) {
			if(Character.isDigit(name.charAt(i))) {
				c++;
			}
		}
		return c;
	}

	/* Write a method to return sum of digits in a given string.*/
	int getSumDigit(String name) {
		int sum=0;
		for(int i=0;i<=name.length()-1;i++) {
			
			if(Character.isDigit(name.charAt(i))) {
				sum=sum+Character.getNumericValue(name.charAt(i));
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		RevreseString s1 = new RevreseString();
		String name1 = "Mahesh";
		String name2 = "TechnoCredits";
		String name3 = "Tech2no4Cred5it9s";
		
		System.out.println("---> Reverse name of " + name1 + " is " + s1.reverseName(name1));
		System.out.println("---> Even characters of " + name2 + " is " + s1.evenPosition(name2));
		System.out.println("---> Revrse position of Even characters of " + name2 + " is " + s1.evenReversePosition(name2));
		System.out.println("---> Digit in given string " + name3 + " is " + s1.getCountDigit(name3));
		System.out.println("---> Sum of Digit in given string " + name3 + " is " + s1.getSumDigit(name3));
	}
}
