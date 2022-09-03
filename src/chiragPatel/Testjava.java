package chiragPatel;
public class Testjava {

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
	Testjava example2 = new Testjava();
	example2.plusX();
	example2.plusX();
	example2.plusY();
	example2.plusY();
	example2.displayvalue();
}
}

	