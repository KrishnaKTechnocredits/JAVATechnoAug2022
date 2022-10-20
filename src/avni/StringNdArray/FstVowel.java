package avni.StringNdArray;

public class FstVowel {
	
	void  vowelFromString(String name) {
		
		name =  name.toLowerCase() ;
		for(int i = 0 ; i<name.length(); i++) {
			if(name.charAt(i)== 'a' || name.charAt(i)== 'e' || name.charAt(i)=='i' ||name.charAt(i)== 'o' ||name.charAt(i)== 'u') {
			System.out.print(name.charAt(i));
			break ;
			}
		}
		
	}
	public static void main(String[] args) {
		FstVowel fst = new FstVowel();
		fst.vowelFromString("Techno");
		
		
	}

}

