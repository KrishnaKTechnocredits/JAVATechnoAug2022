package kiran;

class LoopEx1{
	void printName(String name, int n){
		for(int i=1;i<=n;i++)
			System.out.println(name+""+i);
	}
	
	public static void main(String[] args){
		LoopEx1 l1=new LoopEx1();
		l1.printName("kiran",5);
	}
}