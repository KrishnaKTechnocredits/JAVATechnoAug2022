package shraddhaRekhate.Assignment27;
//1. Write a program to print unique character of each name in given string array.
//
//String[] arr = {"Maulik", "Kanani","Mahesh", "Kanani"};
//
//Name is Maulik :
//M
//a
//u
//l
//i
//k
//----------------------
//Name is Kanani : 
//K
//I
//
//2.  Write a program to print 1st unique character of each name in given string array.
//
//String[] arr = {"Maulik", "KananiK", "akanksha"};
//
//Name is Maulik : M
//-------------------
//Name is KananiK : i
//-------------------
//Name is akanksha : n 

import java.util.Arrays;

public class UniqueCharacter {
	
		   void getUniqueCharacterFromString(String[] str) {
			  System.out.println(Arrays.toString(str));
			  for(String name:str) {
				  System.out.println("Name is "+ name+":");
				  for(int index=0;index<name.length();index++) {
					  if(name.indexOf(name.charAt(index))==name.lastIndexOf(name.charAt(index))){
						  System.out.println(name.charAt(index));
					  }
				  }
				  System.out.println("-----------------------");
			  }
		  }
		   
		   void getFirstUniqueCharacter(String[] str1) {
			   System.out.println(Arrays.toString(str1));
				  for(String name:str1) {
					  for(int index=0;index<name.length();index++) {
						  if(name.indexOf(name.charAt(index))==name.lastIndexOf(name.charAt(index))){
							  System.out.println("Name is "+ name+ ":"+name.charAt(index));
							  break;
						  }
					  }
					  System.out.println("-----------------------");
				  }
		   }
		   
		   public static void main(String[] args) {
			   String[] a={"Maulik", "KananiK", "akanksha"};
			   String[] b={"Maulik", "Kanani","Mahesh", "Kanani"};
			   UniqueCharacter uniqueCharacter=new UniqueCharacter();
			   uniqueCharacter.getFirstUniqueCharacter(a);
			   uniqueCharacter.getUniqueCharacterFromString(b);
		}
}
