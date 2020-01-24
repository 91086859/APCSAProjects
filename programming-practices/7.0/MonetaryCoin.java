public class MonetaryCoin extends Coin 
{
	public MonetaryCoin(double val) 
	{
		value = val;
	} // end constructor
	
	public MonetaryCoin addCoins(MonetaryCoin[] coins) 
	{
	    double finalValue = value;
	    for(MonetaryCoin coin : coins)
	    {
	        finalValue += coin.getValue();
	    }
		return new MonetaryCoin(finalValue);
	} // end method add
} // end class MonetaryCoin
