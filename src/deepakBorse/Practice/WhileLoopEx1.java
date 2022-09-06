package deepakBorse.Practice;

public class WhileLoopEx1 {
	
	void processInfo() {
		int index=0;
		while(index<=10) {
			System.out.println(index);
			index++;
			if(index%9==0)
				break;
		}	
	}
	
	public static void main(String[] args) {
		new WhileLoopEx1().processInfo();
	}
}
