/*program 5 : print unique names from given array. 
input : {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
output : Hi
         Hello
		 Techno
		 Credits*/



package manjiri.arrayEx.assignment33;

public class UniqueNames {
	
	void printUniqueNames(String[] input){
		
		for (int index = 0; index < input.length; index++) {
			//compare outer index with each inner index and check if match found
			for (int innerIndex = 0; innerIndex < input.length; innerIndex++) {
				if(input[index].equalsIgnoreCase(input[innerIndex])& index != innerIndex) {
					input[innerIndex] = "";
				}
			}
			if(input[index] != "")
				System.out.println(input[index]);
		}
	}
	
	public static void main(String[] args) {
		String[] inputArr = {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
		new UniqueNames().printUniqueNames(inputArr);
	}
}
