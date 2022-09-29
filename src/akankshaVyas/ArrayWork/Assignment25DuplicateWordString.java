package akankshaVyas.ArrayWork;

public class Assignment25DuplicateWordString {
	
	void getDuplicateWord(String str) {
		System.out.println("Duplicate words in given Strings are - "+"\n");
		String[] arr = str.split(" ");
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			count = 0;
			if (arr[index] != "") {
				for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
					if (index != innerIndex && arr[index].equals(arr[innerIndex])) {
						count++;
						arr[innerIndex] = "";
					}
				}
			}
			if (count > 0) {
				System.out.println(arr[index]);
			}
		}
	}

	void getNonDuplicateWord(String str) {
		System.out.println("\n" +"NonDuplicate words in given Strings are - "+ "\n");
		String[] arr = str.split(" ");
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			count = 0;
			for (int innerIndex = 0; innerIndex < arr.length; innerIndex++) {
				if (index != innerIndex && arr[index].equals(arr[innerIndex])) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println(arr[index]);
			}
		}
	}

	public static void main(String[] args) {
		String str = "Maulik Shubham Puja Hindavi Shubham Hindavi Titiksha Hindavi Shubham Swati ";
		Assignment25DuplicateWordString assignment25DuplicateWordString=new Assignment25DuplicateWordString();
		 assignment25DuplicateWordString.getDuplicateWord(str);
		 assignment25DuplicateWordString.getNonDuplicateWord(str);

	}

}
