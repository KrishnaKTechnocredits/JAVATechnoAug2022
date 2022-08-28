package technocredits;
public class Bank{
 int totalAmt = 10000;
 int amt = 0;
 void debit(){
 totalAmt = totalAmt - 1000;
 }
  void credit(){
  totalAmt = totalAmt + 2000;
  }
  public static void main(String[] args){
   Bank bank1 = new Bank();
   Bank bank2 = new Bank();  
   
   bank1.credit();
   bank2.debit();
   bank2.credit();
   bank1.credit();
   
   System.out.println(bank1.totalAmt);
  }
}