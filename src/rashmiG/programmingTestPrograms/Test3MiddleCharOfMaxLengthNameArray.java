/*Test - 3 : 10th Sep'2022

Program 1 : (20 mins)
Return middle character of max length String from given array.
input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
output : c*/

package rashmiG.programmingTestPrograms;

class Test3MiddleCharOfMaxLengthNameArray{

	char getMiddleChar(String[] input){
		int maxLength=input[0].length();
		String maxName=input[0];
		for(int index=1;index<input.length;index++){
			if(maxLength<input[index].length()){
				maxLength=input[index].length();
				maxName=input[index];
			}
		}
		int length=maxName.length();
		if(length%2==0){
			return maxName.charAt(length/2-1);
		}
		else{
			return maxName.charAt(length/2);
		}
	}
	
	public static void main(String[] args){
		String[] input={"Krishna","Maulik","Aashvi","Technocredits","Harsh"};
		char ch=new Test3MiddleCharOfMaxLengthNameArray().getMiddleChar(input);
		System.out.println("Middle character of maximum length name : "+ch);
	}
}