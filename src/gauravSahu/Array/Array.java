package gauravSahu.Array;

public class Array {

	void printname() {
		String[] name = {"Gaurav", "Anku", "Garvis"};
		System.out.println(name.length);
		for(int index=0;index<name.length;index++) {
			System.out.println(name[index]);
		}
		String temp= name[2];
		System.out.println(name);
		System.out.println(name[0].length());
		System.out.println(name[1].length());
		System.out.println(name[2].length());
				
	}
	
	public static void main(String[] args) {
		new Array().printname();
		Array array = new Array();
		int [] num = {10,20,30,40};
	}}

