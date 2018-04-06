public class NonFictionBook extends Book
{
    private String topic;
    
    public NonFictionBook (String first, String last, String theTitle, 
                   String thePublisher, int year, String top)
    {
        super(first, last, theTitle, thePublisher, year);
        topic = top;
    }
    
    public String getTopic ()        { return topic; }
    public void setTopic (String s)  { topic = s; }
}