package akankshaVyas.StringOperation;

public class Assingnment26EachCharFreqString {

	void getFreqofeachletter(String str) {
		String ch = "";
		int index = 0;
		while (str.length() > 0) {
			int orgLen = str.length();
			ch = Character.toString(str.charAt(0));
			str = str.replace(ch, "");
			int newLen = str.length();
			int frequency = orgLen - newLen;
			System.out.println(ch + "-> " + frequency);
			index++;
		}
	}

	public static void main(String[] args) {
		String str = "technocredits";
		System.out.println("In String \"" + str+ "\" frequency of each charatcer of string is ");
		new Assingnment26EachCharFreqString().getFreqofeachletter(str);

	}

}
