import java.util.Random;
public class Die {
    private static int numSides;

    public Die(int newSides)
    {
        numSides = newSides;
    }
    public static int roll()
    {
        Random r = new Random();
        int rolled = r.nextInt(numSides-1)+1;
        return rolled;
    } // end method roll
} // end class Die
