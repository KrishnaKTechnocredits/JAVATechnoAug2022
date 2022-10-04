/*Assignment - 20 : 10th Sep'2022
5) Return count of vowels in a given String.
input : maulik
output : 3*/

package rashmiG.assignment20ArrayAndStringPrograms;

class VowelCountInString{

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
	
	public static void main(String[] args){
		VowelCountInString vowelCount=new VowelCountInString();
		String name="maulik";
		String name1 = "Kest67Uio[]";
		System.out.println("Number of vowels in a string -> "+name+"\n"+ vowelCount.getVowelCount(name));
		System.out.println("Number of vowels in a string -> "+name1+"\n"+ vowelCount.getVowelCount(name1));
	}
}
			