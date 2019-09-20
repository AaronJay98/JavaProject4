import edu.sjsu.macaldo.aaronjay.PrimeGenerator;
import java.util.Scanner;

public class P6_5 {

    public static void main(String[] args) {
        Scanner sUserInput = new Scanner(System.in);
        System.out.println("Welcome to my program that prints out all prime numbers to your indicated integer.");
        int iUserInt;
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
