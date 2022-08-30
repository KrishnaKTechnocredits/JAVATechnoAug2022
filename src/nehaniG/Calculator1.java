package nehaniG;

class Calculator1{

    void add(int x, int y){
	  int ans = x+y;
      System.out.println("addition is " + ans);
    }

    void subtract(int x, int y){
	  int ans = x-y;
      System.out.println("substract is " + ans);
    }
	
	void multiplication(int x, int y){
	  int ans = x*y;
      System.out.println("multiplication is " + ans);
    }

    void division(int x, int y){
	  int ans = x/y;
      System.out.println("division is " + ans);
    }

    public static void main(String[] args){
        Calculator1 cal = new Calculator1();
        cal.add(100,40);
		cal.subtract(60,20);
		cal.multiplication(30,12);
        cal.division(80,20);
    }
}	