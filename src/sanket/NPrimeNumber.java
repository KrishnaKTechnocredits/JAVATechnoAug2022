/*Assignment - 14 : 2nd Sep'2022
Using While loop

Program 1: 
Print first N prime numbers.
N should be passed as parameter in the method.
Hint : 5 pass as parameter, method should print first 5 prime numbers.

sample input : 5
output : 2 3 5 7 11 */
                         
package sanket;

public class NPrimeNumber {

    void findPrimeNumber(int number) {
        int num = 2;
        int count = 0;
        int index;
        System.out.println("First " + number + " prime numbers are: ");

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
                count++;
            }
            num++;
        }
    }

    public static void main(String[] args) {
        NPrimeNumber primeNumber1 = new NPrimeNumber();
        primeNumber1.findPrimeNumber(5);
        System.out.println("\n");
        primeNumber1.findPrimeNumber(10);
    }
}