package technocredits.loopexamples;

class LoopEx3{
	
	void m1(int startIndex){
		int count=0;
		for(;startIndex<=50;startIndex++){
			
			if(startIndex%3==0 && startIndex%7==0){
				count++;
			}
		}
	//	sop(startIndex + ":" + endIndex + "=" + count);
	}
	
	void m2(int startIndex, int endIndex){
		for(int index=startIndex;index<=endIndex;index++){
			int count=0;
			if(index%3==0 && index%7==0){
				count++;
			}
		}
	}
		
		
}