package vinod.Assignment;

import java.util.ArrayList;

public class Assignment37B {
	void removeMultipleOccurance(ArrayList<String> array, String name) {
		while(array.lastIndexOf(name)!= array.indexOf(name)) {
			array.remove(array.lastIndexOf(name));
		}
			System.out.println("Output : " + array);
		}
	
	void removeMultipleOccurance2(ArrayList<String> array) {		
	}
	
	public static void main(String[] args) {
		String[] input = { "Sagar", "Sagar", "Sagar", "Sagar", "Harshal", "Sagar", "Harshal", "Apurva", "Gaurav",
				"Sagar", "Gaurav", "Apurva", "Apurva", "Apurva" };
		ArrayList<String> array  = new ArrayList<String>();
		for(String name : input) {
			array.add(name);
		}
		System.out.println("Input : " + array);
		Assignment37B assign37B = new Assignment37B();
		assign37B.removeMultipleOccurance(array,"Sagar");
		
	}

}
