public class FictionBook extends Book
{
    private String protagonist;
    
    public FictionBook (String first, String last, String theTitle, 
                   String thePublisher, int year, String prot)
    {
        super(first, last, theTitle, thePublisher, year);
        protagonist = prot;
    }
    
    public String getProtagonist ()        { return protagonist; }
    public void setProtagonist (String s)  { protagonist = s; }
}
