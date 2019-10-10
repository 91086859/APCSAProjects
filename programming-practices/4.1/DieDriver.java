import java.util.Scanner;
public class DieDriver {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many sides do you want on the die? ");
        int sides = scan.nextInt();
        Die die = new Die(sides);
        System.out.println("You rolled a " + die.roll());
    } // end main method
} // end class DieDriver
