/*Assignment - 15 Prime Number Return Type : 
 
Print first N prime numbers.
N should be passed as parameter in the method.
Hint : 5 pass as parameter, method should print first 5 prime numbers.
sample input : 5
output : 2 3 5 7 11
sum of prime numbers
 */

package sanket;

public class NPrimeNumberReturnType {

  int sumOfPrimeNumber(int number) {
    int sum = 0;
    int num = 2;
    int count = 0;
    int index;
    System.out.println("The first " + number + " prime numbers are : ");

    while (count < number) {

      boolean status = true;
      for (index = 2; index <= num / 2; index++) {
        if (num % index == 0) {
          status = false;
          break;
        }
      }

      if (status == true) {
        System.out.println(num);
        sum = sum + num;
        count++;
      }
      num++;
    }
    return sum;
  }

  public static void main(String[] args) {

    NPrimeNumberReturnType nPrimeNumberReturnType = new NPrimeNumberReturnType();
    int summation = nPrimeNumberReturnType.sumOfPrimeNumber(5);
    System.out.println("Sum of prime numbers are: " + summation);
    System.out.println("\n");
    int summation2 = nPrimeNumberReturnType.sumOfPrimeNumber(10);
    System.out.println("Sum of prime numbers are: " + summation2);
  }
}