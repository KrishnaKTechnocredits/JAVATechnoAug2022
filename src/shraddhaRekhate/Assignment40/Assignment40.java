package shraddhaRekhate.Assignment40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Assignment40 {
//	Program 1 : Find frequency of each number using array and single while loop.
//	input : {3,5,33,3,55,3,11,11}
//	output : 3--->3
//			5--->1
//			33--->1
//			55--->1
//			11--->2
  void freqOfEachNum(Integer[] arr) {
	  System.out.println(Arrays.toString(arr));
	  ArrayList<Integer> oldList=new ArrayList<Integer>(Arrays.asList(arr));
	  ArrayList<Integer> removeList=new ArrayList<Integer>();
	  int n=0, oldSize=0,newSize=0;
	  
	  while(oldList.size()>0) {
		  n=oldList.get(0);
		  oldSize=oldList.size();
		  removeList.add(n);
		  oldList.removeAll(removeList);
		  newSize=oldList.size();
		  System.out.println(n+"->"+(oldSize-newSize));
		}
	  }
//  Program 2 : Find missing numbers from give array from 50 to 60.
//  input : {60,54,51,57}
//  output : [50,52,53,55,56,58,59]
//
//  Hint : removeAll
 void printMissingNumFromGIvenRange(int start,int end,Integer[] arr) {
	 System.out.println(Arrays.toString(arr));
	 List<Integer> inputList=new ArrayList<Integer>(Arrays.asList(arr));
	 List<Integer> outputList=new ArrayList<Integer>();
	 
	 for(int index=start;index<=end;index++) {
		 outputList.add(index);
	 }
	 
	 outputList.removeAll(inputList);
	 System.out.println("Missing num from range are:"+ outputList);
 }
// Program 3 : Return a reverse String [Method : inplace reverse].
 String getReverseStringInplaceReversalMethod(String str) {
	 System.out.println("String:"+str);
	 for(int i=0,j=str.length()-1;i<j;i++,j--) {
		 char char1=str.charAt(i);
		 char char2=str.charAt(j);
		 
		 if(i==0) {
			 str=char2+str.substring(i+1,j)+char1;
		 }else {
			 str=str.substring(0,i)+char2+str.substring(i+1,j)+char1+str.substring(j+1);
		 }
	 }
	 return str;
 }
//Program 4 : Return a reverse String [Use : StringBuilder].
 StringBuilder getReverseStringUsingStringBuilder(String str) {
	 StringBuilder sb=new StringBuilder(str);
	 System.out.println("Original str:"+str);
	 sb.reverse();
	 return sb;
	 }
// Program 5 : WAP to find frequence of each character using Map.
// input : technocredits
// output : {r=1, c=2, s=1, t=2, d=1, e=2, h=1, i=1, n=1, o=1}
//           r --> 1
// 		  c --> 2
//           s --> 1
//           t --> 2
//           ..... so on
 void pringFreqOfEachChar(String str) {
	 Map<Character,Integer> charFreq=new HashMap<Character,Integer>();
	 for(int index=0;index<str.length();index++) {
		 Character ch=str.charAt(index);
		 if(charFreq.containsKey(ch)) {
			 charFreq.put(ch,charFreq.get(ch)+1);
		 }else {
			 charFreq.put(ch, 1);
		 }
	 }
	 Set<Character> key=charFreq.keySet();
	 for(Character currentKey: key) {
		 System.out.println(currentKey+"->"+charFreq.get(currentKey));
	 }
}
// Program 6 : WAP to find frequence of each word in a given String using Map.
// input : "Hi Hello Techno Techno Hi"
// output : Hi -> 2
//          Hello -> 1
// 		 Techno -> 2

void freqOFEachWordInGivenString(String[] str) {
	Map<String ,Integer> stringFreq=new LinkedHashMap<String,Integer>();
	for(String n:str) {
	  if(stringFreq.containsKey(n)) {
		  stringFreq.put(n,stringFreq.get(n)+1);
	  }else {
		  stringFreq.put(n,1);
	  }
	}
	Set<String> key=stringFreq.keySet();
	for(String currentKey:key) {
		System.out.println(currentKey+"-->"+stringFreq.get(currentKey));
	}
}
//Program 7 : WAP to find frequence of each word in a given String using Map.
//input : {10,2,5,2,3,3,3,10,11,8,8,8};
//output : 2 -> 2
//         3 -> 3
//         5 -> 1
//         8 -> 3
//         10 -> 2
//         11 -> 1  
void printFreqOfEachNumUsingMap(Integer[] input) {
	System.out.println(Arrays.toString(input));
	Map<Integer,Integer> numFreq=new TreeMap<Integer,Integer>();
	for(Integer n:input) {
		if(numFreq.containsKey(numFreq)) {
			numFreq.put(n, numFreq.get(n)+1);
		}else {
			numFreq.put(n, 1);
		}
	}
	Set<Integer> key= numFreq.keySet();
	for(Integer currentKey: key) {
		System.out.println(currentKey+"-->"+numFreq.get(currentKey));
		}
	}
 public static void main(String[] args) {
	Assignment40 obj=new Assignment40();
	//pgrm1
	Integer[] inp1={3,5,33,3,55,3,11,11};
	obj.freqOfEachNum(inp1);
	//pgrm2
	Integer[] inp2={60,54,51,57};
	obj.printMissingNumFromGIvenRange(50,60,inp2);
	//pgrm3
	String str="technocredits";
	System.out.println(obj.getReverseStringInplaceReversalMethod(str));
	//pgrm4
	System.out.println(obj.getReverseStringUsingStringBuilder(str));
	//pgrm5
	obj.pringFreqOfEachChar(str);
	//pgrm6
	String input="Hi Hello Techno Techno Hi";
	String[] str3=input.split(" ");
	obj.freqOFEachWordInGivenString(str3);
	//pgrm7
	Integer[] inp3={10,2,5,2,3,3,3,10,11,8,8,8};
	obj.freqOfEachNum(inp3);
   }
}
