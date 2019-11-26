/**
 *a class to calculate book club ponts and the total
 *numbre of sold books from that club.
 * 
 * @author (Rana Alsammarraie) 
 * @version (2.0)
 */
public class BookClub
{
    public static final int BUYING_ONE_BOOK = 1 ;
    public static final int FIRST_LEVEL_POINTS_LIMIT = 4;
    public static final int SECOND_LEVEL_POINTS_LIMIT= 8;
    public static final int THIRD_LEVEL_POINTS_LIMIT = 10;

    public static final int POINTS_OF_FIRST_LEVEL = 5;
    public static final int POINTS_OF_SECOND_LEVEL = 15;
    public static final int POINTS_OF_THIRD_LEVEL = 30; 
    public static final int POINTS_OF_FOURTH_LEVEL = 60;
   
    private static int totalNumberOfSoldBooks;
    
    private String clientName;
    private int numberOfPurchasedBooksPerMonth;
   

    

    /**
     * BookClub Constructor
     *
     * @param name A parameter to set ClientName
     * @param numberOfBooks A parameter to set numberOfPurchasedBooksPerMonth
     * @param priceInCAD A parameter to set bookPriceInCAD
     */
    public BookClub(String name, int numberOfBooks){
        
        if(name == null){
           throw new IllegalArgumentException("Name cannot be null");
        }
        else{
            clientName = name;
        }

        if(numberOfBooks >0){
            numberOfPurchasedBooksPerMonth = numberOfBooks;
            totalNumberOfSoldBooks = totalNumberOfSoldBooks + numberOfBooks;
        }
        else{
           throw new IllegalArgumentException(" number of purchased books cannot be 0 or negative");
          
        }
      // BUYING_ONE_BOOK= 10;// can not change the vaule of the symbolic constants 
    }

    /**
     * Method getClientName
     *
     * @return The return clientName
     */
    public String getClientName(){
     
        return clientName;
        //System.out.println(clientName);// will not compile because return is the last executable statement
                                         // in a method
    }
    

    /**
     * Method getNumberOfPurchasedBooksPerMonth
     *
     * @return The return numberOfPurchasedBooksPerMonth
     */
    public int getNumberOfPurchasedBooksPerMonth(){
        return numberOfPurchasedBooksPerMonth;
    }

    /**
     * Method getTotalNumberOfPurchasedBooks
     *
     * @return The return totalNumberOfPurchasedBooks
     */
    public static int getTotalNumberOfSoldBooks(){
      //  System.out.println(clientName);// static method cannot access a non-static variable
        return totalNumberOfSoldBooks;
    }

    /**
     * Method setClientName
     *
     * @param name A parameter to set ClientName
     */
    public void setClientName(String name){
        if(name != null){
            clientName = name;
        }
        else{
             throw new IllegalArgumentException("Name cannot be null");
        }
    }

    
    /**
     * Method setNumberOfPurchasedBooksPerMonth
     *
     * @param newNumberOfBooks A parameter to set numberOfPurchasedBooksPerMonth
     */
    public void setNumberOfPurchasedBooksPerMonth( int newNumberOfBooks){
        if(newNumberOfBooks > 0){
            numberOfPurchasedBooksPerMonth =  numberOfPurchasedBooksPerMonth+ newNumberOfBooks;
            totalNumberOfSoldBooks = totalNumberOfSoldBooks + newNumberOfBooks;
        }
    }


    /**
     * Method calculateBookPoints to calculate the total points
     * earned form buying books 
     *
     * @return The return totalPoints
     */
    public int calculateBookPoints()
    {
        int totalPoints = 0;
        if(numberOfPurchasedBooksPerMonth >= BUYING_ONE_BOOK && numberOfPurchasedBooksPerMonth < FIRST_LEVEL_POINTS_LIMIT){
            totalPoints = totalPoints + POINTS_OF_FIRST_LEVEL;//totalPoiints = totalPoints + ( POINTS_OF_FIRST_LEVEL * numberOfPurchasedBooksPerMonth ); because per book?
        }
        else if(numberOfPurchasedBooksPerMonth >= FIRST_LEVEL_POINTS_LIMIT && numberOfPurchasedBooksPerMonth < SECOND_LEVEL_POINTS_LIMIT ){
            totalPoints =  totalPoints + POINTS_OF_SECOND_LEVEL;
        }
        else if(numberOfPurchasedBooksPerMonth >= SECOND_LEVEL_POINTS_LIMIT && numberOfPurchasedBooksPerMonth < THIRD_LEVEL_POINTS_LIMIT ) {
            totalPoints = totalPoints + POINTS_OF_THIRD_LEVEL;
        }
        else{
            totalPoints =  totalPoints + POINTS_OF_FOURTH_LEVEL;
        }

        return totalPoints;
    }
}

