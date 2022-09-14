/*Assignment - 17 : 7th Sep'2022

Program 1 : Write a method to return reverse name
input : Maulik
output : kiluaM

Program 2 : Write a method to return even position characters from given String. 
input : technocredits
output : ehordt

Program 3 : Write a method to return even position characters from given String in reverse.
input : technocredits
output : tdrohe

Program 4 : Write a method to return count of digits in a given string.
input : "Te8chno3cred7it9s"
output : 4

Program 5 : Write a method to return sum of digits in a given string.
input : "Te8chno3cred7it9s"
output : 27
Hint : ch = Character.charAt(index);
Character.isDigit(ch);
int num = Character.getNumericValue(ch); '9'*/

package smitaVetal;

public class StringReverse {
	
	String reverseString(String str) {
		String name = "";
		System.out.println("Reverse of String "+str+ " is");
		for(int index =str.length()-1; index>=0;index--) {
			 name = name + str.charAt(index);
		}
		return name;
	}
	
	String evenPositionChar(String str) {	
		String evenchar ="";		
		System.out.println("Characters at even position of String "+str+ " is");
		for (int index=1;index<=str.length()-1;index++) {
			if(index%2!=0) {
			char ch = str.charAt(index);
			evenchar = evenchar + ch;
			}
		}
		return evenchar;
	}
	
	String evenPositionCharReverse(String str) {
		String evenCharReturn ="";
		System.out.println("Reverse Characters at even position of String "+str+ " is");
		for(int index=str.length()-1;index>=0;index--) {
			if(index%2!=0) {
				evenCharReturn = evenCharReturn + str.charAt(index);
			}
		}
		return evenCharReturn;
	}
	
	int returnCount(String str) {  //return count of digits in a given string.
		int count =0;
		System.out.println("Count of numeric digits from string "+str+ " is ");
		for (int index=0;index<=str.length()-1;index++) {
			char ch= str.charAt(index);
			if(Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}
	int returnSumOfDigit(String str) {
		int sum=0;
		System.out.println("Sum of numeric digits from string "+str+ " is ");
		for(int index=0;index<=str.length()-1;index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch)) {
				int num= Character.getNumericValue(ch);
				sum=sum+num;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		String name = new StringReverse().reverseString("Smita");
		System.out.println(name);
		String evenchar = new StringReverse().evenPositionChar("Technocredits");
		System.out.println(evenchar);
		String evenCharReturn = new StringReverse().evenPositionCharReverse("technocredits");
		System.out.println(evenCharReturn);
		int count = new StringReverse().returnCount("Te8chno3cred7it9s");
		System.out.println(count);
		int sum=new StringReverse().returnSumOfDigit("Te8chno3cred7it9s");
		System.out.println(sum);		
	}
}
