package mohiniA.ArrayOprationAssignments;
import java.util.Arrays;


public class ArrayOprationSecHighest {

int getSecondHighArrayElement(int[] num){
		
		
		for (int index=0;index<num.length;index++){
			for(int x=index+1 ; x< num.length;x++){
				int temp=0;
				if(num[index] < num[x])
				{
				temp=num[index];	
			    num[index]=num[x];
			    num[x]=temp;
				}
			  
			}
			
		}
		System.out.println("Desc array to find Second highest is: " + Arrays.toString(num));
		System.out.println("----------------------------------------------------------------------");
		return num[1];
}	

	public static void main(String[] args) {

		int[] num = { 3, 5, 11, 9, 10, 13 };
		System.out.println("Given array to find Second highest is: " + Arrays.toString(num));
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Second highest is : " + new ArrayOprationSecHighest().getSecondHighArrayElement(num));
		

	}

}
