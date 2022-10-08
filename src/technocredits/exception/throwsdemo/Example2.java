package technocredits.exception.throwsdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.util.Properties;

public class Example2 {

	void m1() throws IOException{
		/*
		 * File file = new File("D://fun.txt"); System.out.println(1); FileInputStream
		 * input = new FileInputStream(file); System.out.println(2);
		 * System.out.println("techno");
		 */
		
		FileInputStream inputStream1 = new FileInputStream(new File("D://student.properties"));
		Properties prop = new Properties();
		prop.load(inputStream1);
	}
}
