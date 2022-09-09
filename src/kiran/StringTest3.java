package kiran;

public class StringTest3 {
		int getCountOfTargetChar(String input, char targetchar) {
			//input=input.toUpperCase();
			int count=0;
			for(int i=0;i<=input.length()-1;i++) {
				char ch=input.charAt(i);
				if(ch==targetchar)
					count++;		
			}
		return count;
	}

	public static void main(String[] args) {
		StringTest3 obj=new StringTest3();
		String input = "TechnoTtcredits";
		char targetChar = 'T';
		int freqOfChar = obj.getCountOfTargetChar(input,targetChar);
		System.out.println(input + " freq of character " + targetChar + " is " + freqOfChar);
	}

}
