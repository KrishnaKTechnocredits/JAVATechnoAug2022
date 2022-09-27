package kiran.assignmet28.switchprogram1;
/*Program 1 : [10 mins - 13 mins]
Return count of vowels in a given String using switch case.

input : TechnOcredits
output : 4*/
public class Program2 {
	void getVowelCount(String str) {
		int count=0;
		for(int i=0;i<str.length()-1;i++) {
			char ch=str.charAt(i);
			if(count<1) 
			{
			 switch(ch) {
			  case 'a': 
		 		 count++;
				System.out.println(ch);
				break;
			  case 'e': 
				count++;
				System.out.println(ch);
				break;
			  case 'i': 
				count++;
				System.out.println(ch);
				break;
			  case 'o': 
				count++;
				System.out.println(ch);
				break;
			  case 'u': 
				count++;
				System.out.println(ch);
				break;
			  case 'A': 
				count++;
				System.out.println(ch);
				break;
			  case 'E': 
				count++;
				System.out.println(ch);
				break;
			  case 'I': 
				count++;
				System.out.println(ch);
				break;
			  case 'O': 
				count++;
				System.out.println(ch);
				break;
			  case 'U': 
				count++;
				System.out.println(ch);
				break;
			
			 	}
			}
		}
		System.out.println("vowel count : "+count);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Program2 obj=new Program2();
		obj.getVowelCount("technocredits");
	}

}
