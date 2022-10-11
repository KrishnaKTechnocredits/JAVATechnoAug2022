package namratamishra.Array;
/*
Write a method to return name having maximum length.
input : {"Ashish","Aditty","Manjiri","Ankita","Credits"}
output : Credits
*/

class ArrayNameMaxLength {

	String getArrayNameMaxLength(String[] str) {
		
		int maxLength=str[0].length();
		String maxLengthName = "";

		for (int i = 1; i < str.length; i++)

		{
		

			if (maxLength<=str[i].length())
			 {
				
				maxLength = str[i].length();
				maxLengthName=str[i];
			}
		}
		return maxLengthName;

	}

	public static void main(String[] args) {

		String[] input = { "Ashish", "Aditty", "Manjari", "Ankita", "Credits" };

		ArrayNameMaxLength acv = new ArrayNameMaxLength();
		String str = acv.getArrayNameMaxLength(input);
		System.out.println("String having maximum length from the given of array is: " + str);
	}
}
