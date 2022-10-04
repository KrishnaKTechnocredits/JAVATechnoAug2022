package swapnilMaheshwari.ArrayPrograms;

public class MaxAndMinNumberInArray {
int maxNumArr (int[] arr) { 
	int max=0;
	for (int index=0; index<arr.length; index++) {
		if (max<arr[index])
		{
			max=arr[index];
		}
	}
	return max;
}

int minNumArr ( int[] arr1) {
	int min=0;
	
	for ( int index=0; index<arr1.length;index++)
	{  
		for ( int i=1; i<arr1.length;i++)
		{
			if(arr1[index]>arr1[i])
			{
			arr1[index]=arr1[i];
			min=arr1[index];
			}		
		}
	
	}
	return min;
}
	public static void main(String[] args) {
		int [] arr= {11,4,55,23,43};
		MaxAndMinNumberInArray maxNumberInArray=new MaxAndMinNumberInArray();
		int maxNum=maxNumberInArray.maxNumArr(arr);
		MaxAndMinNumberInArray minNumberInArray=new MaxAndMinNumberInArray();
		int minNum=minNumberInArray.minNumArr(arr);		
		System.out.println("The maximum number in array list :"+maxNum);
		System.out.println("The minium number in array list :"+minNum);
	}
}
