
/**
 * Write a description of class Stock here.
 * 
 * @author (rana Alsammarraie) 
 * @version (2014-02-24)
 */
public class Stock {
    private String stockSymbol;
    private int sharePrice;

    /**
     * Stock  default Constructor
     *
     */
    public Stock(){
        stockSymbol = "unknown";
        sharePrice = 0;
    }

    /**
     * Stock Constructor
     *
     * @param stockSymbol A parameter to set stockSymbol
     * @param sharePrice A parameter to set sharePrice
     */
    public Stock(String stockSymbol, int sharePrice) {
        setStockSymbol(stockSymbol);
        setSharePrice(sharePrice);
    }

    /**
     * Method getStockSymbol
     *
     * @return The return stockSymbol
     */
    public String getStockSymbol() {
        return stockSymbol;
    }

    /**
     * Method getSharePrice
     *
     * @return The return sharePrice
     */
    public int getSharePrice() {
        return sharePrice;
    }

    /**
     * Method setStockSymbol
     *
     * @param stockSymbol A parameter to set stockSymbol
     */
    public void setStockSymbol(String stockSymbol) {
        if(stockSymbol != null){
            this.stockSymbol = stockSymbol;
        }
        else {
            throw new IllegalArgumentException(" stock symbol can not be null");
        }
            
    }

    /**
     * Method setSharePrice
     *
     * @param sharePrice A parameter to set sharePrice
     */
    public void setSharePrice(int sharePrice) {
        if(sharePrice >= 0){
            this.sharePrice = sharePrice;
        }
        else{
             throw new IllegalArgumentException(" share price can not be negative");
        }
    }

    /**
     * Method displayDetails
     *
     */
    public void displayDetails(){
        System.out.println("the stock"+getStockSymbol() +
                           " share price  is  "+ sharePrice);
    }

    
    
}