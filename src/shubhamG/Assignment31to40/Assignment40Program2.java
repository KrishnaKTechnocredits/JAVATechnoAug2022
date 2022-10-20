package shubhamG.Assignment31to40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

import jagruti.Assignment22new.Assignment22new;

public class Assignment40Program2 {

	TreeSet<Integer> getMissingNumberInRange(int startIndex, int endIndex,Integer[] arr){
		ArrayList<Integer> al= new ArrayList<Integer>(Arrays.asList(arr));
		TreeSet<Integer> outputSet = new TreeSet<Integer>();
		for(int i =startIndex;i<=endIndex;i++) {
			outputSet.add(i);
		}
		outputSet.removeAll(al);
		
		return outputSet;
	}
	
	public static void main(String[] args) {
		Assignment40Program2 missingNumber= new Assignment40Program2();
		Integer[] input ={60,54,51,57};
		System.out.println("Input String is: "+Arrays.toString(input));
		TreeSet<Integer> output=  missingNumber.getMissingNumberInRange(50, 60, input);
		System.out.println("Missing number from given input string is : "+ output);
		
	}
	
}
