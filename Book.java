/** Implements a Book.  This is a parent class that will have
 *  several child classes, so it is fairly bare-bones.
 *  
 *  @author  APCSatHB 2017-2018
 *  @version Spring 2018
 */

public class Book
{
    private String authorFirst, authorLast;
    private String title;
    private int pubYear;
    private String publisher;
    
    /** Constructor when publishing information is known  */
    public Book (String first, String last, String theTitle, 
                   String thePublisher, int year)
    {
        authorFirst = first;
        authorLast = last;
        title = theTitle;
        publisher = thePublisher;
        pubYear = year;
    }
    
    
    /** Constructor when publishing information is not known  */
    public Book (String first, String last, String theTitle)
    {
        authorFirst = first;
        authorLast = last;
        title = theTitle;
    }
    
    // -----------------------------------------------------------
    //          Accessor Methods
    // -----------------------------------------------------------
    public String getAuthor ()     { return authorLast + ", " + authorFirst; }
    public String getAuthorLast()  { return authorLast; }
    public String getAuthorFirst() { return authorFirst; }
    public String getTitle()       { return title; }
    public String getPublisher()   { return publisher; }
    public int getYear()           { return pubYear; }



}