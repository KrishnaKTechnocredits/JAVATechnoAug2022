package technocredits.stringdemo;

// Maulik
// kiluaM
// char charAt(int index)
// input : technocredits
// output : ehordt

//input : technocredits
//output : tdrohe

// Character : Predefined class
// boolean Character.isDigit(ch)

// input : "Te8chno3cred7it9s"
// output : 4

//input : "Te8chno3cred7it9s"
//output : 27
//Hint : Character.getNumericValue(ch); '9' --> 9

public class Example1 {
	
	
	String reverseName(String name) {
		String revName = ""; 
		for(int index=name.length()-1;index>=0;index--) {
			revName = revName + name.charAt(index);
		}
		return revName;
	}
	
	public static void main(String[] args) {
		String output = new Example1().reverseName("Maulik");
		System.out.println(output);
		
		String str = "Te8c5hnocredits";
		char ch = str.charAt(2); // '8'
		char ch1 = str.charAt(4);
		int sum = 0;
		sum = sum + Character.getNumericValue(ch); // 8
		sum = sum + Character.getNumericValue(ch1); // 5
		System.out.println(sum);
		
		boolean isDigitFlag = Character.isDigit(ch);
		System.out.println(ch + ":"+isDigitFlag);
	}
}
