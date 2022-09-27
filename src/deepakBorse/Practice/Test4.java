package deepakBorse.Practice;

public class Test4 {
	int cnt=2;
	
	public static void main(String[] args) {
	for (int i=0;i<4;i++) {
		Test4 test = new Test4();
		test.m1();
	}
	System.out.println(new Test4().cnt);
	}

	void m1() {
		cnt++;
		m2();
		}
		
		void m2(){
			cnt++;
		}
		
	}

