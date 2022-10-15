package technocredits.collectionsdemo;

import java.util.ArrayList;

public class Example1 {
	
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		al.add("Manjiri");
		al.add(102);
		al.add(true);
		
		Object obj = al.get(0);
		String str = (String)obj;
		System.out.println(str.length());
	}
}
