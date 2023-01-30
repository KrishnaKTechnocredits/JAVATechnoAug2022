
package gauravSahu.practiceJanuray2023;

import java.util.ArrayList;

public class practice28 {
	
	void getMaxWord(ArrayList<String> al) {
		ArrayList<Character> charAl = new ArrayList<Character>();
		for(int index = 0; index<al.size();index++) {
			String name = al.get(index);
			if(name.length()>6) {
				char ch = getMiddleChar(name);
				charAl.add(ch);
			}
		}	
		System.out.println(charAl);
	}
	
	char getMiddleChar(String name) {
		
		char ch1= ' ';
		if(name.length()%2==0) {
			ch1 = name.charAt(name.length()/2-1);
		}else {
			ch1 = name.charAt(name.length()/2);
		}
		
		return ch1;
		
	}

	public static void main(String[] args) {
		String [] input = {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"};
		
		ArrayList<String> al = new ArrayList<String>();
		
		for(String names : input) {
			al.add(names);
		}
		
		System.out.println(al);
		
		new practice28().getMaxWord(al);
		
		
	}
	
	
}
