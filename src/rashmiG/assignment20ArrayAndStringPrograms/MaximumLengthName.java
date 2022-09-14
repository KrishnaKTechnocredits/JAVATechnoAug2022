/*Assignment - 20 : 10th Sep'2022
7) Write a method to return name having maximum length.
input : {"Ashish","Aditty","Manjiri","Ankita","Credits"}
output : Credits*/

package rashmiG.assignment20ArrayAndStringPrograms;

class MaximumLengthName{
	
	String getMaxLengthName(String[] input){
		String maxName=input[0];
		int maxLength=input[0].length();
		/*for(int index=input.length-1;index>=0;index--){
			if(maxLength<input[index].length()){
				maxLength=input[index].length();
				maxName=input[index];
			}
		}*/
		for(int index=1;index<input.length;index++){
			if(maxLength<=input[index].length()){
				maxLength=input[index].length();
				maxName=input[index];
			}
		}
		
		return maxName;
	}
			
	public static void main(String[] args){
		String[] input= {"Ashish","Aditty","Manjiri","Ankita","Credits"};
		String maxName=new MaximumLengthName().getMaxLengthName(input);
		System.out.println(maxName);
	}
}
		