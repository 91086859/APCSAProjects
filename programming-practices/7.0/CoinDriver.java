public class CoinDriver 
{
	public static void main(String[] args) 
	{
	    MonetaryCoin[] coins = {new MonetaryCoin(6.6), new MonetaryCoin(3.519), new MonetaryCoin(7.77)};
		
		System.out.println(new MonetaryCoin(10).addCoins(coins).getValue());
	} // end main method
} // end class CoinDriver
