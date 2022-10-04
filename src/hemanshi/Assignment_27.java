/*Assignment-27 : 23rd Sep'2022  
Program - 1. --25 mins
Write a program to print unique character of each name in given string array.  
String[] arr = {"Maulik", "Kanani","Mahesh", "Kanani"};  
 Name is Maulik :  
 M
 a  
 u
 l  
 i  
 k  
 ----------------------  
 Name is Kanani :  
 K  
 i
Program - 2. --15 mins
 Write a program to print 1st unique character of each name in given string array.
 String[] arr = {"Maulik", "KananiK", "akanksha"};  
Name is Maulik :
 M  
-------------------  
Name is KananiK : 
i  
-------------------  
Name is akanksha : 
n 
*/

package hemanshi;

public class Assignment_27 {
	
	
	void getUniqueChar(String str) {
		System.out.println("The String is "+str+" :");
		
		for(int index=0; index<str.length(); index++) {
			int count = 0;
			char ch = str.charAt(index);
			
			for(int innerIndex=0; innerIndex<str.length(); innerIndex++) {
				char innerch = str.charAt(innerIndex);
				if(innerch==ch) {
					count++;//if the outer loop's char matches with inner loop char then increase the count
					
				}
			}
					
			if(count==1) {
				System.out.println(ch);// if the count is 1 that means it occured just once i.e unique
			}
		}
		
	}

	void printUniqueChar(String[] input) {
		for(int index=0; index<input.length; index++) {
			getUniqueChar(input[index]);
			System.out.println("---------------------");
			   
		   }
	   }
	  
	   
	   void getFirstUniqueChar(String input) {
			System.out.println("Name is "+input+" :");
			
			for(int index=0; index<input.length(); index++) {
				int count=0;
				char ch = input.charAt(index);
				
				for(int innerIndex=0; innerIndex<input.length(); innerIndex++) {
					char innerCh = input.charAt(innerIndex);
					if(innerCh==ch) {
						count++; //if the outer loop's char matches with inner loop char then increase the count
					}
				}
				if(count==1) {
					System.out.println(ch);// if the count is 1 that means it occured just once i.e unique
					break;
				}
			}
		}
	   
	   
	   void printFirstUniqueCha(String[] input) {
		   for(int index=0; index<input.length; index++) {
				getFirstUniqueChar(input[index]);
				System.out.println("---------------------");
	       }
	   }
	
	public static void main(String[] args) {
		Assignment_27 assignment_27 = new Assignment_27();
		
		String[] arr = {"Maulik", "Kanani","Hemanshi", "Jay"};  
		System.out.println("Print all unique characters in the given String Array : ");
		assignment_27.printUniqueChar(arr);
		System.out.println("-----------------------------------------------------");
		
		
		String[] arr2 = {"Maulik", "KananiK", "Hemanshi"};
		System.out.println("Print first unique characters in each String from the given String Array : ");
		assignment_27.printFirstUniqueCha(arr2);

		
	}
}
