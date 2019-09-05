import java.util.Calendar;
import java.util.Locale;

public class nameStringFun
{
    public static void main(String[] args)
    {
        String first = "Kadin";
        String last = "Hickey";
        String full = first.concat(" ").concat(last);
        
        System.out.println("Full name: " + full);
        System.out.println("Length of first name: " + first.length());
        System.out.println("Length of last name: " + last.length());
        System.out.println("Full name in all caps: " + full.toUpperCase());
    }
}
