package shivaniLikhia;

public class FindFrequency {
	
	int getCountOfTargetChar(String str,char targetChar) {
		int count = 0;
		int length = str.length();
		str = str.toLowerCase();
		targetChar = Character.toLowerCase(targetChar);
		for(int index=0;index<=length-1;index++) {
			char ch = str.charAt(index);
			if(ch==targetChar) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String str = "TechnoTtcredits";
		char targetChar = 'T';
		int freqOfChar = new FindFrequency().getCountOfTargetChar(str,targetChar);
		System.out.println("The frequency of the character : " +targetChar+ " in the String " +str+ " is : " +freqOfChar);
	}
}
