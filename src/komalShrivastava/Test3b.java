/*Program 2:
Write a method to return middle character of each elements from given array. */

package komalShrivastava;
import java.util.Arrays;

public class Test3b {
	
	char[] getMiddleCharacter(String[] input) {
		Test3a test3a = new Test3a();
		char ch[] = new char[input.length];
		for(int index=0; index <input.length; index++) {
			ch[index] = test3a.getMiddleCharacter(input[index]);
		}
		return ch;
	}

	public static void main(String[] args) {
		Test3b test3b = new Test3b();
		String []inputArray = {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"};
		System.out.println("Middle Character for each array element \n" + Arrays.toString(inputArray));
		char midCharArray[] = test3b.getMiddleCharacter(inputArray);
		for(int index=0; index<inputArray.length; index++)
			System.out.println(inputArray[index] + " --> " + midCharArray[index]);
		}
	}