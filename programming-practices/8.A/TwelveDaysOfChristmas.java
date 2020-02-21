public class TwelveDaysOfChristmas 
{
	public static void main(String[] args) 
	{
		System.out.println(onTheNthDay(1));
	}
	
	private static String onTheNthDay(int day)
	{
		String toReturn = "";
		switch(day) {
			case 12:
				toReturn = "On the twelfth day of Christmas my true love sent to me,\n";
				break;
			case 11:
				toReturn += "On the eleventh day of Christmas my true love sent to me,\n";
				break;
			case 10:
				toReturn += "On the tenth day of Christmas my true love sent to me,\n";
				break;
			case 9:
				toReturn += "On the nineth day of Christmas my true love sent to me,\n";
				break;
			case 8:
				toReturn += "On the eighth day of Christmas my true love sent to me,\n";
				break;
			case 7:
				toReturn += "On the seventh day of Christmas my true love sent to me,\n";
				break;
			case 6:
				toReturn += "On the sixth day of Christmas my true love sent to me,\n";
				break;
			case 5:
				toReturn += "On the fifth day of Christmas my true love sent to me,\n";
				break;
			case 4:
				toReturn += "On the fourth day of Christmas my true love sent to me,\n";
				break;
			case 3:
				toReturn += "On the third day of Christmas my true love sent to me,\n";
				break;
			case 2:
				toReturn += "On the second day of Christmas my true love sent to me,\n";
				break;
			case 1:
				toReturn += "On the first day of Christmas my true love sent to me,\n";
				break;
		}
		switch(day) {
			case 12:
				toReturn += "Twelve drummers drumming,\n";
			case 11:
				toReturn += "Eleven pipers piping,\n";
			case 10:
				toReturn += "Ten lords a-leaping,\n";
			case 9:
				toReturn += "Nine ladies dancing,\n";
			case 8:
				toReturn += "Eight maids a-milking,\n";
			case 7:
				toReturn += "Seven swans a-swimming,\n";
			case 6:
				toReturn += "Six geese a-laying,\n";
			case 5:
				toReturn += "Five golden rings,\n";
			case 4:
				toReturn += "Four calling birds,\n";
			case 3:
				toReturn += "Three French hens,\n";
			case 2:
				toReturn += "Two turtle doves,\n";
			case 1:
				toReturn += "A partridge in a pear tree.\n";
		}
		if(day<12) {
			toReturn += "\n" + onTheNthDay(day+1);
		}
		return toReturn;
	}
}
