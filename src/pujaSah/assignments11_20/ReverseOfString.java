package pujaSah.assignments11_20;

public class ReverseOfString {

	String getReverseString(String name) {
		int length = name.length();
		String revName = "";
		for (int i = length - 1; i >= 0; i--) {
			revName += name.charAt(i);
		}
		return revName;
	}

	public static void main(String[] args) {
		String str = "Maulik";
		String revStr = new ReverseOfString().getReverseString(str);
		System.out.println("The reverse of string " + str + " is " + revStr);
	}
}
