package avni.returnTypeExample;

public class LengthOfString {

	int Length(String st) { 
	return (st.length());
 }
	
char getMiddlechar(String str) {
	int len = str.length();
	int index = 0;
	if(len % 2 ==0) 
		index = len /2 - 1 ;
	else
		index = len/2 ;
	return str.charAt(index);
	}
	public static void main (String[] args) {
		LengthOfString l = new LengthOfString();
		int length = l.Length("avani");
		System.out.println("Length of given string is - " + length);
		System.out.println("middle character of given name is "+ l.getMiddlechar("DalsaniyaAvani"));
	}
}
