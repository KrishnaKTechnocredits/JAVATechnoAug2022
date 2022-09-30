/*Assignment - 28 : 25th Sep'2022
Program 1 : [10 mins - 13 mins]
Return count of vowels in a given String using switch case.
input : TechnOcredits
output : 4
Program 2 : [10 mins]
Return first vowel from given String.
input : technocredits
outout : e
Program 3: [15 mins]
Print count of each vowels in a given String using switch case.
input : technocredits
output : e -> 2
         o -> 1
		 i -> 1
		 
Program 4: [15 mins]
Print count of each vowels in a given String Array using switch case.
input : {"technocredits", "swati", "aashvi"}
output : vowel count in technocredits:
		 e -> 2
         o -> 1
		 i -> 1
		 vowel count in swati:
		 a -> 1
         i -> 1
		 vowel count in aashvi:
		 a -> 2
         i -> 1
int count = 0;
for(int index=0;index<str.length();index++){
	char ch = str.charAt(index);
	
	switch(ch){
		case 'a':
		case 'A':
			count++;
			break;	
	}
}

*/

package shivaniLikhia;

public class Assignment28 {

	int getCountOfVowelInString(String str) {
		int count = 0;
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
			switch(ch){
			case 'a' :
			case 'A' : 
				count++;
				break;
			case 'e' :
			case 'E' : 
				count++;
				break;
			case 'i' :
			case 'I' : 
				count++;
				break;
				
			case 'o' :
			case 'O' : 
				count++;
				break;
			case 'u' :
			case 'U' : 
				count++;
				break;
			}
		}
		return count;
	}
	
	char getFirstVowelFromString(String str) {
		int count = 0;
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
			switch(ch){
			case 'a' :
			case 'A' : 
				count++;
				if(count==1)
					return ch;
			case 'e' :
			case 'E' : 
				count++;
				if(count==1)
					return ch;
			case 'i' :
			case 'I' : 
				count++;
				if(count==1)
					return ch;
				
			case 'o' :
			case 'O' : 
				count++;
				if(count==1)
					return ch ;
			case 'u' :
			case 'U' : 
				count++;
				if(count==1)
					return ch;
			}
		}
		return ' ';
	}
	
	void getCountOfEachVowelInString(String str) {
		int aCount = 0;
		int eCount = 0;
		int iCount = 0;
		int oCount = 0;
		int uCount = 0;
		
		System.out.println("The number of vowels in " +str+ " is : ");
		
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
			switch(ch){
			case 'a' :
			case 'A' : 
				aCount++;
					break;
			case 'e' :
			case 'E' : 
				eCount++;
					break;
			case 'i' :
			case 'I' : 
				iCount++;
					break;
				
			case 'o' :
			case 'O' : 
				oCount++;
					break;
			case 'u' :
			case 'U' : 
				uCount++;
			}
		}
		if(aCount>0)
			System.out.println(" a --> " +aCount);
		if(eCount>0)
			System.out.println(" e --> " +eCount);
		if(iCount>0)
			System.out.println(" i --> " +iCount);
		if(oCount>0)
			System.out.println(" o --> " +oCount);
		if(uCount>0)
			System.out.println(" u --> " +uCount);
	}
	
	void getVowelCountFromArray(String[] arr) {
		for(int index=0;index<arr.length;index++) {
			getCountOfEachVowelInString(arr[index]);
		}
	}
	
	public static void main(String[] args) {
		Assignment28 assignment28 = new Assignment28();
		System.out.println("The number of vowels in a given string is : " +assignment28.getCountOfVowelInString("technOcredits"));
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println(assignment28.getFirstVowelFromString("technOcredits"));
		System.out.println("-------------------------------------------------------------------------------------------------------");
		assignment28.getCountOfEachVowelInString("technOcredits");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		String[] arr = {"technocredits", "swati", "aashvi"};
		assignment28.getVowelCountFromArray(arr);
	}
}
