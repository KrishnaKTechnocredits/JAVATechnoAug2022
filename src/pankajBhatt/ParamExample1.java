package pankajBhatt;

class ParamExample1{

	String name;
	int rollNumber;
	
	void setData(String name, int rollNumber){
		this.name= name;
		this.rollNumber = rollNumber;
	}
	
	void display(){
		System.out.println("Name is : "+name);
		System.out.println("Roll Number is : "+rollNumber);
	}
	
	public static void main(String[] srgs){
		ParamExample1 paramExample1 = new ParamExample1();
		paramExample1.setData("Pankaj Bhatt",5);
		paramExample1.display();
	}
}