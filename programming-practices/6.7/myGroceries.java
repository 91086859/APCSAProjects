import java.util.ArrayList;
public class myGroceries 
{
    public static void main(String args[]) 
    {
      ArrayList<String> groceries = new ArrayList<String>();
      groceries.add("white bread");
      groceries.add("corn bread");
      groceries.add("bread bread");
      System.out.println("Your shopping cart: " + groceries);
      System.out.println("Number of items in your shopping cart: " + groceries.size());
      groceries.remove(1);
      System.out.println("Your shopping cart: " + groceries);
      System.out.println("Number of items in your shopping cart: " + groceries.size());
      System.out.println("The first item in your shopping cart: " + groceries.get(0));
    } // end main method
} // end class myGroceries
