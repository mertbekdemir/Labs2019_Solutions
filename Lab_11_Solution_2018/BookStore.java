/**
 * BookStore class
 * 
 * @author (Rana Alsammarraie)
 * @version (2014.03.02)
 */
import java.util.ArrayList;
import java.util.Iterator;

public class BookStore
{
    public static final  double DISCOUNT_RATE = 0.85;
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
     * Method donateBook
     *
     * @param yearPublished A parameter to pass the books published year
     * @return The return value is the number of removed books
     * 
     * the method removes the books published earlier than the passed parameter
     */
    public int donateBook(int yearPublished){
        int counter = 0;
        Iterator<Book> it = books.iterator();
        if(yearPublished > 0){
            while(it.hasNext()){
                Book myBook = it.next();
                if(myBook.getYearPublished() < yearPublished){
                    // if(it.next().getYearPublished() < yearPublished){
                    it.remove();
                    counter++;
                }
            }
        }
        else{
            System.out.println(" year published must be positive integer"); 
        }
        return counter;
    }

    /**
     * Method applyDiscountToBooks
     *
     * @param beginYear A parameter to pass the begin year
     * @param endYear A parameter to pass the end year
     * a method to adjust the price of the books published
     * between the given years to anew discounted price
     */
    public void applyDiscountToBooks(int beginYear, int endYear){

        if(beginYear >0 && endYear>0){
            Iterator<Book> it = books.iterator();
            while(it.hasNext()){
                Book theBook = it.next();
                int bookPublishedYear = theBook.getYearPublished();
                if(bookPublishedYear >= beginYear && bookPublishedYear <= endYear){
                    theBook.setBookPriceInCAD(theBook.getBookPriceInCAD() * DISCOUNT_RATE);
                }
            }
        }
        else{
            System.out.println("  passed years published must be positive integers");  
        }
    }

    
    /**
     * Method applyDiscountToBooks2 same as 
     * the previous method using for-each loop
     *
     * @param beginYear A parameter
     * @param endYear A parameter
     */
    public void applyDiscountToBooks2(int beginYear, int endYear){

        if(beginYear >0 && endYear>0){
            for(Book book:books){
                int bookPublishedYear = book.getYearPublished();
                if(bookPublishedYear >= beginYear && bookPublishedYear <= endYear){
                    book.setBookPriceInCAD(book.getBookPriceInCAD() * DISCOUNT_RATE);
                }
            }
        }
        else{
            System.out.println("  passed years published must be positive integers");  
        }
    }

  

    /**
     * Method getBooksByAuthor
     *
     * @param authorName A parameter to pass the authors name
     * @return The return value is an arrayList of books written by the
     * given author
     */
    public ArrayList<Book> getBooksByAuthor(String authorName){
        ArrayList<Book> authorsBooks = new ArrayList<Book>();
        for(Book book:books){
            if(book.getAuthor().equalsIgnoreCase(authorName)){
                authorsBooks.add(book);
            }
        }
        return authorsBooks;
    }

    /**
     * Method getAveragePrice1
     *
     * @param authorName A parameter
     * @return The return value is the average price of the books written
     * by the given author
     */
    public double getAveragePrice1(String authorName){
        double totalPrice = 0.0;
        int counter =0;
        double averagePrice = 0;
        Iterator<Book> it = books.iterator();
        while(it.hasNext()){
            Book eachBook = it.next();
            if(eachBook.getAuthor().equalsIgnoreCase(authorName)){
                totalPrice += eachBook.getBookPriceInCAD();
                counter++;
            }
        }
        if(counter > 0){
            averagePrice = totalPrice / counter;
        }
        return averagePrice;
    }

    /**
     * Method getAveragePrice2
     *
     * @param authorName A parameter
     * @return The return value is the average price of the books written
     * by the given author
     */
    public double getAveragePrice2(String authorName){
        double totalPrice = 0.0;
        double averagePrice = 0.0;
        ArrayList<Book> authorsBooks = getBooksByAuthor(authorName);
        Iterator<Book> it = authorsBooks.iterator();
        if(authorsBooks.size()>0){
            while(it.hasNext()){
                Book book = it.next();
                if(book.getAuthor().equalsIgnoreCase(authorName)){
                    totalPrice += book.getBookPriceInCAD();
                }
            }
            averagePrice = totalPrice / authorsBooks.size();  
        }
        return averagePrice;
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


