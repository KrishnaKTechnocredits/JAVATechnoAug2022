package nehaniG;

public class Assignment27 {
	void printUniqueChracter(String[] arr) {
		System.out.println("Unique Chracter of name in the given Array ;  ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			for (int j = 0; j < arr[i].length(); j++) {
				char ch = arr[i].charAt(j);
				if (arr[i].indexOf(ch) == arr[i].lastIndexOf(ch)) {
					System.out.println(ch);
				}
			}
			System.out.println("-----------------------------------------");
		}
	}

	void printFirstUniqueChracter(String[] arr) {
		System.out.println("First Unique Chracter of name in the given Array ;  ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			boolean isFirstUniqueCharFound = false;
			for (int j = 0; j < arr[i].length(); j++) {
				char ch = arr[i].charAt(j);
				if (arr[i].indexOf(ch) == arr[i].lastIndexOf(ch)) {
					System.out.println(ch);
					break;
				}
			}
			if (isFirstUniqueCharFound) {
				break;
			}
			System.out.println("-----------------------------------------");
		}
	}

	public static void main(String[] args) {
		Assignment27 assignment27 = new Assignment27();
		String[] Input1 = { "Maulik", "Kanani", "Mahesh", "Kanani" };
		assignment27.printUniqueChracter(Input1);
		String[] Input2 = { "Maulik", "KananiK", "akanksha" };
		assignment27.printFirstUniqueChracter(Input2);

	}
}
