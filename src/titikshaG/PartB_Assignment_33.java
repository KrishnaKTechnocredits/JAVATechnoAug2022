//program 4: print duplicate names from given array (do not consider case sensitivity). 
//input : {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
//output : hello
 //        ptc

package titikshaG;

public class PartB_Assignment_33 {

	void getduplicateString(String[] name) {
		for(int index=0;index<name.length;index++) {
				if (name[index]!="") {
					for(int innerLoop=index+1;innerLoop<name.length;innerLoop++) {
						if(name[index].toLowerCase().equals(name[innerLoop].toLowerCase()) && index!=innerLoop) {
							System.out.println("The duplicate values are:"+" "+name[index]); 
							name[innerLoop]="";}}}}	
		}
		
//program 5 : print unique names from given array. 
//input :{"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
//output : Hi
//Hell0
//Techno
//Credits
//ptc
		
	void getUniqueString(String[] uniString) {
		for(int index=0;index<uniString.length;index++) {
			if(uniString[index]!="") {
			for(int innerLoop=index+1;innerLoop<uniString.length;innerLoop++) {
				if(uniString[index]==(uniString[innerLoop]) && index!=innerLoop) {
					uniString[innerLoop]="";}
			}
			System.out.println("The unique values are:"+" "+uniString[index]);}
		}
	}
	

			
	public static void main(String[] args) {
		PartB_Assignment_33 assignment_33_b=new PartB_Assignment_33();
		System.out.println("-------------Program 1-------------");
		String[] name={"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
		assignment_33_b.getduplicateString(name);
		System.out.println();
		System.out.println("-----------------Program 2-------------");
		assignment_33_b.getUniqueString(name);
	}
}
	

	