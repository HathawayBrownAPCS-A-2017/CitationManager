
/**
 * Represents an article in an academic journal
 * 
 * Note that JournalArticle does not extend a different class;
 * pretty much all Journals would be designed as a Research Source.
 *
 * @author APCS-A @ HB  (thanks, August)
 * @version 2018-04
 */

public class JournalArticle implements ResearchSource
{
       private String authorFirst;
       private String authorLast;
       private String journal;
       private String publisher;
       private int pubYear;
       private String volume;
       private int totalArticlesPages;
       private String article;
       private int issue;
       
    public JournalArticle (String last, String first, String theTitle, 
                   String thePublisher, int year, String journalVolume,
                   int journalPage, String journalArticle, int journalIssue)
     {
        authorFirst = first;
        authorLast = last;
        journal = theTitle;
        publisher = thePublisher;
        pubYear = year;
        volume= journalVolume;
        totalArticlesPages = journalPage;
        article= journalArticle;
        issue = journalIssue;
    }
    
    public String getBibliographyEntry()
    {
     return   authorLast + ", " + authorFirst + ". \"" + article + ".\" " + journal + 
     ", " + volume + ", " + issue + ", " + pubYear + ", " + totalArticlesPages + ". ";
    }
    
    public String getCompareField()
    {
        return authorLast + " " + authorFirst + " " + article + " " + journal + " " + volume;
    }
    
    public String toString ()
    {
        return authorLast + ", " + authorFirst + ". " + article;
    }
}