package aishwaryaPawar;

class Test1{
	
	void processData(int start,int end){
		int count=0;
		for(int index = start;index<=end;index++){
			if (index%3==0 && index%7==0){
				System.out.println(index);
				count++;
				if(count==3){
					break;
				}
			}
		}
	}
	
	public static void main (String[] arg){
	Test1 test1=new Test1();
	test1.processData(20,300);
    }
}
