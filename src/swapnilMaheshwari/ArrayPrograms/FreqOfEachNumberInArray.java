package swapnilMaheshwari.ArrayPrograms;

public class FreqOfEachNumberInArray {
	void getFreqOfEachNumber(int[] input) {
		int count = 1;
		for (int i = 0; i < input.length; i++) {
			
			//int temp=0;
			if (input[i]!=0)
			{
				
			for (int j = i + 1; j < input.length; j++) {
				

				if (input[i] == input[j]) {
					count++;
					input[j]=0;
				}
			}
			System.out.println(input[i] + "  Occureanc is :" + count);
			count=1;
			}
			
		}

	}

	public static void main(String[] args) {

		int[] arr = { 10, 11, 11, 10, 15, 22, 11, 22, 22 };
		FreqOfEachNumberInArray freqOfEachNumberInArray = new FreqOfEachNumberInArray();
		freqOfEachNumberInArray.getFreqOfEachNumber(arr);

	}
}
