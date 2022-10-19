package nikeshM.Assignment33;
//
//program 5 : print unique names from given array. 
//input : {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
//output : Hi
//         Hello
//		 Techno
//		 Credits

import java.util.Arrays;

public class Assignment33UniqueName {
	void getUniqueName(String [] name){
		System.out.println( "Unique Names From Given Array Are : " );
		for(int index = 0 ; index<name.length ; index++) {
			int count = 1;
			for(int innerindex = index+1 ; innerindex<name.length ; innerindex++) {
				if(name[index].equalsIgnoreCase(name[innerindex]) && name[innerindex]!= "") {
				name[innerindex] = "";
				count++;
			}
		}
		if(count>=1 && name[index]!="") {
			System.out.println(name[index]);
		}
	}
}

	public static void main(String[] args) {
		String[] name = {"Hi", "Hello", "Hello","Techno","Credits","Techno"};;
		System.out.println("Input Array " + Arrays.toString(name));
		Assignment33UniqueName unique = new Assignment33UniqueName();
		unique.getUniqueName(name);
	}
}
