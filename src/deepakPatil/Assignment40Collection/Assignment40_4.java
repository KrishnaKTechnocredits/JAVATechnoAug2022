/*
Program 4 : Return a reverse String [Use : StringBuilder].
*/

package deepakPatil.Assignment40Collection;

public class Assignment40_4 {
	
	public static void main(String[] args) {
		String name="Technocredits";
		StringBuilder stringBuilder = new StringBuilder(name);
		System.out.println("Reverse string of '"+name+"' is '"+stringBuilder.reverse()+"'");	
	}
}
