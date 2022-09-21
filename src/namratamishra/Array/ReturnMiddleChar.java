//Write a method to return middle character of each elements from given array.
//input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"}
//output : Mahesh -> h
//            Avni -> v
//             Harshal -> s
//              Aditty -> i
//              Rahul -> h


package namratamishra.Array;

public class ReturnMiddleChar {

	char getMiddleChar(String str) {
		str.length();
		char ch = ' ';
		if (str.length() % 2 == 0) {
			ch = str.charAt(str.length() / 2 - 1);
		} else
                   {
			ch = str.charAt(str.length() / 2);
		}
		return ch;
	}

	public static void main(String[] args) {
		
		String[] input = {"Mahesh", "Avni", "Puja", "Harshal", "Aditty", "Rahul"};		
		ReturnMiddleChar rmc  = new ReturnMiddleChar();		
		char[] output= new char [input.length];
		for (int i=0; i<input.length; i++)
		{
				output[i]=rmc.getMiddleChar(input[i]);
		 
		System.out.println("middle character in "+input[i]+ " is "+ output[i]);
	
		}
		
		
	}
	}