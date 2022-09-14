package pujaSah.assignments11_20;

public class EvenPositionCharInReverse {
	
	String getEvenPositionCharsInReverse(String name){
		String evenRevStr = "";
		int length = name.length();
		for(int i = length-2; i >= 0; i -= 2){
			evenRevStr += name.charAt(i);
		}
		return evenRevStr;
	}
	
	public static void main(String[] args){
		String str = "technocredits";
		String evenRevStr = new EvenPositionCharInReverse().getEvenPositionCharsInReverse(str);
		System.out.println("The even position characters in reverse order for string " + str + " are " + evenRevStr);
	}
}
