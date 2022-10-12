
package chaitanyaMankar.Array;

public class DuplicateNumberSearch 
{
	int DupNo(int[] arr)
	{
		for(int index = 0;index<arr.length-1;index++)
		{
			for(int jindex=index+1;jindex<arr.length;jindex++)
			{
				if((arr[index]==arr[jindex]) && (index != jindex))
				{
					if(arr[jindex]!=0)
					{
					System.out.println("Duplicate Number:"+arr[jindex]);
					arr[jindex]=0;
					break;
					}
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) 
	{
		DuplicateNumberSearch dn = new DuplicateNumberSearch();
		int[] x = {10,12,44,12,77,67,12,44};
		dn.DupNo(x);
	}
}
