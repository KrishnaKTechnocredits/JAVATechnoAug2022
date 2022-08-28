package shraddhaRekhate;
class Example5{

    int x=10;
    int y=20;
 
    void processData(){
	x=x+1;
    y=y+1;
    }
 
    void display(){
	 System.out.println(x+":"+y);
    }
 
 public static void main(String[] args){
	 Example5 example5=new Example5();//will crete 1 object in memory 5 will point to it.
	 Example5 example51=new Example5();//2nd object 51 will point
	 
	 example5.processData();//x=10+1, y=y+1 ans: 11 21
	 example5.display();//output 11:21
	 example51.processData();//x=11,y=21
	 example51.display();//output 11:21
 }
}