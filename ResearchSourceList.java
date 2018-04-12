
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
    private List<ResearchSource> sourceList;

    /**
     * Constructor for objects of class ResearchSourceList
     */
    public ResearchSourceList()
    {
        sourceList = new ArrayList<ResearchSource>();
        fillList();
    }

    /**
     * Fills the ResearchSourceList with a variety of items.
     */
    public void fillList()
    {
        // This will eventually load from a data file.
        // For now, it's a number of test items.
        sourceList.add(new ReferenceBook ("Orwell", "George", "1984", "Harville Secker", 1949));
        sourceList.add(new ReferenceBook ("Lee", "Harper", "To Kill a Mockingbird", "J. B. Lippincott", 1960));
        sourceList.add(new ReferenceBook ("Dahl", "Roald", "Charlie and the Chocolate Factory", "Alfred A. Knopf", 1964));
        sourceList.add(new ReferenceBook ("Dahl", "Roald", "Matilda", "Penguin", 1988));
        sourceList.add(new ReferenceBook ("Hurston", "Zora Neale", "Their Eyes Were Watching God", "J. B. Lippincott", 1937));
    }
    
    /** 
     * Returns the number of items in the List
     */
    public int getNumItems()
    {
        return sourceList.size();
    }
    
    /**
     * Writes the list as a numbered String for printing
     */
    public String toString()
    {
        String ans = "ReseachSourceList.toString not yet implemented \n" +
            "There are " + getNumItems() + " Sources in the list.";
        // You write this part.  Do it with a for-each loop.  Number each ResearchSource
        return ans;
    }
    
    public void sort ()
    {
        for (int pos = 0; pos < sourceList.size(); pos++)
        {
            // Find the smallest item remaining in the list
            int minIndex = pos;
            for (int i = pos; i < sourceList.size(); i++)
            {
                // compare item i to item at minIndex to find the smallest ResearchSource
                if (sourceList.get(i).getCompareField()
                    .compareTo(sourceList.get(minIndex).getCompareField()) < 0)    
                {
                    minIndex = i;
                }
            }
            
            // Move smallest to the front; swap with ResearchSource currently there
            ResearchSource temp = sourceList.get(pos);
            sourceList.set(pos, sourceList.get(minIndex));
            sourceList.set(minIndex, temp);
        }
    }
    
    
    public String getBibliography()
    {
        this.sort();
        String ans = "";
        for (ResearchSource rs : sourceList)
        {
            ans = ans + rs.getBibliographyEntry () + "\n";
        }
        return ans;
    }
    
 
}
