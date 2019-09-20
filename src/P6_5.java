import edu.sjsu.macaldo.aaronjay.PrimeGenerator;
import java.util.Scanner;

public class P6_5 {

    public static void main(String[] args) {
        Scanner sUserInput = new Scanner(System.in);            //gets the users input
        System.out.println("Welcome to my program that prints out all prime numbers to your indicated integer.");   //welcome message describing program
        int iUserInt;                                           //Will hold the users input int
        System.out.println("Please enter an integer: ");        //Ask user to input int
        iUserInt = sUserInput.nextInt();                        //Puts users int into the appropriate variable
        PrimeGenerator pgUsersPrimes = new PrimeGenerator(iUserInt);    //Creates a PrimeGenerator object and passes the users int as a parameter
        int iPrimeInt = 0;                                              //Will hold the prime numbers to be printed or hold -1 to stop printing and end loop


        System.out.println("Here are all the prime numbers up to " + iUserInt + ":\n");
        if(iUserInt <= 1)                                               //Outputs that there are no primes when a user inputs a number before the first prime number (2)
            System.out.println("None");                                 //
        else {
            while(true) {                                               //This while loop will loop until it breaks
                iPrimeInt = pgUsersPrimes.nextPrime();                  //Gets the next prime (starting from first) up to the user input number. (.nextPrime() returns -1 when surpassed user input number)
                if(iPrimeInt != -1) {                                   //Check to see if iPrimeInt is a prime number or -1
                    System.out.println(iPrimeInt);                      //If true: Prints the Prime Number
                }
                else                                                    //If false: no more prime numbers to be printed and breaks loop and ends program
                    break;
            }
        }
    }
}
