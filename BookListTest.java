
/**
 * Tests the BookList
 *
 * @author APCS @ HB
 * @version Spring 2018
 */
public class BookListTest
{
 
    public static void main (String[] args)
    {
        BookList myBooks = new BookList();
        System.out.println (myBooks);
        
        myBooks.sort();
        
        System.out.println ();  // blank line
        System.out.println (myBooks);
        
        
/*        Book book1 = new Book ("Dahl", "Roald", "Matilda", "Penguin", 1988);
        Book book2 = new Book ("Lee", "Harper", "To Kill a Mockingbird", "J. B. Lippincott", 1960);
        Book book3 = new Book ("Dahl", "Roald", "Charlie and the Chocolate Factory", "Alfred A. Knopf", 1964);

        System.out.print("\n\n");
        System.out.println ("Test compareTo:  " + book1 + "  " + book1.compareTo(book2) + "  " + book2);
        System.out.println ("Test compareTo:  " + book2 + "  " + book2.compareTo(book3) + "  " + book3);
        System.out.println ("Test compareTo:  " + book1 + "  " + book1.compareTo(book3) + "  " + book3);
        System.out.println ("Test compareTo:  " + book2 + "  " + book2.compareTo(book2) + "  " + book2);
*/    }
}
