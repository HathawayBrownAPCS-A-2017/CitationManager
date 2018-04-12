
/**
 * Write a description of class journal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class journal implements ResearchSource
{
       private String authorFirst;
       private String authorLast;
       private String Journal;
       private String publisher;
       private int pubYear;
       private String Volume;
       private int totalArticlesPages;
       private String article;
       private int issue;
    public journal (String last, String first, String theTitle, 
                   String thePublisher, int year, String journalVolume,
                   int journalPage, String journalArticle, int journalIssue)
     {
        authorFirst = first;
        authorLast = last;
        Journal = theTitle;
        publisher = thePublisher;
        pubYear = year;
        Volume= journalVolume;
        totalArticlesPages = journalPage;
        article= journalArticle;
        issue = journalIssue;
    }
    
    public String getBibliographyEntry()
    {
     return   authorLast + ", " + authorFirst + ". \"" + article + ".\" " + Journal + 
     ", " + Volume + ", " + issue + ", " + pubYear + ", " + totalArticlesPages + ". ";
    }
    public String getComapareFeild()
    {
        return authorLast + " " + authorFirst + " " + article + " " + Journal + " " + Volume;
    }
    
}