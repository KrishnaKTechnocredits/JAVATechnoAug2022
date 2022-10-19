package shubhamG.Assignment31to40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/*
Program 1: Print all duplicate names from given Array.

input : {"Maulik", "Umesh", "Saroj", "Umesh"};
output : ["Umesh"] 
*/
public class Assignment39SetProg1 {

	ArrayList<String> returnDuplicateName(String[] arr) {
		ArrayList<String> duplicate = new ArrayList<String>();
		HashSet<String> setOfName = new HashSet<String>();
		for (String name : arr) {
			boolean flag = setOfName.add(name);
			if (!flag) {
				duplicate.add(name);
			}
		}
		return duplicate;
	}
	
	public static void main(String[] args) {
		Assignment39SetProg1 duplicateName = new Assignment39SetProg1();
		
		String[] str =  {"Maulik", "Umesh", "Saroj", "Umesh"};
		System.out.println("Input Array is : \n"+Arrays.toString(str));
		ArrayList<String> output = duplicateName.returnDuplicateName(str);
		System.out.println("\nDuplicate name from given input list is: \n"+output);
	}
}
