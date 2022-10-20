package shraddhaRekhate.Assignment23;
//Write a method to return word having maximum uppercase
//String input="Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
public class WordHAvingMaxUpperCase {
	
	int countofWordHavingUpperCase(String w) {
		int countUpperCase=0;
		for(int index=0;index<w.length();index++) {
			char ch=w.charAt(index);
			if(Character.isUpperCase(ch)) {
				countUpperCase++;
			}
		}
		return countUpperCase;
	}
	
	String wordHavingMaxUpperCase(String w) {
		int maxUpperCase=0;
		int countUpperCase=0;
		String word = "";
		String[] input = w.split(" ");
		for(int index=0;index<input.length;index++) {
			 countUpperCase=countofWordHavingUpperCase(input[index]);
			if(maxUpperCase<countUpperCase) {
				maxUpperCase = countUpperCase;
				word = input[index];
			}
		}
		return word;
	}
	

	public static void main(String[] args) {
		WordHAvingMaxUpperCase wordHAvingMaxUpperCase=new WordHAvingMaxUpperCase();
		String str="Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		System.out.println(wordHAvingMaxUpperCase.wordHavingMaxUpperCase(str));
	}

}
