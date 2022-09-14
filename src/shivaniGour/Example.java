package shivaniGour;
public class Example{
     int roll = 1;
	 String name = "techno";
	 
	 void update(){
	 int roll = 2;
	 name= "maulik";
	 //System.out.println(roll+":"+name);
	 }
	 
	 void display(){
	 System.out.println(roll+":"+name);

	 }
	 public static void main (String[] args){
	 Example exmpl1 = new Example();
	 exmpl1.update();
	 exmpl1.display();
	 }
}