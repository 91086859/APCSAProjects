import java.util.Arrays;
import java.util.Scanner;
public class ScannerArrays 
{
    public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers are you putting in?");
        int[] nums = new int[scan.nextInt()];
        System.out.println("Enter a group of numbers, however much you put in:");
    
        for(int i = 0; i < nums.length; i++) 
        {
            nums[i] = scan.nextInt();
        } // end nums iterator
        System.out.println();  
        System.out.println("Your numbers are: " + Arrays.toString(nums));
    } // end main method
} // end class ScannerArrays
