package gauravSahu.String;



public class CharMethods {
	
	void strMethods(String name) {
		for(int index=0;index<name.length();index++) { // Iterate to get Character of string
			System.out.println("Character is : "+name.charAt(index)); // Got the character of String in character
			char ch = name.charAt(index);
			System.out.println(ch + " : It is digit : " +Character.isDigit(ch)); // give boolean value
			System.out.println(ch + " : It is letter : " +Character.isLetter(ch)); // give boolean value
			System.out.println(ch + " : It is LowerCase: " +Character.isLowerCase(ch)); // give boolean value
			System.out.println(ch + " : It is UpperCase : " +Character.isUpperCase(ch)); // give boolean value
			System.out.println(ch + " : Numeric value is : " +Character.getNumericValue(ch)); // Give Numeric value if it is present
			System.out.println(ch + " : Convert to lower case : " +Character.toLowerCase(ch)); // Print lower case char if present
			System.out.println(ch + " : Convert to Upper case : " +Character.toUpperCase(ch));// Print Upper case char if present
			// All above methods are static methods 
			
		}
	}
	
	public static void main(String[] args) {
		CharMethods c1 = new CharMethods();
		String[] arr = {"G3au5ra8vG","Garv1isG","GA8kanks9haG","GMeeraG","GDomanlalG","GSahuG"};
		System.out.println("Array length : "+ arr.length);
		for(String name : arr) {
			c1.strMethods(name);
			System.out.println("**********************");
		}
	}

}
