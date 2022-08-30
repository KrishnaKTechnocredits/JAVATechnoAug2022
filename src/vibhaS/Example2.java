package vibhaS;
class Example2{
	void add(int x,int y){
		System.out.println("Addition ans is => "+(x+y));
	}
	
	void sub(int x,int y){
		System.out.println("subtraction ans is => "+(x-y));
	}
	
	void mul(int x,int y){
		System.out.println("multiplication is => "+(x*y));
	}
	
	void div(int x,int y){
		System.out.println("Division is => "+(x/y));
	}
	
	public static void main(String[] args){
		Example2 example2=new Example2();
		example2.add(10,20);
		example2.sub(20,5);
		example2.mul(13,4);
		example2.div(20,2);
	}
}