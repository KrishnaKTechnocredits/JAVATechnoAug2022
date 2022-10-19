/*Assignment - 38 : 14th Oct'2022
 Program 2: 
Increse student marks by 10 if marks is less than 35.

input : [23,55,34,88,58,81]
output : [33,55,44,88,58,81]
*/
package deepakPatil.Assignment38ArrayList;

import java.util.ArrayList;

import java.util.Arrays;

public class Assignment38_2 {
	
	ArrayList <Integer> replaceMarks(ArrayList<Integer> markList){
		
		for(int marks : markList) {
			if(marks<35)
				markList.set(markList.indexOf(marks),marks+10);
		}
		return markList;
	}
	
	public static void main(String[] args) {
		Assignment38_2 assignment38_2 = new Assignment38_2();
		
		Integer [] marks= {23,55,34,88,58,81};
		ArrayList <Integer> markList=new ArrayList<Integer>(Arrays.asList(marks));
		System.out.println("Given input marklist is: "+markList);
		System.out.println("List after replacing mark :");
		System.out.println(assignment38_2.replaceMarks(markList));
		
	}

}
