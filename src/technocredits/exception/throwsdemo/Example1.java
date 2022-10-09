package technocredits.exception.throwsdemo;

import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;

public class Example1 {

	public static void main(String[] args) throws IOException{
		Example2 example2 = new Example2();
		try {
			example2.m1();
		}
		catch(FileNotFoundException e) {
			System.out.println("3");
		}
		System.out.println(4);
	}
}
