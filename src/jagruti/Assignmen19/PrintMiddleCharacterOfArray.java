package jagruti.Assignmen19;
public class PrintMiddleCharacterOfArray 
{
	public static void main(String [] args)
	{
		String arr[] = {"Ashish","Aditty","Manjiri","Ankita"};
		PrintMiddleCharacterOfArray printMiddleCharacterOfArray = new PrintMiddleCharacterOfArray();
		System.out.println("Middle character of " + arr[0] + " is: " + printMiddleCharacterOfArray.getMiddleCharacter(arr[0]));
		System.out.println("Middle character of " + arr[1] + " is: " + printMiddleCharacterOfArray.getMiddleCharacter(arr[1]));
		System.out.println("Middle character of " + arr[2] + " is: " + printMiddleCharacterOfArray.getMiddleCharacter(arr[2]));
		System.out.println("Middle character of " + arr[3] + " is: " + printMiddleCharacterOfArray.getMiddleCharacter(arr[3]));
		
	}
	char getMiddleCharacter(String name)
	{
		int index = 0;
		int length = name.length();
		if (length % 2 == 0) {
			index = length / 2 - 1;
		} else {
			index = length / 2;
		}
		char ch = name.charAt(index);
		return ch;			
	}
}
