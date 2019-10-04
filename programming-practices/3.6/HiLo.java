import java.util.Scanner;
import java.util.Random;
public class HiLo {
    public static void guess(int guess, int actual, int guesses)
    {
        if(guess == actual)
        {
            guesses++;
            System.out.println("You guessed correctly in " + guesses + " guesses!");
        }
        else if(guess == -1)
        {
            System.out.println("You have exited! The game is over.");
        }
        else
        {
            guesses++;
            if(guess < actual)
            {
                System.out.println("Your guess was too low! Trying again..");
            }
            else
            {
                System.out.println("Your guess was too high! Trying again..");
            }
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a number between 1 and 100 (-1 to exit): ");
            guess = scan.nextInt();
            guess(guess, actual, guesses);
        }
    }
    public static void main(String args[]) {
        Random r = new Random();
        int rand = r.nextInt(101-1) + 1;
        int guesses = 0;
        
        System.out.println("Welcome to Hi-Lo!");
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter a number between 1 and 100 (-1 to exit): ");
        int num = scan.nextInt();
        guess(num, rand, guesses);
    }
}
