public class AvgOfThree {
    public static double avg(int nums[])
    {
        int total = 0;
        for(int i : nums)
        {
            total += i;
        }
        double average = total / nums.length;
        return average;
    }
    public static void main(String args[]) {
        int nums[] = {1, 2, 3};
        System.out.println("The average of the provided integers is: " + avg(nums));
    }
}
