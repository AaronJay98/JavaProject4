package edu.sjsu.macaldo.aaronjay;


public class PrimeGenerator {
    public PrimeGenerator(int inputInt) {           //constructor that takes userInput and stores it into a private variable
        endInt = inputInt;
    }

    public int nextPrime() {
        do {
            currentInt++;                                       //Each time nextPrime is called it goes to next int first then checks to see if prime
        } while(!isPrime(currentInt) && currentInt <= endInt);  //Loops until a prime is found or reached the endInt (userInput)
        if(currentInt <= endInt)                                //Checks to see if not at end
            return currentInt;                                  //If not at end, then currentInt is a prime and return it to main
        else
            return -1;                                          //If at end, return -1 to signal main that we are at end
    }

    private boolean isPrime(int checkInt) {
        for(int i = 2; i < checkInt; i++) {             //Loops up to all numbers before target number
            if(checkInt % i == 0) {                     //For each number evaluates if it divides checkInt evenly
                return false;                           //If true: it is not prime and returns false
            }
        }
        return true;                                    //If it goes through all numbers and none divides it evenly then it is prime and returns true
    }




    private int currentInt = 1;                         //variable that navigates through each number up to endInt to find a prime
    private int endInt = 0;                             //number passed to this class when constructed indicating up to what number do we display prime numbers
}
