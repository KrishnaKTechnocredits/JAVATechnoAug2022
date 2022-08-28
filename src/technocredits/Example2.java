public class Example2{
 int x = 1;
 int y = 2;
  void plusx(){ 
   x = x+1;
   
  }
  void plusy(){
  y = y*2;
  }
  void displayvalue(){
  System.out.println(x+y);
  }
  public static void main(String[] args){
  Example2 example2 = new Example2();
   example2.plusx();
   example2.plusx();
   example2.plusy();
   example2.plusy();
   example2.displayvalue();
  }
}