/*Print all the non repeated word in given string.
String str = "Maulik Puja Hindavi Shubham hindavi Shubham Titiksha Swati";
output : Maulik 
         Puja
         Titiksha
         Swati 
*/
package namratamishra.stringOpreations;

public class ArrayStringNonRepeatedWordsPrint {

	void getArrayStringNonRepeatedWordsPrint(String[] arr)

	{
		System.out.println("The number of non repeated string in given array is: ");

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equalsIgnoreCase(arr[j]))

				{
					count++;
					arr[j] = "";

				}

			}
			if (count == 0 && arr[i] != "")
				System.out.println(arr[i]);

		}

	}

	public static void main(String[] args) {
		String str = "Maulik Puja Hindavi Shubham hindavi Shubham Titiksha Swati";
		String[] arr = str.split(" ");
		ArrayStringNonRepeatedWordsPrint asrwc = new ArrayStringNonRepeatedWordsPrint();
		asrwc.getArrayStringNonRepeatedWordsPrint(arr);

	}
}
