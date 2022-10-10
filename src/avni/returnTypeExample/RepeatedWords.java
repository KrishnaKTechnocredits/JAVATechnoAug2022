package avni.returnTypeExample;

public class RepeatedWords {
	void repeatWord(String input) {
		String arr[] = input.split(" ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					System.out.println("Repeatword is " + arr[i]);
				}
			}
		}
	}

	void nonRepeatedWord(String input) {
		String arr[] = input.split(" ");
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for (int j = 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j]) && (i!=j)) {
					flag = false;
				}
			}
			if (flag) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {

		String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";

		RepeatedWords repeatedword = new RepeatedWords();
		System.out.println("--> Repeated Words : ");
		repeatedword.repeatWord(str);
		System.out.println("--> Non-Repeated Words : ");
		repeatedword.nonRepeatedWord(str);
	}
}
