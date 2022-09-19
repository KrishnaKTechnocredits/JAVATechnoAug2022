package manjiri.arrayEx;

public class ArrayEx2_Client {
	public static void main(String[] args) {
		ArrayEx2 arrayEx2 = new ArrayEx2();
		String input = "Maulik";
		System.out.println("Number of Vowels in given string are: " + arrayEx2.getCountOfVowelsInString(input));
		
		String[] input2 = {"Ashish","Aditty","Manjiri","Ankita"};
		int[] result = arrayEx2.getCountOfVowelsInArray(input2);
		arrayEx2.display(input2, result);
		
		String[] input3 = {"Ashish","Aditty","Manjiri","Ankita","Credits"};
		System.out.println(arrayEx2.getMaxLengthNameFromArray(input3));
		System.out.println(arrayEx2.getMaxLengthNameFromArrayUsingReverseLoop(input3));
	}
}
