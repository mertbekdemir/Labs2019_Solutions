
/**
 * Write a description of class StockPurchase here.
 * 
 *@author (rana Alsammarraie) 
 *@version (2017)
 */
public class StockPuchase {
    private Stock stock;
    private int numberOfShares;

    /**
     * StockPuchase default Constructor
     *
     */
    public StockPuchase(){
        stock = new Stock();
        numberOfShares = 0;
    }

    /**
     * StockPuchase Constructor
     *
     * @param stock A parameter
     * @param numberOfShares A parameter
     */
    public StockPuchase(Stock stock, int numberOfShares) {
        setStock(stock);
        setNumberOfShares(numberOfShares);
    }

    /**
     * Method getStock
     *
     * @return The return stock
     */
    public Stock getStock() {
        return stock;
    }

    /**
     * Method getNumberOfShares
     *
     * @return The return numberOfShares
     */
    public int getNumberOfShares() {
        return numberOfShares;
    }

    /**
     * Method setStock
     *
     * @param stock A parameter to set stock
     */
    public void setStock(Stock stock) {
        if(stock != null){
            this.stock = stock;
        }
        else{
            throw new IllegalArgumentException(" stock can not be null");
        }
    }

    /**
     * Method setNumberOfShares
     *
     * @param numberOfShares A parameter to set numberOfShares
     */
    public void setNumberOfShares(int numberOfShares) {
        if(numberOfShares > 0){
            this.numberOfShares = numberOfShares;
        }
        else{
            throw new IllegalArgumentException(" number of shares can not be negative");
        }
    }

    /**
     * Method getTotalCost
     *
     * @return The return value is the total cost of buying a number of shares
     */
    public double getTotalCost(){
        return stock.getSharePrice() * numberOfShares;
    }

    /**
     * Method displayDetails
     *
     */
    public void displayDetails(){
        stock.displayDetails();
        System.out.println("the cost of buying "+ getNumberOfShares() + "is "+ getTotalCost());
    }

}
