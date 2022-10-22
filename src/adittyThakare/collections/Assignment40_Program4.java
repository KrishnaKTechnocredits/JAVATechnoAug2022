/*Assignment 40 : 16th Oct'2022
Program 4 : Return a reverse String [Use : StringBuilder].*/
package adittyThakare.collections;

public class Assignment40_Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "technocredits";
		System.out.println("Input String: "+name);
		StringBuilder sb = new StringBuilder(name);
		System.out.println("Reversed String: "+sb.reverse());
	}

}
