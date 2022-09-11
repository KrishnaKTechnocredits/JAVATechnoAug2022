/*Test 4 - 11th Sep'2022
Expected time : 15 mins

Write a method to return sum of all the digits present in each elements from given array.
input : {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"}
output : Mahesh -> 5
         Avni -> 9
         Puja -> 9
         Harshal -> 0
         Aditty -> 8
         Rahul -> 0*/
package pankajBhatt;

public class Test_4_Prog_2_11_Sep2022 {
	
	String[] sumOfAllDigitsInEachElementsFromArray(String[] str) {
		String[] strWithSum = new String[str.length];
		String[] outputStr = new String[str.length];
		for (int i = 0 ; i < str.length; i++ ) {
			int sum = 0;
			for (int j = 0; j < str[i].length(); j++) {
				if(Character.isDigit(str[i].charAt(j))) {
					sum += Character.getNumericValue(str[i].charAt(j));
				}
				strWithSum[i] = " -> " + sum ;
			}
			outputStr[i] = str[i] + strWithSum[i];
		}
		return outputStr;
	}

	public static void main(String[] args) {
		Test_4_Prog_2_11_Sep2022 test_4_Prog_2_11_Sep2022 = new Test_4_Prog_2_11_Sep2022();
		String[] inputStr = {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"};
		String[] outputString = test_4_Prog_2_11_Sep2022.sumOfAllDigitsInEachElementsFromArray(inputStr);
		for (int i = 0; i< outputString.length; i++) {
			System.out.println(outputString[i]);
		}
	}
}
