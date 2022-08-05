/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7;

/**
 *
 * @author josep
 */
public class PrimeNumber2 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        final int NUMER_OF_PRIMES_PER_LINE = 10;
        //Notice how clean the main method is!
        getPrimes(NUMBER_OF_PRIMES, NUMER_OF_PRIMES_PER_LINE);

    }
    static void getPrimes(int numPrimes, int numPerLine){
        int count = 0;
        int number = 2;
        while(count < numPrimes){
            if(isPrime(number)){//checks if number is prime. THIS METHOD RETURNS A BOOLEAN!!!! 
                count++;
                printPrime(number, count, numPerLine);//prints the number according to count value. Notice how we don't have to look at all that.
            }
            number++;
        }
       
    }
    static boolean isPrime(int numToCheck){
        for(int i = 2; i <= Math.sqrt(numToCheck);i++){
            if(numToCheck % i == 0){
                return false;
            }
        }
        return true;
    }
    static void printPrime(int number, int count, int numPerLine){
        if(count % numPerLine == 0){
            System.out.printf("%3d\n", number);
        }else{
            System.out.printf("%3d ", number);
        }
    }
}
