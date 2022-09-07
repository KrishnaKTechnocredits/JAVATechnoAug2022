package harshalRane.practise;

public class CheckCharInGivenString {
	void getChar(String str) {
		int index = str.indexOf('s');
		System.out.println(index);
	}
	
	public static void main(String[] args) {
		new CheckCharInGivenString().getChar("Harshal");
	}

}
