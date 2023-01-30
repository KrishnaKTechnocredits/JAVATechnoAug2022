
package gauravSahu.practiceJanuray2023;

public class practice32 {
	
	public static void main(String[] args) {
		int [] input = {10,10,13,12,12,10,55,66,55,11};
		
		for(int i = 0 ; i<input.length;i++) {
			boolean flag = true;
			for(int j = i + 1; j<input.length;j++){
				if(input[i] == input[j] && i!=j) {
					flag =  false;
					input[j] = 0;
				}
				
			}if(!flag && input[i]!=0) {
				System.out.println(input[i]);
			}
		}
	}

}
