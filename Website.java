/**
 * Write a description of class Website here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Website
{
    private String siteName;
    private String url;
    private int yearPublished;
    
    public Website (String name, String link, int year)
    {
       siteName = name;
       url = link;
       yearPublished = year;
    }
    
    public String getSiteName() {return siteName;}
    public String getLink() {return url;}
    public int getYear() {return yearPublished;}
    
}
