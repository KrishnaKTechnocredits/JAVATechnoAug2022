package harshalRane;

class PrintNum{
	
	void processData(int startRange, int endRange)
	{
		int count=0;
		for(int num=startRange;num<=endRange;num++)
		{
			if(num%3==0 && num%7==0){
				System.out.println(num);
				count++;
			}
			if(count==3){
			break;
			}
		}
	}
	
	public static void main(String[] args){
		PrintNum printNum = new PrintNum();
		printNum.processData(20,100);
	}
}