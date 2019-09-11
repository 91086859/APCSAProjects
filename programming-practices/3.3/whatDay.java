import java.util.Scanner;
public class whatDay
{
    public static void main(String[] args)
    {
        int age = 0;
        String day = "";
        boolean valid = false, weekday = false;
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner scan = new Scanner(System.in);
        System.out.print("How old are you? ");
        age = scan.nextInt();
        System.out.print("What day is it? ");
        day = scan.next();
        for(String s : days)
        {
            if(day.equalsIgnoreCase(s))
            {
                valid = true;
            }
        }
        if(valid)
        {
            for(int i = 0; i < 4; i++)
            {
                if(day.equalsIgnoreCase(days[i]))
                {
                    weekday = true;
                }
            }
            if(weekday && age < 18)
            {
                System.out.println("Today is a school day.");
            }
            else if(weekday && age >= 18)
            {
                System.out.println("Today is a work day.");
            }
            else if(!weekday)
            {
                System.out.println("Celebrate!");
            }
        }
    }
}
