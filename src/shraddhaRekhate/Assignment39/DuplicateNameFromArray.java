package shraddhaRekhate.Assignment39;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateNameFromArray {
	
//	Program 1: Print all duplicate names from given Array.
//
//	input : {"Maulik", "Umesh", "Saroj", "Umesh"};
//	output : ["Umesh"] 
	HashSet<String> name=new HashSet<String>();
	void getDuplicateName(String[] arr){
		 for(String name:arr) {
			boolean flag= setOfName.add(name);
			if(flag==false) {
				System.out.println(name);
			}
		 }
	}
  
//  Program 2 : Return unique names from given Array.
//  String[] arr = {"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
//  output : ["Maulik", "Umesh", "Saroj"]
	LinkedHashSet<String> setOfName=new LinkedHashSet<String>();
  LinkedHashSet<String> getUniqueSetOfName(String[] arr){
		 for(String name:arr) {
			 setOfName.add(name);
		 }
		 return setOfName;
	}
//  Program 3 : Write a program to return unique characters from given name.
//
//		  input : technocredits
//		  output : [t,e,c,h,n,o,r,d,i,s]
  LinkedHashSet<Character> setOfChar=new LinkedHashSet<Character>();
  LinkedHashSet<Character> getUniqueSetOfChar(String str){
	  for(int index=0;index<str.length();index++) {
		   char ch=str.charAt(index);
		   setOfChar.add(ch);
		 }
		 return setOfChar;
	   
  }
//  Program 4 : Remove duplicates from array containing numbers [insertion order].
//
//  input : {10,10,13,12,12,10,55,66,55,11}
//  output : [10,13,12,55,66,11]
  LinkedHashSet<Integer> setOfNum=new LinkedHashSet<Integer>();
  LinkedHashSet<Integer> removeDuplicateFromNumArray(int[] arr){
		 for(int num:arr) {
			 setOfNum.add(num);
		 }
		 return setOfNum;
	}
//  Program 5 : Remove duplicates from array containing numbers [natural order].
//
//  input : {10,10,13,12,12,10,55,66,55,11}
//  output : [10,11,12,13,55,66]
  TreeSet<Integer> numArraySet=new TreeSet<Integer>();
  TreeSet<Integer> remDuplicateFromNumArray(int[] arr){
		 for(int num:arr) {
			 numArraySet.add(num);
		 }
		 return numArraySet;
	}
//  Program 6 : Remove duplicates from array containing numbers using Set.
//
//  input : {10,10,13,12,12,10,55,66,55,11,11}
//  output : [10,12,55,11]
  Set<Integer> removeDuplicateNumUsingSet(int[] input){
	  Set<Integer> numSet=new LinkedHashSet<Integer>();
	  Set<Integer> output=new LinkedHashSet<Integer>();
	  
	  boolean flag=true;
	  for(int num: input) {
		  flag=numSet.add(num);
		  if(!flag) {
			  output.add(num);
		  }
	  }
	  return output;
  }
//  Program 7 : Remove duplicates from array containing numbers using List.
//
//  input : {10,10,13,12,12,10,55,66,55,11,11}
//  output : [10,12,55,11]
  ArrayList<Integer> getDUplicateList(Integer[] arr){
	   Integer[] input = {10,10,13,12,12,10,55,66,55,11,11};
	  ArrayList<Integer> inputArray=new ArrayList<Integer>(Arrays.asList(arr));
	  ArrayList<Integer> outPutArray=new ArrayList<Integer>(); 
	  for(int num:inputArray) {
		  if(inputArray.indexOf(num)!=inputArray.lastIndexOf(num) && outPutArray.contains(num)==false){
			  outPutArray.add(num);
		  }
	  }
	  return outPutArray;
	  }

		 
  public static void main(String[] args) {
	  DuplicateNameFromArray unique=new DuplicateNameFromArray();
	  //program 1
	  String[] arr={"Maulik", "Umesh", "Saroj", "Umesh"};
	 unique.getDuplicateName(arr);
	  //program 2
	  String[] arr2={"Maulik", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
	  System.out.println(unique.getUniqueSetOfName(arr2));
	  //program 3
	  String str="technocredits";
	  System.out.println(unique.getUniqueSetOfChar(str));
	  //program 4
	  int[] num={10,10,13,12,12,10,55,66,55,11};
	  System.out.println(unique.removeDuplicateFromNumArray(num));
	  //program 5
	  int[] num1={10,10,13,12,12,10,55,66,55,11};
	  System.out.println(unique.remDuplicateFromNumArray(num1));
	  //program 6
	  int[] num2={10,10,13,12,12,10,55,66,55,11,11};
	  System.out.println(unique.removeDuplicateNumUsingSet(num2));
	  //Program 7
	  Integer[] input = {10,10,13,12,12,10,55,66,55,11,11};
	  System.out.println(unique.getDUplicateList(input));
}
  
}
 