import java.util.*;
public class AvgOfThree {
    public static double avg(int nums[])
    {
        double total = 0;
        for(int i : nums)
        {
            total += i;
        }
        return total / nums.length;
    }
    public static void main(String args[]) {
        int d1, d2, d3;
        Scanner scan = new Scanner(System.in);
        d1 = scan.nextInt();
        d2 = scan.nextInt();
        d3 = scan.nextInt();
        int nums[] = {d1, d2, d3};
        System.out.println("The average of the provided integers is: " + avg(nums));
    }
}
