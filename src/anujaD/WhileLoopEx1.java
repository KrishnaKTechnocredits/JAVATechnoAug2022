package anujaD;

class WhileloopEx1 {
	
	void m1() {
		int index=1;
		while(index<=10) {
			System.out.println(index);
			index++;
			if(index%7==0)
				break;
		}
	}

	public static void main(String[] args) {
		new WhileloopEx1().m1();
		System.out.println(10);
		
	}
}
