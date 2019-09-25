import java.time.LocalDate;
import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]) {
        int year = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("What year is it? ");
        year = scan.nextInt();
        if(year < 1582)
        {
            System.out.println("Boi it is not " + year + ".");
        }
        
        if(year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                {
                    System.out.println("It is a leap year!");
                }
                else
                {
                    System.out.println("It is not a leap year.");
                }
            }
            else
            {
                System.out.println("It is a leap year!");
            }
        }
        else
        {
            System.out.println("It is not a leap year.");
        }
    }
}
