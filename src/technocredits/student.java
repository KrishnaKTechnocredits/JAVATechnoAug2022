package technocredits;
class Student
{
   String name = "Maulik";
   int rno = 1;
   
   void display(){
  
    System.out.println(name);
    System.out.println(rno);
   }
   void update(){
	   name = "sonali";
	   rno = 10;
   }
   public static void main(String []args){
	   Student S1 = new Student();
	   S1.display();
	   S1.update();
	   S1.display();
   }
   }
   
   