/*Program 2:
Write a method to return middle character of each elements from given array. */

package komalShrivastava;
import java.util.Arrays;

public class Test3b {

	public static void main(String[] args) {
		
		//access getMiddleCharacter Method from Class Test3a
		
		Test3a test3a = new Test3a();
		String []inputArray = {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"};
		System.out.println("Middle Character for each array element \n" + Arrays.toString(inputArray));
		for(int index=0; index<inputArray.length; index++) {
			char ch = test3a.getMiddleCharacter(inputArray[index]);
			System.out.println(inputArray[index] + " --> " + ch);
		}
	}
}