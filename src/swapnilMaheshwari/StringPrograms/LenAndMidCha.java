package swapnilMaheshwari.StringPrograms;

public class LenAndMidCha {
	
	int getNameLen(String name) {
		int len=name.length();
		return len;
	}
	
	char getMiddleChar(String str) {
		int len=str.length();
		int index=0;
		if (len%2==0) {
			index=len/2 -1;
		}
		else {
			index=len/2;
		}
		return str.charAt(index);
	}
	public static void main (String[] args) {
		LenAndMidCha lenAndMidCha=new LenAndMidCha();
		int lenth=lenAndMidCha.getNameLen("Maulik");
		System.out.println("Length of the String :" +lenth);
		char ch=lenAndMidCha.getMiddleChar("Maulik");
		System.out.println("Middle character is :" +ch);
		ch=lenAndMidCha.getMiddleChar("Technocredits");
		System.out.println("Middle character is :" +ch);
	}
}