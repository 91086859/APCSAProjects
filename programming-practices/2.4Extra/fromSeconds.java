import java.util.*;
public class fromSeconds {
    public static void main(String args[]) {
        int d1, hours, minutes, seconds;
        System.out.print("Type in a number of seconds:");
        Scanner scan = new Scanner(System.in);
        d1 = scan.nextInt();
        if(d1 >= 3600)
        {
            hours = d1/3600;
            int remainderHr = d1 % 3600;
            if(remainderHr != 0)
            {
                int remainderMin = remainderHr % 60;
                minutes = remainderHr / 60;
                if(remainderMin != 0)
                {
                    System.out.println(hours + " hours " + minutes + " minutes " + remainderMin + " seconds");
                }
                else
                {
                    System.out.println(hours + " hours " + minutes + " minutes");
                }
            }
            else
            {
                if(hours == 1)
                {
                    System.out.println(hours + " hour");
                }
                else
                {
                    System.out.println(hours + " hours");
                }
            }
        }
    }
}
