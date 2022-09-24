package vinod.Assignment;

public class Assignment25RepeatedWord {
	void getRepWord(String[] name) {
		for (int i = 0; i < name.length; i++) {
			int count = 0;
			for (int j = i + 1; j < name.length; j++) {
				if (name[i].equals(name[j])) {
					count++;
				}
			}
			if (count >= 1) {
				System.out.println(name[i]);
			}
		}
	}

	public static void main(String[] args) {
		Assignment25RepeatedWord assignment25RepeatedWord = new Assignment25RepeatedWord();
		String str = "Maulik Vinod Vinod Shubham Gopal Shubham Titiksha Gopal";
		String str2 = str.toLowerCase();
		String[] name = str2.split(" ");
		assignment25RepeatedWord.getRepWord(name);

	}

}
