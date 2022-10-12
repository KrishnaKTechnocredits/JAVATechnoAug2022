/*Program 3: Write a method to return word having maximum uppercase.

String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
output : FR3ienDs			 
 */
package gauravSahu.assignments;

public class Assignment23C {

	String getMaxUpperCase(String[] arr) {
		//String maxUppercase = " ";
		String tempUppercase = " ";
		int maxcount = 0;
		for (int index = 0; index < arr.length; index++) {
			//maxUppercase = arr[index];
			int count = 0;
			for (int i = 0; i < arr[index].length(); i++) {
				char ch = arr[index].charAt(i);
				if(Character.isUpperCase(ch)) {
					count++;
					if(maxcount<count) {
						maxcount = count;
						tempUppercase = arr[index];
					}
				}						
			}
		}return tempUppercase;
	}

	public static void main(String[] args) {
		Assignment23C a23 = new Assignment23C();
		String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		String[] arr = input.split(" ");
		String count = a23.getMaxUpperCase(arr);
		System.out.println(count);

	}
}
