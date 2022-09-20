/*Assignment - 20 : 10th Sep'2022
6) Write a method to count vowels of each name in given array.
input : {"Ashish","Aditty","Manjiri","Ankita"}
output : Ashish -> 2
         Aditty -> 2
		 Manjiri -> 3
		 Ankita -> 3*/
		 
package rashmiG.assignment20ArrayAndStringPrograms;

class VowelCountArray{

	int getVowelCount(String name){
		int vowelCount=0;
		String lowerCaseName=name.toLowerCase();
		for(int index=0;index<lowerCaseName.length();index++){
			char ch=lowerCaseName.charAt(index);
			if(ch=='a')
				vowelCount++;
			else if(ch=='e')
				vowelCount++;
			else if(ch=='i')
				vowelCount++;
			else if(ch=='o')
				vowelCount++;
			else if(ch=='u')
				vowelCount++;
		}
	return vowelCount;
	}
	
	int[] getVowelCountArray(String[] input){
		int[] output=new int[input.length];
		for(int index=0;index<input.length;index++){
			output[index]=getVowelCount(input[index]);
		}
	return output;
	}
	
	public static void main(String[] args){
		String[] input= {"Ashish","Aditty","Manjiri","Ankita","tzx"};
		int[] outputArray=new VowelCountArray().getVowelCountArray(input);
		for(int index=0;index<outputArray.length;index++){
			System.out.println(input[index]+" -> "+outputArray[index]);
		}
	}
}
		
		