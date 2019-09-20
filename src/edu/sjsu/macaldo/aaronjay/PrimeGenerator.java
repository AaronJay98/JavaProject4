package edu.sjsu.macaldo.aaronjay;


public class PrimeGenerator {
    public PrimeGenerator(int inputInt) {
        endInt = inputInt;
    }

    public int nextPrime() {
        do {
            currentInt++;
        } while(!isPrime(currentInt) && currentInt <= endInt);
        if(currentInt <= endInt)
            return currentInt;
        else
            return -1;
    }

    private boolean isPrime(int checkInt) {
        if(checkInt == 2)
            return true;

        for(int i = 2; i < checkInt; i++) {
            if(checkInt % i == 0) {
                return false;
            }
        }
        return true;
    }




    private int currentInt = 1;
    private int endInt = 0;
}
