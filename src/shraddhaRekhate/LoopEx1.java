package shraddhaRekhate;
class LoopEx1{
	void printName(String name, int n){
		for(int index=1;index<=n;index++){
			System.out.println("Techno" + " " + index);
		}
	}
	
	public static void main(String[] args){
		LoopEx1 loopEx1=new LoopEx1();
		loopEx1.printName("Techno", 10);
	}
}	