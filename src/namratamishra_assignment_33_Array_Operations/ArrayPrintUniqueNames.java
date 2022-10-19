/*program 5 : print unique names from given array. 
input : {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
output : Hi
         Hello
		 Techno
		 Credits
		 */
package namratamishra_assignment_33_Array_Operations;

public class ArrayPrintUniqueNames {

	void getArrayPrintUniqueNames(String[] arr)

	{
		System.out.println("Unique Names in given array is: ");
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) 
			{

				if (arr[i].equals(arr[j]) && i != j)
				{
					arr[j]="";
				
				}

			}
			if (arr[i]!="")

				System.out.println(arr[i]);
		}

	}

	public static void main(String[] args) {
		String[] arr = { "Hi", "Hello", "Hello", "Techno", "Credits" };
		ArrayPrintUniqueNames apun = new ArrayPrintUniqueNames();

		apun.getArrayPrintUniqueNames(arr);

	}
}
