public class Grade
{
    private int cutoff;
    private String name;
    
    public Grade(String name, int cutoff)
    {
        this.name = name;
        this.cutoff = cutoff;
    } // end Grade constructor
    
    public int getCutoff()
    {
        return cutoff;
    } // end method getCutoff
    
    public String getGradeName()
    {
        return name;
    } // end method getGradeName
    
} // end class Grade
