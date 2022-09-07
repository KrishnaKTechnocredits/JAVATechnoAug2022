package titikshaG;

public class Lengthofnumber {
	
	int lenghthOfStr(String str)
		{
		return str.length();
		}
	
	char m1(String str){
		int length=str.length();
		int index=0;
		if(length %2 ==0) {
			index=length/2-1;
		}
			
		else {
			index=length/2;
			}
		return str.charAt(index);
	}
	
	void display(String str) {
		int length=lenghthOfStr(str);
		System.out.println("The length of string is "+ length);
		char middlename=m1(str);
		System.out.println("The middle letter of" +" "+ str+" "+ "is"+" "+ middlename);
		System.out.println("--------------------------------------------");
		
	}
	public static void main(String[] args)
	{
		Lengthofnumber len=new Lengthofnumber();
		len.display("Maulik");
		len.display("Technocredit");
		len.display("Titiksha");
		
	}
	}
	
	