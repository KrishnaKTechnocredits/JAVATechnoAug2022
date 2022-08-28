package technocredits;

class Example6{
	int rno=10;//1
	String name="Deepak";//
	
	void setData(int rno, String name){
		this.name = name;
		this.rno = rno;
	}
	
	void display(){
		System.out.println(rno + ":" + name);
	}
	
	public static void main(String[] args){
		Example6 example6 = new Example6();
		example6.display();
		example6.setData(1,"titiksha");
		System.out.println(example6.rno + ":" + example6.name);
	}	
}