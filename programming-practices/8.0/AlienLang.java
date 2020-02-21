import java.util.Random;
public class AlienLang
{
	public static void main(String[] args) 
	{
		System.out.println(blurb());
	}
	
	private static String blurb() 
	{
		return whoozit() + genWhatzits();
	}
	
	private static String genWhatzits() 
	{
		String toReturn = whatzit();
		if(new Random().nextInt(5) >= 3) 
		{
			toReturn += genWhatzits();
		}
		return toReturn;
	}
	
	private static String whatzit() 
	{
		String toReturn = "q";
		if(new Random().nextInt(5) >= 3) 
		{
			toReturn += "z";
		}
		else 
		{
			toReturn += "d";
		}
		toReturn += whoozit();
		return toReturn;
	}
	
	private static String whoozit() 
	{
		return "x" + genYs();
	}
	
	private static String genYs() 
	{
		String toReturn = "";
		if(new Random().nextInt(5) >= 3) 
		{
			toReturn = "y";
			toReturn += genYs();
		}
		return toReturn;
	}
}
