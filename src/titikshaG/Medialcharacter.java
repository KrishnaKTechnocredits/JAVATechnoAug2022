//Return middle character of max length String from given array.
//input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
//output : c
package titikshaG;

public class Medialcharacter {
	String getmedialarray(String[] name)
	{ 
		int midLength=name[0].length();
		for(int index=0;index<name.length;index++)
		 	{
			if(midLength<=name[index].length())
				{
				name[0]=name[index];
				}
			}
			return name[0];
	}
		 
	char getMiddleCharacter(String[] str){ 
		String input=getmedialarray(str);
		int index=0;
		if (input.length()%2==0) {
			index=(input.length()/2-1);
		}
		else{
			index=(input.length()/2);
			}
		char ch=(input.charAt(index));
		return ch;
		}
//Write a method to return middle character of each elements from given array.
//input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"}
//output : Mahesh -> h
// Avni -> v
// Harshal -> s
// Aditty -> i
// Rahul -> h
	
	char[] getMiddleCharacterOfString(String[] name){
		char[] ch=new char[name.length];
		
		for(int index=0;index<name.length;index++) {
		int length=name[index].length();
		if (length%2==0) {
			ch[index]=name[index].charAt(length/2-1);
		}
		else{
			ch[index]=name[index].charAt(length/2);
			}
		}
		return ch;
		}
	
	public static void main(String[] arg)
		{
		Medialcharacter medialcharacter=new Medialcharacter();
		String[] output= {"Krishna","Maulik","Aashvi","Technocredits","Harsh"};
		System.out.println("Middle character of mid array is"+" "+medialcharacter.getMiddleCharacter(output));
		System.out.println();
		
		
		Medialcharacter medialcharacter2=new Medialcharacter();
		String[] a={"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"};
		char[] result=new char[a.length];
		result=medialcharacter2.getMiddleCharacterOfString(a);
		for (int index=0;index< a.length;index++){
			String output2=a[index] + " "+"->"+result[index];
			System.out.println("Middle chararcter of index value is" +" "+output2);
		}
	}
}
	

