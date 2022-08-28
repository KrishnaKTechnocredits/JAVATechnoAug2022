package shraddhaRekhate;
class LoopEx2{
	void processData(int startIndex,int endIndex){
		int count=0;
		for(int index=startIndex;index<=endIndex;index++){
			if(index%3==0 && index%7==0){
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args){
		LoopEx2 loopEx2=new LoopEx2();
		loopEx2.processData(1,21);
	}
}	