import java.util.Arrays;
import java.util.Scanner;
public class countingIntsChart
{
    public static String Asterisks(int count)
    {
        String str = "";
        for(int i = 0; i < count; i++)
        {
            str += "*";
        }
        return str;
    } // end method writeAsterisks
    
    public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers are you putting in?");
        int[] nums = new int[scan.nextInt()];
        System.out.println("Enter a group of numbers, however much you put in (0-50):");
    
        for(int i = 0; i < nums.length; i++) 
        {
            nums[i] = scan.nextInt();
        } // end nums iterator
        System.out.println(); 
        int currentIndex = -1;
        int size = nums.length;
        int[] temp = new int[size];
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] >= 0 && nums[i] <= 50)
            {
                currentIndex++;
                temp[currentIndex] = nums[i];
            } // end between 0 and 50 conditional
            else
            {
                size--;
            } // end NOT between 0 and 50 conditional
        } // end nums iterator #2
        int[] finalArr = new int[size];
        for(int i = 0; i < finalArr.length; i++)
        {
            finalArr[i] = temp[i];
        } // end finalArr iterator
        
        System.out.println("Your numbers are: " + Arrays.toString(finalArr));
        System.out.println();
        System.out.println();
        
        int countZeroThruTen = 0;
        int countElevenThruTwenty = 0;
        int countTwentyOneThruThirty = 0;
        int countThirtyOneThruForty = 0;
        int countFortyOneThruFifty = 0;
        for(int i = 0; i < finalArr.length; i++)
        {
            if(finalArr[i] >= 0 && finalArr[i] <= 10)
            {
                countZeroThruTen++;
            } // end 0-10 conditional
            else if(finalArr[i] >= 11 && finalArr[i] <= 20)
            {
                countElevenThruTwenty++;
            } // end 11-20 conditional
            else if(finalArr[i] >= 21 && finalArr[i] <= 30)
            {
                countTwentyOneThruThirty++;
            } // end 21-30 conditional
            else if(finalArr[i] >= 31 && finalArr[i] <= 40)
            {
                countThirtyOneThruForty++;
            } // end 31-40 conditional
            else if(finalArr[i] >= 41 && finalArr[i] <= 50)
            {
                countFortyOneThruFifty++;
            } // end 41-50 conditional
        } // end finalArr iterator
        
        System.out.println("0-10      |    " + Asterisks(countZeroThruTen));
        System.out.println("11-20     |    " + Asterisks(countElevenThruTwenty));
        System.out.println("21-30     |    " + Asterisks(countTwentyOneThruThirty));
        System.out.println("31-40     |    " + Asterisks(countThirtyOneThruForty));
        System.out.println("41-50     |    " + Asterisks(countFortyOneThruFifty));
    } // end main method
} // end class countingIntsChart
