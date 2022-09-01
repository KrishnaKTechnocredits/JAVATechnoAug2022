package chiragPatel;
public class Example2 {

int x = 1;
int y = 2;

void plusX(){
x= x+1;
}

void plusY(){
y= y*2;
}

void displayvalue(){
	System.out.println(x+y);
}

public static void main(String[] args){
	Example2 example2 = new Example2();
	example2.plusX();
	example2.plusX();
	example2.plusY();
	example2.plusY();
	example2.displayvalue();
}
}

	