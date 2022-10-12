package avni.returnTypeExample;

public class RearangeString {
String upchar = "";
String lwchar = "";
String digit = " ";
	String rearange (String input) {
		for (int i = 0 ; i<input.length(); i++) {
			if(Character.isUpperCase(input.charAt(i)))
				upchar = upchar + input.charAt(i);
			else if (Character.isLowerCase(input.charAt(i)))
				lwchar = lwchar + input.charAt(i);
			else if(Character.isDigit(input.charAt(i)))
				digit = digit + input.charAt(i);
			
		}
		return upchar + lwchar +digit ; 
	}
	
	public static void main(String[] args) {
		RearangeString rearangeString  = new RearangeString();
		String inp = "T8EcHNO5Cred3its" ;
		System.out.println("input is ----" + inp + "  AND     output is ------" + rearangeString.rearange(inp)) ;
	}
}
