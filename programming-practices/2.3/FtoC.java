public class FtoC
{
    //-----------------------------------------------------------------
    //  Computes the Celsius equivalent of a specific Fahrenheit
    //  value using the formula C = (F - 32) * 5/9
    //-----------------------------------------------------------------
    
    public static void main(String[] args)
    {
        final int BASE = 32;
        final double CONVERSION_FACTOR = 9.0 / 5.0;
        
        int fahrenheitTemp = 24; // value to convert
        double celsiusTemp;
        
        celsiusTemp = (fahrenheitTemp - 32) * CONVERSION_FACTOR;
        
        System.out.println("Fahrenheit Equivalent: " + fahrenheitTemp);
        System.out.println("Celsius Temperature: " + celsiusTemp);
    }
}
