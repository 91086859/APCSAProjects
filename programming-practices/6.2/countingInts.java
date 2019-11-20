import java.util.Arrays;
import java.util.Scanner;
public class countingInts
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
        if(size < 5)
        {
            System.out.println("One or more of the numbers you inputted were not between 0 and 50. They have been removed.");
        } // end size less than 5 conditional
        System.out.println("Your numbers are: " + Arrays.toString(finalArr));
        System.out.println();
        System.out.println();
        for(int i = 0; i < finalArr.length; i++)
        {
            for(int j = 0; j < finalArr.length-1; j++)
            {
                if(finalArr[j]>finalArr[j+1])
                {
                    int tempNum = finalArr[j];
                    finalArr[j] = finalArr[j+1];
                    finalArr[j+1] = tempNum;
                } // end conditional
            } // end nested finalArr iterator
        } // end finalArr iterator
        int count = 0;
        for(int i = 0; i < finalArr.length; i++)
        {
            for(int j = 0; j < finalArr.length; j++)
            {
                if(finalArr[i] == finalArr[j])
                {
                    count++;
                } // end equals conditional
            } // end nested finalArr iterator
            System.out.println("A value, " + finalArr[i] + ", occurred in your list " + count + " times.");
            if(count != 0)
            {
                i = i+count-1;
            } // end count non-zero conditional
            count = 0;
        } // end finalArr iterator
    } // end main method
} // end class countingInts
