public class GradeDriver 
{
    public static void main(String args[]) 
    {
      Grade[] grades = 
      { 
          new Grade("A", 95), new Grade("A-", 90), new Grade("B+", 87), new Grade("B", 83), new Grade("B-", 80),
          new Grade("C+", 77), new Grade("C", 73), new Grade("C-", 70), new Grade("D+", 67), new Grade("D", 63),
          new Grade("D-", 60), new Grade("F", 0)
      };
      for(int level = 0; level < grades.length; level++)
      {
          System.out.println(grades[level].getGradeName() + "\t" + grades[level].getCutoff());
      }
    } // end main method
} // end class GradeDriver
