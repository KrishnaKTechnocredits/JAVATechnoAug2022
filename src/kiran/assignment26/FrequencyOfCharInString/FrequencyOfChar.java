package kiran.assignment26.FrequencyOfCharInString;

public class FrequencyOfChar {

	void getFreqOfCharInString(String inputstr) {
		char[] str=inputstr.toCharArray();
		int[] freq = new int[inputstr.length()];  
		for(int i=0;i<str.length;i++) {
			freq[i]=1;
			for(int j=i+1;j<str.length;j++) {
				if(str[i]==str[j]) {
					freq[i]++;
					str[j]='0';
				}
			}
		      
		}
		
		for(int i=0;i<freq.length;i++) {
			if(str[i] != ' ' && str[i] != '0')  
                System.out.println(str[i] + "->" + freq[i]);  
		}
	}
	public static void main(String[] args) {
		String input = "picture perfect";
		FrequencyOfChar obj=new FrequencyOfChar();
		obj.getFreqOfCharInString(input);
		

	}

}
