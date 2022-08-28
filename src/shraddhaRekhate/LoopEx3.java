package shraddhaRekhate;
class LoopEx3{
	void processData(int startIndex,int endIndex){
		int sum=0;
		for(int index=startIndex;index<=endIndex;index++){
				sum=sum+index;//program for print sum 
			}
			System.out.println(sum);
		}	
	public static void main(String[] args){
		LoopEx3 loopEx3=new LoopEx3();
		loopEx3.processData(1,5);
	}
}	