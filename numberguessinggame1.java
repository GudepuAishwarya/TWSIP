import java.util.Random;
import java.util.Scanner;

public class numberguessinggame1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;     //define the lower bound of the range
        int upperBound = 100;   //define the upper bound of the range
        int numberToGuess = random.nextInt(upperBound-lowerBound + 1) + lowerBound;
        int numberofTries = 0;
        int userGuess;

        System.out.println("welcome to the number guessing game1!");
        System.out.println("I have selected a random number between" + lowerBound + "and" + upperBound +".Try to guess it.");
         
        do {
            System.out.println("Enter your guess: ");
            userGuess=scanner.nextInt();
            numberofTries++;

            if(userGuess < numberToGuess) {
                System.out.println("Try higher.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Try lower.");
            } else {
                System.out.println("Congratulations! You guessed the number" + numberToGuess +"in" + numberofTries + "tries");
            }
        } while (userGuess != numberToGuess);
        scanner.close();
    }
}
