//3) Find frequency of given character from given String. 
//String str = "HemanshiJPrajapati";
//char targetChar = 'J';
//output : 2

package hemanshi;

public class String3 {
	
	int getFrequency(String input, char targetChar) {
		int count=0;
		input= input.toLowerCase();
		targetChar= Character.toLowerCase(targetChar);

		for(int index=0; index<input.length();index++) {
			char ch= input.charAt(index);
			if(ch==targetChar)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String3 s3=new String3();
		int frequency=s3.getFrequency("HemanshiJPrajapati",'J');
		System.out.println(frequency);
	}
	

}
