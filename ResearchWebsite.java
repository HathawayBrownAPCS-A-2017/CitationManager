
/**
 * Write a description of class ResearchWebSite here.
 *
 * @author APCS-A @ HB
 * @version 2018-04
 */
public class ResearchWebsite extends Website implements ResearchSource
{
    private String dateAccessed;
    
    public ResearchWebsite (String author, String name, String link, 
            int year, String date)
    {
       super (author, name, link, year);
       dateAccessed = date;
    }
    
    public String getAccessDate ()          { return dateAccessed;  }
    public void setAccessDate (String s)    { dateAccessed = s; }
    
    public String getBibliographyEntry ()
    {
        String ans = "";
        if (getAuthor().length() > 0)
        {
            ans += getAuthor() + ", ";
        }
        ans += getSiteName() + ", " +
               getLink() + " , " +
               getYear() + ".  Accessed " + getAccessDate();
        return ans;
    }
    
    public String getCompareField ()
    {
        String ans = "";
        if (getAuthor().length() > 0)
        {
            ans += getAuthor() + ", ";
        }
        ans += getSiteName();
        
        return ans;
    }
}
