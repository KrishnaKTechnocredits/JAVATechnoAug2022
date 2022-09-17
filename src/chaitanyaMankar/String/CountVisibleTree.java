/*Program 2 : Return count of visible trees. [15 - 20 mins, max - 30 mins]

input : {3,7,5}
output : 2

input : {3,5,11,9,10,13}
output : 4*/

package chaitanyaMankar.String;

public class CountVisibleTree 
{
	int visibleTree(int[] trees)
	{
		int c=0; 
		int cTree = 0;
		int pNumber = 0;
		for(int i=0;i<trees.length;i++)
		{
			cTree = trees[i];
			if(cTree > pNumber)
			{
				pNumber = cTree;
				c++;
			}
		}
		return c;
	}
	public static void main(String[] args) 
	{
		CountVisibleTree cvt = new CountVisibleTree();
		int[] trees = {3,7,5};
		int output = cvt.visibleTree(trees);
		System.out.println("Tree Visible in First: "+output);
		
		int[] trees2 = {3,5,11,9,10,13};
		int output2 = cvt.visibleTree(trees2);
		System.out.println("Tree Visible in Second: "+output2);
	}

}
