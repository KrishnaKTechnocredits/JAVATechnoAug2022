package technocredits.exception.throwsdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Manager {

	void processData() throws FileNotFoundException{
		File file = new File("D://mmk.txt");
		FileInputStream inputStream = new FileInputStream(file);
		System.out.println("Hello");
	}
}
