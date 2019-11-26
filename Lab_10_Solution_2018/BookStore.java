/**
 * BookStore class
 * 
 * @author (Rana Alsammarraie)
 * @version (2014.03.02)
 */
import java.util.ArrayList;

public class BookStore
{
    private String businessName;
    private ArrayList<Book> books;

    
    /**
     * Default constructor
     */
    public BookStore() {
        businessName = "Book Store";
        books = new ArrayList<Book>();
    }

    /**
     * BookStore Constructor
     *
     * @param businessName A parameter to set businessName
     */
    public BookStore(String businessName) {
        setBusinessName(businessName);
        books = new ArrayList<Book>();
    }

    /**
     * Method getBusinessName
     *
     * @return The return value of businessName
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Method getBooks
     *
     * @return The return value of books arrayList
     */
    public ArrayList<Book> getBooks(){
        return books; 
    }

    /**
     * Method setBusinessName
     *
     * @param businessName A parameter to set businessName
     */
    public void setBusinessName(String businessName) {
        if(businessName != null&& ! businessName.isEmpty()) {
            this.businessName = businessName;
        }
        else {
            throw new IllegalArgumentException("business name cannot be null");
        }
    }

    /**
     * Method addBook
     *
     * @param book A parameter to add to the books arrayList
     */
    public void addBook(Book book) {
        if(book != null) {
            books.add(book);
        }
    }

    /**
     * Method listBook takes the index of a Book object and displays
     * the details of that book if the passed index is valid
     *
     * @param index A parameter to pass an index value to the method
     */
    public void listBook(int index) {
        if(index >= 0 && index < books.size()) {
            Book book = books.get(index);
            book.displayDetails();
           // books.get(index).displayDetails();
        }
        else {
            System.out.println("invalid index position.");
        }
    }

    /**
     * Searches the array for a book title
     * 
     * @param searchTitle book title being searched for
     */
    public void findBook(String title) {
        boolean isFound = false;
        if( title != null){
            for(Book book : books) {

                if(title.equalsIgnoreCase(book.getTitle())) {
                    isFound = true;
                    book.displayDetails();
                }

            }

        }
        if( isFound == false) {
            System.out.println("the book was not found");
        }
    }

    /**
     * Displays the information of all books in the arrayList
     */
    public void displayBooks() {
        for(Book book : books) {
            System.out.println("\n");
            book.displayDetails();
            

        }
    }

    /**
     * Method main
     *
     * @param args A parameter
     */
    public static void main(String[] args){
        BookStore store = new BookStore("the Book Store");
        store.addBook(new  Book("The help","Kathryn Stockett", 2009, 20.0));
        store.addBook(new  Book("Inferno","Dan Brown", 2013, 15.0));
        store.addBook(new  Book("How We Decide","Jonah Lehrer ", 2010, 7.0));
        System.out.println("\n Calling method  listBook() with invalid index... ");
        store.listBook(4);
        System.out.println("\n Calling method  listBook() with valid index...");
        store.listBook(2);
        System.out.println("\n Calling method  findBook() with a title that is not in the list...");
        store.findBook("the Book");
        System.out.println("\n Calling method  findBook() with a title that is in the list...");
        store.findBook("Inferno");
        System.out.println("\n\n All the books in the list: ");
        store.displayBooks();

    }
}


