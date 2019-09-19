package edu.sjsu.macaldo.aaronjay;
import java.util.Scanner;

public class PrimePrinter {

    public static void printPrimes() {
        Scanner sUserInput = new Scanner(System.in);
        int iUserInt = 0;
        System.out.println("Please enter an integer: ");
        iUserInt = sUserInput.nextInt();
        PrimeGenerator pgUsersPrimes = new PrimeGenerator(iUserInt);
        int iPrimeInt = 0;


        System.out.println("Here are all the prime numbers up to " + iUserInt + ":\n");
        if(iUserInt <= 1)
            System.out.println("None");
        else {
            while(true) {
                iPrimeInt = pgUsersPrimes.nextPrime();
                if(iPrimeInt != -1) {
                    System.out.println(iPrimeInt);
                }
                else
                    break;
            }
        }
    }
}
