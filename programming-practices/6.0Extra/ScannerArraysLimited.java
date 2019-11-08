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
        }
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
            }
            else
            {
                size--;
            }
        }
        int[] finalArr = new int[size];
        for(int i = 0; i < finalArr.length; i++)
        {
            finalArr[i] = temp[i];
        }
        if(size < 5)
        {
            System.out.println("One or more of the numbers you inputted were not between 0 and 50. They have been removed.");
        }
        System.out.println("Your numbers are: " + Arrays.toString(finalArr));
    } // end main method
} // end class ScannerArraysLimited
