import java.time.LocalDate;
import java.util.Scanner;

public class discount {
    public static void main(String args[]) {
        double total = 0;
        String day = LocalDate.now().getDayOfWeek().name();
        Scanner scan = new Scanner(System.in);
        System.out.print("What was the purchase total (eg. 19.53)? ");
        total = scan.nextDouble();
        if(day == "TUESDAY" && total > 20.00)
        {
            System.out.println("Your purchase is eligible for a discount!");
        }
        else if(day == "WEDNESDAY" || total > 40.00)
        {
            System.out.println("Your purchase is eligible for a discount!");
        }
        else if(day == "FRIDAY" && !(total % 2 == 0))
        {
            System.out.println("Your purchase is eligible for a discount!");
        }
        else
        {
            System.out.println("Your purchase is not eligible for a discount.");
        }
    }
}
