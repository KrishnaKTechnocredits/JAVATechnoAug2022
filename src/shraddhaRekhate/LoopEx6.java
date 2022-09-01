package shraddhaRekhate;

public class LoopEx6 {
    void processData(int a, int b) {
    	int count=0;
    	for(int index=a;index<=b;index++) {
    	   if(index%3==0 && index%7==0) {
    			   System.out.println(index);
    	   }
    	 }
    }
	public static void main(String[] args) {
		LoopEx6 loopEx6=new LoopEx6();
		loopEx6.processData(20, 100);// TODO Auto-generated method stub

	}

}
