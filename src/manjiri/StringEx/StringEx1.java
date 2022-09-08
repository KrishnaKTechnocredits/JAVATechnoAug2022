package manjiri.StringEx;

public class StringEx1 {
	
	String getReverseName(String name) {
		String reverseName = "";
		for(int index = name.length()-1;index >= 0; index--) {
			reverseName += name.charAt(index);
		}
		return reverseName;	
	}
	
	String getEvenPositionChar(String name) {
		String evenChar = "";
		for(int index = 1;index < name.length();index=index+2) {
			evenChar += name.charAt(index);
		}
		return evenChar;		
	}
		
	String getReverseEvenPositionChar(String name) {
		String revName = getReverseName(name);
		String revEvenChar = getEvenPositionChar(revName);
		return revEvenChar;		
	}
	
	public static void main(String[] args) {
		StringEx1 stringEx1 = new StringEx1();
		System.out.println(stringEx1.getReverseName("Maulik"));
		System.out.println(stringEx1.getEvenPositionChar("Technocredits"));
		System.out.println(stringEx1.getReverseEvenPositionChar("Technocredits"));
	}
}
