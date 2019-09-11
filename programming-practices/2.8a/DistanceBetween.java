import java.util.Scanner;
public class DistanceBetween
{
    public static void main(String[] args)
    {
        double x1, y1, x2, y2, distance, pow1, pow2 = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an x coordinate for the first point: ");
        x1 = scan.nextDouble();
        System.out.print("Enter a y coordinate for the first point: ");
        y1 = scan.nextDouble();
        System.out.print("Enter an x coordinate for the second point: ");
        x2 = scan.nextDouble();
        System.out.print("Enter a y coordinate for the second point: ");
        y2 = scan.nextDouble();
        pow1 = Math.pow(x2 - x1, 2);
        pow2 = Math.pow(y2 - y1, 2);
        distance = Math.sqrt(pow1 + pow2);
        System.out.print("\nThe distance between these two points is " + distance);
    }
}
