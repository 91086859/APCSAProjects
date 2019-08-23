import java.util.*;

public class ArithOfTwo {
    public static void main(String args[]) {
        double d1, d2;
        Scanner scan = new Scanner(System.in);
        d1 = scan.nextDouble();
        d2 = scan.nextDouble();
        System.out.print("\nSum: " + (d1+d2) + ". Difference: " + (d2-d1) + ". Product: " + (d1*d2));
    }
}
