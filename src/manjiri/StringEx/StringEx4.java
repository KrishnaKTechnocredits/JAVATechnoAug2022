/*Write a program to rearrange String in given format. 
Hint : Uppercase letters + digits + LowerCase letter
input = "t8EcHNo5Cred3iTs";
output : EHNCT853tcoredis 
// Character.isUpperCase(ch), Character.isLowerCase(ch)*/

package manjiri.StringEx;

public class StringEx4 {
	String getRearrangeString(String name) {
		String digitStr = "";
		String upperStr = "";
		String lowerStr = "";
		
		for(int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if(Character.isDigit(ch)) {
				digitStr += ch;
			}
			else if(Character.isLetter(ch)){
				if(Character.isUpperCase(ch)) {
					upperStr += ch;
				}
				else if(Character.isLowerCase(ch)) {
					lowerStr += ch;
				}				
			}
		}
		return upperStr+digitStr+lowerStr;
	}
	
	public static void main(String[] args) {	
		System.out.println(new StringEx4().getRearrangeString("t8EcHNo5Cred3iTs"));
	}
}
