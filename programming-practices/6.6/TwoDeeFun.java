import java.util.Arrays;
public class TwoDeeFun
{
    public static void main(String args[]) 
    {
      int[][] arr1 = new int[5][5];
      int[][] arr2 = new int[5][5];
      int[][] arr3 = new int[5][5];
      int[] countdown = {5, 4, 3, 2, 1};
      for(int i = 0; i < 5; i++)
      {
          for(int j = 0; j < 5; j++)
          {
              arr1[i][j] = j;
          }
      }
      for(int i = 0; i < 5; i++)
      {
          for(int j = 0; j < 5; j++)
          {
              arr2[i][j] = i;
          }
      }
      // ARR3 WIP
      // int[][] arr3 = {{5,4,3,2,1},{10,9,8,7,6},{15,14,13,12,11},{20,19,18,17,16},{25,24,23,22,21}};
      System.out.println(Arrays.deepToString(arr1));
      System.out.println(Arrays.deepToString(arr2));
      // System.out.println(Arrays.deepToString(arr3));
    } // end main method
} // end class TwoDeeFun
