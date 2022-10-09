package technocredits.exception.throwsdemo;

import java.io.File;
import java.io.FileInputStream;

public class Example {

	void m1() throws Exception {
		 File file = new File("D://fun.txt"); System.out.println(1); FileInputStream
		 input = new FileInputStream(file); System.out.println(2);
		 System.out.println("techno");
	}
	
	public static void main(String[] args) {
		Example example = new Example();
		try {
			example.m1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
