import java.lang.Math;
public class RandomBetween
{
    public static int betterRandom(int start, int end)
    {
        int x = end+1;
        double y = Math.random();
        int z = (int)(x * y);
        if(z < start)
        {
            z += start;
        }
        return z;
    }
    public static void main(String args[])
    {
        int rand = betterRandom(57, 2147483646);
        System.out.println("Random number between 57 and 214783646: " + rand);
    }
}
