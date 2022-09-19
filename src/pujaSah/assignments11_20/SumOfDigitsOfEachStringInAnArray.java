package pujaSah.assignments11_20;

public class SumOfDigitsOfEachStringInAnArray {

	int[] getSumOfDigits(String[] name) {
		int[] sumArr = new int[name.length];
		for (int i = 0; i <= name.length - 1; i++) {
			sumArr[i] = 0;
			for (int j = 0; j <= (name[i].length()) - 1; j++) {
				if (Character.isDigit(name[i].charAt(j))) {
					sumArr[i] += Character.getNumericValue(name[i].charAt(j));
				}
			}
		}
		return sumArr;
	}

	public static void main(String[] args) {
		String[] inArr = { "Ma1he4sh", "A9vni", "P1uj3a5", "Harshal", "A4d4itty", "Rahul" };
		System.out.println("Sum of digits for each string in the given array are ");
		int[] outArr = new SumOfDigitsOfEachStringInAnArray().getSumOfDigits(inArr);
		for (int i = 0; i <= inArr.length - 1; i++) {
			System.out.println(inArr[i] + "->" + outArr[i]);
		}
	}
}


