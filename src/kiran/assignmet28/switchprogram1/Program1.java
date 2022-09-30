package kiran.assignmet28.switchprogram1;
/*Program 1 : [10 mins - 13 mins]
Return count of vowels in a given String using switch case.

input : TechnOcredits
output : 4*/
public class Program1 {
	void getVowelCount(String str) {
		int count=0;
		for(int i=0;i<str.length()-1;i++) {
			char ch=str.charAt(i);
			switch(ch) {
			case 'a': 
				count++;
				//System.out.println(count);
				break;
			case 'e': 
				count++;
				break;
			case 'i': 
				count++;
				break;
			case 'o': 
				count++;
				break;
			case 'u': 
				count++;
				break;
			case 'A': 
				count++;
				//System.out.println(count);
				break;
			case 'E': 
				count++;
				break;
			case 'I': 
				count++;
				break;
			case 'O': 
				count++;
				break;
			case 'U': 
				count++;
				break;
			
			}
		}
		System.out.println("vowel count : "+count);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Program1 obj=new Program1();
		obj.getVowelCount("TechnOcredits");
	}

}
