//suppose you are standing in front of line of trees with different heights now requirement is to find how many trees are visible
package titikshaG;
import java.util.Arrays;

public class Visibletreeheight {
	
	int numberOfTreesVisible(int[] num)
	{
		int maxHeigth=num[0];
		int count=1;
		for(int index=0;index<num.length;index++) {
			if(num[index]>maxHeigth)
				{
				maxHeigth=num[index];
				count++;
				}
			}
		return count;
	}
	
	public static void main(String[] args)
		{
		Visibletreeheight visibletreeheight=new Visibletreeheight();
		int input[]={3,5,11,9,10,13};
		System.out.println(Arrays.toString(input));
		int output=visibletreeheight.numberOfTreesVisible(input);
		System.out.println("Total number of trees visible:"+" " +output);
		
		System.out.println();
		
		int[] input2={3,5,4};
		System.out.println(Arrays.toString(input2));
		int output2=visibletreeheight.numberOfTreesVisible(input2);
		System.out.println("Total number of trees visible:"+" " +output2);
		}
}
