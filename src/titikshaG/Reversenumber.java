package titikshaG;

public class Reversenumber {
	String reverName(String name) {
	String revName="";
	for(int index=name.length()-1;index>=0;index--)
		{
		revName=revName+name.charAt(index);
		}
	return revName;

	}
	
	String modularWithTwo(String name) {
		String odIndex="";
		for(int index=name.length()/2;index>0;index = index-2)
			{
			odIndex=odIndex+name.charAt(index);
			}
		return odIndex;
		}
	
	String oddIndexPosition(String name) {
		String odIndex="";
		for(int index=1;index<name.length();index = index+2)
			{
			odIndex=odIndex+name.charAt(index);
			}
		return odIndex;
		}
	
	String reverseOfOddIndex(String name) {
		String odIndex="";
		for(int index=name.length()-1;index>0;index = index-2)
			{
			odIndex=odIndex+name.charAt(index);
			}
		return odIndex;
		}
	
	int countOfNumbers(String name) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			if (Character.isDigit(name.charAt(index))) {
				count++;
			}
		}
		return count;
		}
	
	int SumOfNumbers(String name) {
		int sum = 0;
		for (int index = 0; index < name.length(); index++) {
			if (Character.isDigit(name.charAt(index))) {
				sum=sum+Character.getNumericValue(name.charAt(index));
			}
		}
		return sum;
		}
	
	public static void main(String[] a)
		{
		String output=new Reversenumber().reverName("Technocredit");
		System.out.println("Reverse of string is:" +" " +output);
		System.out.println();
	
		String modular=new Reversenumber().modularWithTwo("Technocredit");
		System.out.println("Index modular with 2 contain character:" +" " +modular);
		System.out.println();
	
		String odd=new Reversenumber().oddIndexPosition("Technocredit");
		System.out.println("Chararcters on odd position of index are:" +" " +odd);
		System.out.println();
	
		String reverseodd=(new Reversenumber().reverseOfOddIndex("Technocredit"));
		System.out.println("Reverse of odd Index chararcter are:" +" " +reverseodd);
		System.out.println();
	
		int count=new Reversenumber().countOfNumbers("Te7chn2ocre1dit0");
		System.out.println("Count of numeric digit in strin are::" +" " +count);
		System.out.println();
		
		int sum=new Reversenumber().SumOfNumbers("Te7chn2ocre1dit0");
		System.out.println("Sum of numeric digit in strin are::" +" " +sum);
		System.out.println();
		
		}
}
