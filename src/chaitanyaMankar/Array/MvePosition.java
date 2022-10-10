/*Assignment - 29 : 27th Sep'2022

Program 1 : 
Shift all Zero's at the end of an array.

input : {10,0,0,3,4,5,0,9}
output : {10,3,4,5,9,0,0,0}

Program 2 : 
Shift all zero's at the beginning of the an array.

input : {10,0,0,3,4,5,0,9}
output : {0,0,0,10,3,4,5,9}*/

package chaitanyaMankar.Array;

public class MvePosition {
	
	void returnArr (int[] Input)
	{
		int[] tempArr = new int [Input.length];
		int k=0;
		for(int index=0;index<Input.length;index++)
		{
			if(Input[index]!=0)
			{
				tempArr[k]=Input[index];				
				k++;
				
			}
		}
		for(int index=0;index<Input.length;index++)
		{
			System.out.println("Rearranged 0 Last:"+tempArr[index]);
		}
	}
	
	
	void returnArr1 (int[] Input)
	{
		int[] tempArr = new int [Input.length];
		int ks=0, count=0;
		for(int index=0;index<Input.length;index++) //{10,0,0,3,4,5,0,9};
		{
			if(Input[index]==0)
			{
				tempArr[ks]=Input[index];
				count++;
				ks++;
			}
		}
		for(int index=0;index<Input.length;index++) 
		{
			if(Input[index]!=0)
			{
				tempArr[count]=Input[index];
				count++;
			}
		}
		System.out.println("");
		
		for(int index=0;index<Input.length;index++)
		{
			System.out.println("Rearranged 0 First:"+tempArr[index]);
		}
	}

	public static void main(String[] args) 
	{
		MvePosition mp = new MvePosition();
		int[] num = {10,0,0,3,4,5,0,9};
		mp.returnArr(num);
		mp.returnArr1(num);
	}
}
