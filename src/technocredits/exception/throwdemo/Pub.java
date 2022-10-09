package technocredits.exception.throwdemo;

import java.io.FileNotFoundException;

public class Pub {

	void pubEntry(int age) throws FileNotFoundException{
		if(age >=18) {
			System.out.println("Welcome sir");
		}else {
			System.out.println("Let me call your momma");				
			throw new FileNotFoundException();
		}
	}
	
	public static void main(String[] args) {
		Pub pub = new Pub();
		try {
			pub.pubEntry(16);
		} catch (FileNotFoundException e) {
			System.out.println("In catch");
		}
		System.out.println("End");
	}
}
