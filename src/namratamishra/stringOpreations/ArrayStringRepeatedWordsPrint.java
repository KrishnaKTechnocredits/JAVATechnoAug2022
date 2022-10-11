/*Program 1: Print all the repeated word in given string.
String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
output : Hindavi 
         Shubham 
*/

package namratamishra.stringOpreations;

public class ArrayStringRepeatedWordsPrint {

	void getArrayStringRepeatedWordsPrint(String[] arr)

	{
		System.out.println("The number of repeated string in given array is: ");
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i].equalsIgnoreCase(arr[j]))

				{
					count++;
					arr[j] = "";

				}

			}
			if (count >= 1 && arr[i] != "")
				System.out.println(arr[i]);
		}

	}

	public static void main(String[] args) {
		String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
		String[] arr = str.split(" ");
		ArrayStringRepeatedWordsPrint asrwc = new ArrayStringRepeatedWordsPrint();
		asrwc.getArrayStringRepeatedWordsPrint(arr);

	}
}
