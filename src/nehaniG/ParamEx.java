package nehaniG;

class ParamEx{

    String name;
	int rno;
	
	void setData(String name, int rno){
		  this.name = name;
		  this.rno = rno;
		  
	}
      
    void display(){
          System.out.println("Student name is " + name);
		  System.out.println("Student rollnumber is " + rno);
    }
	
	public static void main(String[] args){
		   ParamEx  paramEx= new ParamEx();
		   paramEx.setData("Nehani",1);
		   paramEx.display();
	}
	
}