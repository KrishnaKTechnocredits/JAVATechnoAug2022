package shrutiArora;
public class ProgrammingTest_1 {
	void processData(int startIndex,int endIndex){
		int count=0;
		for(int index = startIndex;index<=endIndex;index++){
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
	       ProgrammingTest_1 programmingTest_1=new ProgrammingTest_1();
	       System.out.println("**************************************ProgrammingTest_1**********************************");
	       programmingTest_1.processData(20 ,100);
	}
}
