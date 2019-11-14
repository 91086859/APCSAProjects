import java.util.Arrays;
import java.util.Scanner;
public class ScannerArraysLimited
{
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
        int size = 5;
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
        if(size < 5)
        {
            System.out.println("One or more of the numbers you inputted were not between 0 and 50. They have been removed.");
        } // end size less than 5 conditional
        System.out.println("Your numbers are: " + Arrays.toString(finalArr));
    } // end main method
} // end class ScannerArraysLimited
