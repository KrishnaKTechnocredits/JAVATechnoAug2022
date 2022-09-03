package pujaSah.basicJavaConcepts;

class CountNumbers{
	
	void processData(){
		System.out.println("Numbers divisible by 9 starting from 1 to 100 in reverse order are: ");
		for(int index=100;index>=1;index--){
			if(index%9==0){
				System.out.println(index);
			}
		}
	}
	
	public static void main(String[] args){
		CountNumbers countNumbers=new CountNumbers();
		countNumbers.processData();
	}
}
	
		
				
	