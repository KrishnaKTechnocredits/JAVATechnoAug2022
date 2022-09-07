//Program 2 : Write a method to return even position characters from given String. *
//input : technocredits
//output : ehordt

package shivaniLikhia;

public class EvenPositionCharacter {
	
	String getEvenPositionChar(String name) {
		String revPositionName = "";
		int nameLength = name.length();
		for(int index=0;index<=nameLength-1;index++) {
			if(index%2!=0) {
			revPositionName = revPositionName + name.charAt(index);
			}
		}
		return revPositionName;
	}
	
	public static void main(String[] args) {
		System.out.println(new EvenPositionCharacter().getEvenPositionChar("technocredits") );
	}
}
