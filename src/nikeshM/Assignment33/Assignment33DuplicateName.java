package nikeshM.Assignment33;

import java.util.Arrays;

//program 4: print duplicate names from given array (do not consider case sensitivity). 
//input : {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
//output : hello
//         ptc

public class Assignment33DuplicateName {
	void getDuplicateName(String [] name){
		System.out.println( "Duplicate Names From Given Array Are : " );
		for(int index = 0 ; index<name.length ; index++) {
			name[index] = name[index].toLowerCase();
			int count = 1;
			for(int innerindex = index+1 ; innerindex<name.length ; innerindex++) {
				if(name[index].equalsIgnoreCase(name[innerindex]) && name[innerindex]!= "") {
				name[innerindex] = "";
				count++;
			}
		}
		if(count>1) {
			System.out.println(name[index]);
		}
	}
}
	public static void main(String[] args) {
		String [] name = {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
		System.out.println("Input Array " +Arrays.toString(name));
		Assignment33DuplicateName duplicateno = new Assignment33DuplicateName();
			duplicateno.getDuplicateName(name);
	}

}