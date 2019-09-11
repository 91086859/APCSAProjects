import java.util.Scanner;
public class MiToKm
{
    public static void main(String[] args)
    {
        double miles, kilometers = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number of miles: ");
        miles = scan.nextDouble();
        kilometers = miles * 1.60935;
        System.out.print("\n" + (int)miles + " miles is equivalent to " + kilometers + " kilometers.");
    }
}
