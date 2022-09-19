/*Program 3: Write a method to return word having maximum uppercase.

String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
output : FR3ienDs			 

         */
package hindaviIngle;

public class Assignment23_ReturnMaximumUppercase {
	String getMaximumUppercase(String name) {
		String[] input = name.split(" ");
		String maxStr = "";
		int maxCount = 0;
		for (int index = 0; index < input.length; index++) {
			int count = 0;
			for (int j = 0; j < input[index].length(); j++) {
				if (Character.isUpperCase(input[index].charAt(j))) {
					count++;
				}
				if (maxCount < count) {
					maxCount = count;
					maxStr = input[index];
				}

			}
		}
		return maxStr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment23_ReturnMaximumUppercase a1 = new Assignment23_ReturnMaximumUppercase();
		String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		String output = a1.getMaximumUppercase(input);
		System.out.println("String with maximum Uppercase : " + output);
	}

}
