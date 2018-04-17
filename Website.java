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
    private String author;
    
    public Website (String aut, String name, String link, int year)
    {
       author = aut;
       siteName = name;
       url = link;
       yearPublished = year;
    }
    
    public String getSiteName() {return siteName;}
    public String getLink() {return url;}
    public int getYear() {return yearPublished;}
    public String getAuthor ()   { return author; }
    public String toString ()
    {
        String ans = "";
        if (author.length() > 0)
        {  
            ans += author + ", ";
        }
        ans += siteName;
        return ans;
    }
    
}