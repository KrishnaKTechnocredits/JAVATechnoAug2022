/*
 * Write a method to return sum of all the digits present in each elements from given array.
input : {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"}
output : Mahesh -> 5
         Avni -> 9
         Puja -> 9
         Harshal -> 0
         Aditty -> 8
         Rahul -> 0
 */
package hindaviIngle;

public class SumOfDigitArray {

	int sumOfDigits(String name) {
		int sum = 0;
		for (int index = 0; index <= name.length() - 1; index++) {
			if (Character.isDigit(name.charAt(index))) {
				sum += Character.getNumericValue(name.charAt(index));
			}
		}
		return sum;
	}

	String[] getStringDigit(String[] strArr) {
		String[] strOut = new String[strArr.length];
		for (int index = 0; index <= strArr.length - 1; index++) {
			strOut[index] = strArr[index] + " ---------> " + sumOfDigits(strArr[index]);
		}
		return strOut;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfDigitArray s1 = new SumOfDigitArray();
		String[] str = { "Ma1he4sh", "A9vni", "P1uj3a5", "Harshal", "A4d4itty", "Rahul" };
		String[] strOut = s1.getStringDigit(str);
		System.out.println("Output : \n");
		for (int index = 0; index <= strOut.length - 1; index++) {
			System.out.println(strOut[index]);
		}

	}

}
