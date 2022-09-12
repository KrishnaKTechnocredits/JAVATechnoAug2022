//2) Write a program to rearrange String in given format. 
//Hint : Uppercase letters + digits + LowerCase letter
//input = "t8EcHNo5Cred3iTs";
//output : EHNCT853tcoredis 
// Character.isUpperCase(ch), Character.isLowerCase(ch)

package shivaniLikhia;

public class RearrangeUpperLowerDigit {
	
	String getRearrangeUpperLowerDigit(String str) {
		int length = str.length();
		String str1 = "";
		String str2 = "";
		String str3 = "";
		for(int index=0;index<=length-1;index++) {
			char ch = str.charAt(index);
			if(Character.isUpperCase(ch)) {
				str1 = str1 + str.charAt(index);
			}
			else if(Character.isDigit(ch)){
				str2 = str2 + str.charAt(index);
			}
			else if(Character.isLowerCase(ch)) {
				str3 = str3 + str.charAt(index);
			}
		}
		return str1+str2+str3;
	}
	public static void main(String[] args) {
		System.out.println(new RearrangeUpperLowerDigit().getRearrangeUpperLowerDigit("t8EcHNo5Cred3iTs"));
	}
}
