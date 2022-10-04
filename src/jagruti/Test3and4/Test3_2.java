package jagruti.Test3and4;

public class Test3_2
{	
	char[] getMiddleChar(String[] input)
	{
		char [] output = new char[input.length];
		
		for (int index = 0; index < input.length; index++) {
			int arrIndex = 0;
			int length = input[index].length();
			if (length % 2 == 0) {
				arrIndex = length / 2 - 1;
			} else {
				arrIndex = length / 2;
			}
			output[index] = input[index].charAt(arrIndex);
		}
		return output;
	}
	public static void main(String[] args) 
	{
		Test3_2 a = new Test3_2();
		String[] input = {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"};
		char[] ch = a.getMiddleChar(input);
		for (int index = 0; index < ch.length; index++) {
			System.out.println(input[index] + "---" + ch[index]);
		}
	}	

}
