package vibhaS;

public class Assignment18 {

	String getAllDigitAllCharacter(String str){
		String digit="";
		String word="";
		for(int index=0;index<str.length();index++){
		char ch=str.charAt(index);
			if(Character.isDigit(ch)){
				digit=digit+ch;
			}else if(Character.isLetter(ch)){
			   word=word+ch;
			}
	}
		return digit+word;
	}
	
	String getRearrangeString(String str){
		String upperLetter="";
		String lowerLetter="";
		String digit="";
		for(int index=0;index<str.length();index++){
			char ch=str.charAt(index);
			if(Character.isUpperCase(ch)){
				upperLetter=upperLetter+ch;;
			}else if(Character.isLowerCase(ch)){
				lowerLetter=lowerLetter+ch;
			}else if(Character.isDigit(ch)){
				digit=digit+ch;
			}
		}
		return(upperLetter+digit+lowerLetter);
	}
	
	int getFrequencyOfDigit(String str,char targetchar){
		int count=0;
		for(int index=0;index<str.length();index++){
			char ch=str.charAt(index);
			if(Character.toLowerCase(ch)==targetchar){
				count++;
			}
		}
		return(count);
	}
	
	
	
	public static void main(String[] args){
		String ans=new Assignment18().getAllDigitAllCharacter("te2cH4no");
		System.out.println("all digit all Chacter is => "+ans);
		System.out.println("");
		String ans1=new Assignment18().getRearrangeString("t8EcHNo%Cred3iTs");
		System.out.println("Rearrange ths String is => "+ans1);
		System.out.println("");
		int ans2=new Assignment18().getFrequencyOfDigit("technoTtcredits",'t');
		System.out.println("Frequency of character t is => "+ans2);
	}

}
