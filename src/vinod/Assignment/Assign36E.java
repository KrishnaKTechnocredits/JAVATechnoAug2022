/*Program 6 : 
Print all characters having ascii value 91 ot 96.

output : 91 -> [
         92 -> \
         93 -> ]*/		 


package vinod.Assignment;

public class Assign36E {
	void getCharacter() {
		for(int i=91; i<=96; i++) {
			System.out.println("Character of Value " + i + " is " + (char) i);
		}
	}
	public static void main(String[] args) {
		Assign36E assign36E = new Assign36E();
		assign36E.getCharacter();
	}

}
