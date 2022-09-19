package harshadaJagtap.return_type;

public class Example1 {

		int cnt=2;
		
	void m1() {
		cnt++;
		cnt++;
	}
	
	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			Example1 example1=new Example1();
			example1.m1();
	}
		System.out.println(new Example1().cnt);
}
}
