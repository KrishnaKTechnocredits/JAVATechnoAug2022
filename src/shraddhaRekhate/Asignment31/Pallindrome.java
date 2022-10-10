package shraddhaRekhate.Asignment31;
//radar-radar
public class Pallindrome {
	boolean isPallindrome(String str) {
		for(int i=0,j=str.length()-1;i<j;i++,j--) {
			if(str.charAt(i)!=str.charAt(j)) {
			return false;
			}
		}
		return true;
	}
	
	 void displayPallindrome(String strr) {
		boolean flag=isPallindrome(strr);
		if(flag) {
			System.out.println(strr+" is pallindrome");
		}else {
			System.out.println(strr+" is not pallindrome");
		}
	}
	
	
	public static void main(String[] args) {
		Pallindrome pallindrom= new Pallindrome();
		String a1="radar";
		pallindrom.displayPallindrome(a1);
		String b1="abcabc";
		pallindrom.displayPallindrome(b1);
	}
}
