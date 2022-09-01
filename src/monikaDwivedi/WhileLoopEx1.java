package monikaDwivedi;

public class WhileLoopEx1 {
	
	void m1() {
		int index=1;
		while(index<=10) {
			System.out.println(index);
			index++;			
			if(index%7==0){
				System.out.println(index);
				break;
			}
		}
	}
	public static void main(String[] args) {
		new WhileLoopEx1().m1();
		System.out.println("end");
	}
}
