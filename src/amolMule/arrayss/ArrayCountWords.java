package amolMule.arrayss;

// Print repeated words from array//
/* Input- Amol Ajit Amit Amol Ajit Ajit Amol
Output- Amol Ajit Amit */
public class ArrayCountWords {

	void getRepeatedWord(String str) {

		String[] str1 = str.split(" ");
		// String[] str2 = new String[str1.length];
		for (int i = 0; i < str1.length; i++) {
			int count =0;
			for (int j = i + 1; j < str1.length; j++) {
				if (str1[i].equals(str1[j])) {
					 count=count+1;
					str1[j] = " ";
					
				}
			}
			if(count !=0) {
			System.out.println(str1[i]);

			}
		}
	}

		void getUniqueWord(String str) {
			String[] str1=str.split(" ");
			for(int i=0;i<str1.length;i++) {
				int count =0;
				for(int j=i+1;j<str1.length;j++) {
					
					if(str1[i].equals(str1[j])){
						count= count+1;
						str1[j]=" ";
					}
				}
				
				if(count==0) {
					System.out.println(str1[i]);
					
				}
				
			}
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * void getUniqueword(String str) { String[] str1 = str.split(" "); // String[]
	 * str2 = new String[str1.length]; // Amol Ajit Amit Amol Ajit for (int i = 0; i
	 * < str1.length; i++) { int count = 0; for (int j = i + 1; j < str1.length;
	 * j++) {
	 * 
	 * if (str1[i].equals(str1[j])) { count = count + 1; }
	 * 
	 * } if (count == 0) System.out.println(str1[i]);
	 * 
	 * //System.out.println("");
	 * 
	 * }
	 * 
	 * }
	 */

	public static void main(String[] args) {
		ArrayCountWords ar = new ArrayCountWords();
		String names = "Amol Ajit Amit Amol Atul Ajit Ajit Amol";
		//ar.getRepeatedWord(names);
		ar.getUniqueWord(names);
	}
}