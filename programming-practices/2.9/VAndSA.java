import java.time.LocalDate;
import java.util.Scanner;

public class VAndSA {
    public static void main(String args[]) {
        double radius = 0, SA = 0, vol = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius of a sphere: ");
        radius = scan.nextInt();
        SA = Math.pow(radius, 2) * (4 * Math.PI);
        vol = Math.pow(radius, 3) * (4.0/3.0)*(Math.PI);
        System.out.printf("The surface area is: %.4f%n", SA);
        System.out.printf("The volume is: %.4f%n", vol);
    }
}
