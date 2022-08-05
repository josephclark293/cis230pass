/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10;

/**
 *
 * @author josep
 */
public class Exericse07_06 {

    public static void main(String[] args) {
        final int NUM_PRIMES = 50;
        final int NUM_PER_LINE = 10;
        int[] rgPrimes = new int[NUM_PRIMES];
        rgPrimes[0] = 2; //first prime.
        System.out.print(2 + " ");//IF you are printing as you go then print 2 now. If you print the whole array later no need. 
        getPrimes(NUM_PRIMES, NUM_PER_LINE);

    }

    public static void getPrimes(final int numPrimes,final int NUM_PER_LINE) {
        int[] rgPrimes = new int[numPrimes];
        rgPrimes[0] = 2; //first prime.
        int count = 1; // we found two
        int numToCheck = 3;
        while (count < numPrimes){
            if(isPrime(rgPrimes, numToCheck)){
                rgPrimes[count]= numToCheck;
                count++;
                printPrime(count, NUM_PER_LINE, numToCheck);
            }
            numToCheck++;
        }
    }
    public static boolean isPrime(int [] primes, int numToCheck){
        for(int i = 0; i <= Math.sqrt(numToCheck);i++){
            if(numToCheck % primes[i] == 0){
                return false;
            }
            if(primes[i] == 0 || primes[i] > Math.sqrt(numToCheck)){
                return true;
            }
        }
        return true;
    }
    public static void printPrime(int count, int NUM_PER_LINE,int prime){
        if(count % NUM_PER_LINE == 0){
            System.out.println(prime);
        }else{
            System.out.print(prime + " ");
        }
    }
}
