
/**
 * A ResearchSourceList is (duh) a list of ResearchSources.
 * ResearchSources might be Books, WebSites, or Articles
 *
 * @author APCS @ HB
 * @version Spring 2018
 */

import java.util.List;
import java.util.ArrayList;

public class ResearchSourceList
{
    // for starters, it's a list of Books.
    // As we develop it, it will be a list of ResearchSources
    private List<Book> sourceList;

    /**
     * Constructor for objects of class ResearchSourceList
     */
    public ResearchSourceList()
    {
        // for starters, it's a list of Books.
        // As we develop it, it will be a list of ResearchSources
        sourceList = new ArrayList<Book>();
        fillList();
    }

    /**
     * Fills the ResearchSourceList with a variety of items.
     */
    public void fillList()
    {
        // This will eventually load from a data file.
        // For now, it's a number of test items.
        sourceList.add(new Book ("Orwell", "George", "1984", "Harville Secker", 1949));
        sourceList.add(new Book ("Lee", "Harper", "To Kill a Mockingbird", "J. B. Lippincott", 1960));
        sourceList.add(new Book ("Dahl", "Roald", "Charlie and the Chocolate Factory", "Alfred A. Knopf", 1964));
        sourceList.add(new Book ("Dahl", "Roald", "Matilda", "Penguin", 1988));
        sourceList.add(new Book ("Hurston", "Zora Neale", "Their Eyes Were Watching God", "J. B. Lippincott", 1937));
    }
    
    /** 
     * Returns the number of items in the List
     */
    public int getNumItems()
    {
        return sourceList.size();
    }
    
    /**
     * Converts the list to a String for printing
     */
    public String toString()
    {
        String ans = "ReseachSourceList.toString not yet implemented \n" +
            "There are " + getNumItems() + " Sources in the list.";
        // You write this part.  Do it with a for-each loop.
        return ans;
    }
}
