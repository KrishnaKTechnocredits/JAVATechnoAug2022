package nikeshM;

class Test1{
	int x= 10;
	int y= 20;

	void processData(){
		int z = x+y;
		x = x+10;
		y = y+10;
	}
	void display(){
		System.out.println("sum is " + x+y ); // sum is 50
		System.out.println(x+y + " is my answer"); // 50 is my answer 
		System.out.println("sum is " + (x+y)); //sum is 50
	}
	public static void main(String[] args){
		Test1 test1 = new Test1();
		test1.processData();
		test1.display();
	}
}
