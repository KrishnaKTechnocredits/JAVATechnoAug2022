package chaitanyaMankar.Array;

public class DuplicateNumber 
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
					System.out.println(arr[jindex]);
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
		DuplicateNumber dn = new DuplicateNumber();
		int[] x = {10,12,44,12,77,67,12,44};
		dn.DupNo(x);
	}
}
