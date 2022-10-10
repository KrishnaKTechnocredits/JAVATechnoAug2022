/*  program to reversString */
package avni.returnTypeExample;

public class ReverseString {

	String reversName(String name) {
		String str = "";
		for(int i = name.length()-1 ; i>=0 ; i--) {
			str = str + name.charAt(i) ;
		}
		return str ; 
	}
	 
   public static void main (String[] args) {
	ReverseString r = new ReverseString();
	String input = "Avani" ;
	System.out.println(" input     :" + input);
	System.out.println(" ---output is " + r.reversName(input)) ;
   }
   }
