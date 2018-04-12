/** Implements a Book.  This is a parent class that will have
 *  several child classes, so it is fairly bare-bones.
 *  
 *  @author  APCSatHB 2017-2018
 *  @version Spring 2018
 */

public class Book implements Comparable<Book>
{
    private String authorFirst, authorLast;
    private String title;
    private int pubYear;
    private String publisher;
    
    /** Constructor when publishing information is known  */
    public Book (String last, String first, String theTitle, 
                   String thePublisher, int year)
    {
        authorFirst = first;
        authorLast = last;
        title = theTitle;
        publisher = thePublisher;
        pubYear = year;
    }
    
    
    /** Constructor when publishing information is not known  */
    public Book (String last, String first, String theTitle)
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
    
    // -----------------------------------------------------------
    //          Other Methods
    // -----------------------------------------------------------
    public String toString ()
    {
        return title + " by " + authorFirst + " " + authorLast;
    }
    
    public int compareTo (Book other)
    {
        int auth1 = this.authorLast.compareTo(other.authorLast);
        if (auth1 != 0)
        {
            return auth1;
        }
        
        int auth2 = this.authorFirst.compareTo(other.authorFirst);
        if (auth2 != 0)
        {
            return auth2;
        }
        
        return this.title.compareTo(other.title);
    }


    
    
    
    
    
    
    
    
    
    
}