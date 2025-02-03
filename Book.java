/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Alessandro Marucci
 * @version 2025.02.03
 */
public class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages; // 2.85

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int numberOfPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numberOfPages; // 2.85
        String refNumber = ""; //2.88
        
    }

    // Add the methods here ...
    public void printAuthor() // 2.84
    {
        System.out.println(author);
    }
    
    public void printTitle() // 2.84
    {
        System.out.println(title);
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages() // 2.85
    {
        return pages;
    }
    
    public void printDetails() // 2.87
    {
        System.out.println("Title: " + title + ", " + "Author: " + author + 
        ", " + "Pages: " + pages);
        
    }
    
    public void setRefNumber (String ref) // 2.88
    {
    }
    
}
