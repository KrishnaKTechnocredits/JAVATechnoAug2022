package snehalJojare;

class ParaEx1{
	
	String stdName;
	int stdRno;

	void setData(String name, int rno){
		this.stdName = name;
		this.stdRno = rno;
	}
	
	void display(){
		System.out.println("student name is " + stdName);
		System.out.println("student roll number is " + stdRno);
	
	}
	
	public static void main (String[] args){
		//String n = "Maulik";
		//int r = 1;
		//n= "Akanksha";
		
		ParaEx1 paraEx1 = new ParaEx1();
		paraEx1.setData("Maulik", 10);
		paraEx1.display();
	}
}