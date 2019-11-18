import java.util.Arrays;
public class TwoDeeFun
{
    public static void main(String args[]) 
    {
      int[][] arr1 = {{0,1,2,3,4},{0,1,2,3,4},{0,1,2,3,4},{0,1,2,3,4},{0,1,2,3,4}};
      int[][] arr2 = {{0,0,0,0,0},{1,1,1,1,1},{2,2,2,2,2},{3,3,3,3,3},{4,4,4,4,4}};
      int[][] arr3 = {{5,4,3,2,1},{10,9,8,7,6},{15,14,13,12,11},{20,19,18,17,16},{25,24,23,22,21}};
      System.out.println(Arrays.deepToString(arr1));
      System.out.println(Arrays.deepToString(arr2));
      System.out.println(Arrays.deepToString(arr3));
    } // end main method
} // end class 2DArrays
