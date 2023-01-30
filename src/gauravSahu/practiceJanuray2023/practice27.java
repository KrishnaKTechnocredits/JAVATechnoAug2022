
package gauravSahu.practiceJanuray2023;

import java.util.ArrayList;

public class practice27 {
	
	
	void replaceName(ArrayList<String> al , String name , String replaceName) {
		for(int index = 0; index<al.size();index++) {
			String str = al.get(index);
			if(str.equals(name)) {
				int a = al.indexOf(name);
				al.set(index, replaceName);
			}
			
		}System.out.println(al);
		
	}
	
	void replaceNum(ArrayList<Integer> al , int num) {
		for(int index = 0; index<al.size();index++) {
			int a = al.get(index);
			if(a<num) {
				int b = al.indexOf(a);
				al.set(b, a + 10 );
			}
			
		}System.out.println(al);
		
	}
	
	
	
	public static void main(String[] args) {
		String [] input = {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"};
		
		ArrayList<String> al = new ArrayList<String>();
				
		for(String name : input) {
			al.add(name);
		}
		
		System.out.println(al);
		
		String givenName = "Deepak";
		String replaceName = "Shivani";
		
		new practice27().replaceName(al, givenName, replaceName);
		
		
		int[] input2 = { 23, 55, 34, 88, 58, 81 };
		
		ArrayList<Integer> al2  = new ArrayList<Integer>();
		
		for(int a : input2) {
			al2.add(a);
		}
		
		System.out.println(al2);
		
		int replaceNum  = 35;
				
		new practice27().replaceNum(al2, replaceNum);
		
		
		
	}
}
