//finding Middle Character in string.
package namratamishra;
class Middlechar {
	char getMiddlechar(String name) {
		int l = name.length();
		char ch;
		if (l % 2 == 0)
			ch = name.charAt(l / 2 - 1);
		else
			ch = name.charAt(l / 2);
		return ch;
	}

public static void main(String [] args)
{
Middlechar m= new Middlechar();
System.out.println("middle character in Maulik is "+m.getMiddlechar("Maulik"));
System.out.println("middle character in Techocredits is "+ m.getMiddlechar("Techocredits"));
}
}