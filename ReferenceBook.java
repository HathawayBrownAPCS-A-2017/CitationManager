
/**
 * Write a description of class ReferenceBook here.
 *
 * @author APCS @ HB 
 * @version 2018-04
 */
public class ReferenceBook extends Book implements ResearchSource
{
    /** Constructor when publishing information is known  */
    public ReferenceBook (String last, String first, String theTitle, 
                   String thePublisher, int year)
    {
        super (last, first, theTitle, thePublisher, year);
    }

    public String getBibliographyEntry ()
    {
        return getAuthorLast() + ", " +
               getAuthorFirst() + ". " +
               getTitle() + ". " +
               getPublisher() + ", " +
               getYear() + ".";
    }
    
    public String getCompareField ()
    {
        return getAuthorLast() + " " + getAuthorFirst() + " " + getTitle();
    }
}
