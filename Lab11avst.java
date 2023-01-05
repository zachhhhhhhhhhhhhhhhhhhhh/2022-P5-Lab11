// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;


public class Lab11avst
{
    public static void main(String[] args)
    {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        final int MAX = 100;
        boolean primes[];
        primes = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[])
    {
        System.out.println("\nCOMPUTING PRIME NUMBERS");

       //step 1: treat all nubers as prime
       // write a loop that changes ALL nubers to prime (true) in the array
        for(int k = 2; k < primes.length; k++){
            primes[k] = true;
        }
        //step 2: this is where you remove the primes
        // to start just remove the multiples of 2

        //primes 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97

        for(int p = 2; p < 3; p++) {
            for (int k = p * 2; k < primes.length; k += 3) {

                primes[k] = false;
                System.out.print(k + " ");
            }
        }
        }


    public static void displayPrimes(boolean primes[])
    {
        System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
        System.out.println();
        for(int k = 2; k < primes.length; k++){

            if (primes[k] == true) {
            System.out.print(k + " ");
    }

        }


    }

}





