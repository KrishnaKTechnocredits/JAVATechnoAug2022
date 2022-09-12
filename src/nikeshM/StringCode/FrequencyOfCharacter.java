package nikeshM.StringCode;

public class FrequencyOfCharacter {
	int getCountofTargetCharacter(String str, char targetChar) {
		int length = str.length();
		str = str.toLowerCase();
		int count = 0;
		targetChar = Character.toLowerCase(targetChar);
		for (int index = 0; index < length; index++) {
			char ch = str.charAt(index);
			if (ch == targetChar) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		FrequencyOfCharacter target = new FrequencyOfCharacter();
		int output = target.getCountofTargetCharacter("TechnoTtcredits", 'T');
		System.out.print("FrequencyOfCharacter are " + output);
	}
}
