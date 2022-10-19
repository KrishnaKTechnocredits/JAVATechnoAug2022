package technocredits.collectionsdemo;

public class CharFrequency {

	static void printCharFreq(String str) {
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index); // 'r'
			int count = 0;
			int currentCharIndex = str.indexOf(ch); // 7
			if(index == currentCharIndex) {
				for(int innerIndex=0;innerIndex<str.length();innerIndex++) {
					if(ch == str.charAt(innerIndex))
						count++;
				}
				System.out.println(ch + "->" + count);
			}
	
		}
	}
	
	public static void main(String[] args) {
		String str = "technocreditstt";
		printCharFreq(str);
	}
}
