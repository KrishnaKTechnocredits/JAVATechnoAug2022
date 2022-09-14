package swapnilMaheshwari;
class ParamEx1
{
	int rno; // by default value 0 should be assign
	String name; // By default NULL value should be assign
	
	void setData(int rno , String name)
	{
		this.rno=rno;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(rno  +":" + name);
	}
	
	public static void main ( String[] args)
	{
		
		int r=1;
		String n="Swapnil";
		n="Akanksh";
		ParamEx1 paramEx1=new ParamEx1();
		paramEx1.setData(r , n);
		paramEx1.display();
	}
}