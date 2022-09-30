package kiran.assignmet28.switchprogram1;
/*Program 1 : [10 mins - 13 mins]
Return count of vowels in a given String using switch case.

input : TechnOcredits
output : 4*/
public class Program4 {
	void getVowelCount(String str) {
		int counta=0,counte=0,counti=0,counto=0,countu=0;
		for(int i=0;i<str.length()-1;i++) {
			char ch=str.charAt(i);
		
			 switch(ch) {
			  case 'a': 
		 		 counta++;
				System.out.println(ch+"->"+counta);
				break;
			  case 'e': 
				counte++;
				System.out.println(ch+"->"+counte);
				break;
			  case 'i': 
				counti++;
				System.out.println(ch+"->"+counti);
				break;
			  case 'o': 
				counto++;
				System.out.println(ch+"->"+counto);
				break;
			  case 'u': 
				countu++;
				System.out.println(ch+"->"+countu);
				break;

			}
		}
	}
	
	void getVowelCountOfWord(String[] input) {
		//String[] word=str.split(" ");
		for(int i=0;i<input.length;i++) {
			System.out.println("vowel count in "+input[i]);
			getVowelCount(input[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Program4 obj=new Program4();
		String[] arr= {"technocredits", "swati", "aashvi"};
		obj.getVowelCountOfWord(arr);
	}

}
