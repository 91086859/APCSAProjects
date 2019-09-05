import java.util.Calendar;
import java.util.Locale;

public class hakunaMatata
{
    public static void main(String[] args)
    {
        String yeet = "Hakuna matata! It means no worries for the rest of your days!";
        
        String noWorries = yeet.substring(24, 34);
        String yeetFour = yeet.replace("a", "4");
        
        System.out.println(noWorries);
        System.out.println(yeetFour);
    }
}
