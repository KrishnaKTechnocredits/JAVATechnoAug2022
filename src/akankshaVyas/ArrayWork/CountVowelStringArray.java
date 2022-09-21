/*
Write a method to count vowels of each name in given array.
input : {"Ashish","Aditty","Manjiri","Ankita"}
output : Ashish -> 2
         Aditty -> 2
		 Manjiri -> 3
		 Ankita -> 3
*/

package akankshaVyas.ArrayWork;

public class CountVowelStringArray {

	int getVowelCount(String str){
		int count = 0;
		str= str.toLowerCase();
		for(int index=0; index<str.length(); index++){
			if(str.charAt(index)== 'a'|| str.charAt(index) == 'e' || str.charAt(index) == 'i' || str.charAt(index)== 'o' || str.charAt(index)== 'u'){
			count++;
			}
		}
		return count;
	}
	
	int[] getVowelCountArray(String[] arr){
		int[] output = new int[arr.length];
		for(int index=0; index<arr.length; index++){
			output[index]=getVowelCount(arr[index]);
		}
	return output;
	}
	
	void display(String[] arr , int[] output){
		for(int index=0; index<arr.length; index++){
			System.out.println(arr[index] + " -> " + output[index]);
		}
	}
	
	public static void main(String[] args){
		String[] input = {"Ashish","Aditty","Manjiri","Ankita"};
		new CountVowelStringArray(). display(input , new CountVowelStringArray().getVowelCountArray(input));
	}

}

