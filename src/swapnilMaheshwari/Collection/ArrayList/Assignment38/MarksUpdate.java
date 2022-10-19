/*Program 2: 
Increse student marks by 10 if marks is less than 35.

input : [23,55,34,88,58,81]
output : [33,55,44,88,58,81]
*/

package swapnilMaheshwari.Collection.ArrayList.Assignment38;

import java.util.ArrayList;

public class MarksUpdate {
	void getMarksUpdate(ArrayList<Integer> ListOfMarks) {
		for (int index = 0; index < ListOfMarks.size(); index++)
		// for (int num:ListOfNumber)
		{
			int marks = ListOfMarks.get(index);
			if (marks < 35) {
				ListOfMarks.set(index, (marks + 10));
			}

		}
		System.out.println("Output :" + ListOfMarks);

	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(23);
		al.add(55);
		al.add(34);
		al.add(88);
		al.add(51);
		System.out.println("Input:" + al);
		//ArrayList<Integer> output = new ArrayList<Integer>(al);
		MarksUpdate marksUpdate = new MarksUpdate();
		marksUpdate.getMarksUpdate(al);
		// System.out.println("Output:"+al);
	}
}
