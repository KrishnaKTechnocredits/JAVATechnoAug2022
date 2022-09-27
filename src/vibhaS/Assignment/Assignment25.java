package vibhaS.Assignment;

public class Assignment25 {

	// Write a program to print all the repeated word in string
	void printAllRepetedString(String[] str) {
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					System.out.println(str[i]);
					break;
				}
			}
		}
	}

	// Write a program to print non repeated word in a given String
	void printAllNonRepetedString(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for (int j = 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j]) && i != j) {
					flag = false;
				}
			}
			if (flag == true) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		Assignment25 assignment25 = new Assignment25();
		String name = "Maulik puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
		String[] arr = name.split(" ");
		assignment25.printAllRepetedString(arr);
		System.out.println("");
		assignment25.printAllNonRepetedString(arr);
	}
}
