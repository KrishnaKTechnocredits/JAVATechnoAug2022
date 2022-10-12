package avni.returnTypeExample;

public class Vowels {
	int checkVowels(String name) {
		int c = 0;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == 'a' || name.charAt(index) == 'e' || name.charAt(index) == 'i'
					|| name.charAt(index) == 'o' || name.charAt(index) == 'u' || name.charAt(index) == 'A'
					|| name.charAt(index) == 'E' || name.charAt(index) == 'I' || name.charAt(index) == 'O' 
					|| name.charAt(index) == 'U')
			{
				c++;
			}
		}
		return c;
	}

	void display(String input) {
		System.out.println("Vowels in given name : " + input + " --> " + checkVowels(input));
	}

	public static void main(String[] args) {
		Vowels vowels = new Vowels();
		vowels.display("Avani");
		vowels.display("Patel");
}
}
