package rohini.StringArrayAssignment18;
//Program 3
public class FrequencyChar {
	static int count;
	int getfrequency(String name, char targetChar) {
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			char up = Character.toLowerCase(ch);
			if (up == targetChar) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String input = "TechnoTtcredits";
		char targetChar = 't';
		FrequencyChar frq = new FrequencyChar();
		int output = frq.getfrequency(input, targetChar);
		System.out.println(input + "\nFrequency of " + targetChar + " is " + output);

	}
}
