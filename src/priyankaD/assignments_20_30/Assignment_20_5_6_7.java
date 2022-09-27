package priyankaD.assignments_20_30;
import java.util.Arrays;
public class Assignment_20_5_6_7 {
//5) Return count of vowels in a given String.
//input : maulik
//output : 3	
	int getCountofVowels(String name) {
    	int count=0;
    	name=name.toLowerCase();
    	for(int index=0;index<name.length();index++) {
    		if(name.charAt(index)=='a' || name.charAt(index)=='e' || name.charAt(index)=='i'||
    				name.charAt(index)=='o'||name.charAt(index)=='u') {
    			count++;
    			}
    	}return count;
    }
//6) Write a method to count vowels of each name in given array.
//input : {"Ashish","Aditty","Manjiri","Ankita"}
//output : Ashish -> 2
       //  Aditty -> 2
        //Manjiri -> 3
         //Ankita -> 3
    
    int[] getCountOfVowelInArray(String[] arr) {
    	int[] output=new int[arr.length];
    	for(int index=0;index<arr.length;index++) {
    	output[index]=getCountofVowels(arr[index]);
    	}return output;
    }
//7) Write a method to return name having maximum length.
//input : {"Ashish","Aditty","Manjiri","Ankita","Credits"}
//output : Credits
    void getMaxLengthWord(String[] arr) {
    	int maxlength=arr[0].length();
    	String max=arr[0];
    	for(int index=0;index<arr.length;index++) {
    		if(maxlength<arr[index].length())
    			maxlength=arr[index].length();
    		    max=arr[index];
    	}
    	System.out.println("Max length word in above String Array is-->"+max);
    }    
    
    public static void main(String[]args) {
    	Assignment_20_5_6_7 assignment2=new Assignment_20_5_6_7();
    	System.out.println("Total vowels in Maulik->"+assignment2.getCountofVowels("maulik"));
    	System.out.println("---------------------------------");
    
    	String[] arr= {"Ashish","Aditty","Manjiri","Ankita"};
    	System.out.println(Arrays.toString(arr));
    	int[]output=assignment2.getCountOfVowelInArray(arr);
    	for(int index=0;index<arr.length;index++) {
    	System.out.println(arr[index]+"->"+output[index]);}
    	System.out.println("--------------------------------");
    	
    	String[] input= {"Ashish","Aditty","Manjiri","Ankita","Credits"};
    	System.out.println(Arrays.toString(input));
    	assignment2.getMaxLengthWord(input);
    }
}
