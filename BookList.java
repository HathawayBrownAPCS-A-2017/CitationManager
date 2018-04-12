
/**
 * Implements a list of Books as an Array
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BookList
{
    private Book[] books;

    /**
     * Constructor for objects of class BookList
     */
    public BookList()
    {
        books = new Book[5];
        books[0] = new Book ("Orwell", "George", "1984", "Harville Secker", 1949);
        books[1] = new Book ("Lee", "Harper", "To Kill a Mockingbird", "J. B. Lippincott", 1960);
        books[2] = new Book ("Dahl", "Roald", "Charlie and the Chocolate Factory", "Alfred A. Knopf", 1964);
        books[3] = new Book ("Dahl", "Roald", "Matilda", "Penguin", 1988);
        books[4] = new Book ("Hurston", "Zora Neale", "Their Eyes Were Watching God", "J. B. Lippincott", 1937);

    }

    public void sort ()
    {
        for (int pos = 0; pos < books.length; pos++)
        {
            // Find the smallest item remaining in the list
            int minIndex = pos;
            for (int i = pos; i < books.length; i++)
            {
                if (books[i].compareTo(books[minIndex]) < 0)    // if books[i] comes before books[minIndex]
                {
                    minIndex = i;
                }
            }
            
            // Move smallest to the front; swap with Book currently there
            Book temp = books[pos];
            books[pos] = books[minIndex];
            books[minIndex] = temp;
        }
    }
    

    public String toString()
    {
        String ans = books[0].toString();
        for (int i = 1; i < books.length; i++)
        {
            ans += "\n" + books[i].toString();
        }
        return ans;
    }

    public String getBibliography()
    {
        this.sort();
        String ans = "";
        for (Book b : books)
        {
            // ans = ans + b.getBibliographyEntry () + "\n";
            ans = ans + b.toString () + "\n";
        }
        return ans;
    }
    
    
    
    
}
