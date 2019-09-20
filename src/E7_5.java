import java.util.ArrayList;
import java.util.Scanner;

public class E7_5 {

    public static void main(String[] args) {
        ArrayList<Double> alUserArrayNum = new ArrayList<Double>();
        Scanner sUserInput = new Scanner(System.in);
        double dUserDouble = 0.0;
        double dSum = 0.0;

        System.out.println("Welcome to my program that calculates the alternating sum of all elements in an array. " +
                "Please enter as many numbers as you want into the array and enter -999 when you are done");

        while(true) {                                                       //Just loops until it breaks
            System.out.println("Please enter a number(-999 to stop): ");      //Ask user for input
            dUserDouble = sUserInput.nextDouble();                          //Puts userInput into variable
            if(dUserDouble != -999.0) {                                          //Checks its not negative
                alUserArrayNum.add(dUserDouble);                            //Adds userInput into array if non-negative
            }
            else
                break;                                                      //break if negative
        }

        for(int i = 0; i < alUserArrayNum.size(); i++) {                    //Loops for size of array (number of numbers user inputted)
            if(i % 2 == 0) {                                                //Checks if i is even to alternate between add and subtract
                dSum += alUserArrayNum.get(i);                     //if even: add to sum
            }
            else
                dSum -= alUserArrayNum.get(i);                     //if odd: subtract to sum
        }

        System.out.println("Alternating sum is: " + dSum);                  //Prints out alternating sum
    }
}
