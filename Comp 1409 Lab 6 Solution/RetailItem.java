
/**
 * Class RetailItem Lab 2B solution
 * 
 * @author (Rana Alsammarraie) 
 * @version (2018)
 */
public class RetailItem
{

    private String itemDescription;
    private double itemPriceInCAD;
    private boolean isOnDemand;
    private int numberOfUnitsInStock;

    /**
     * RetailItem defaul Constructor
     *
     */
    public RetailItem(){
        itemDescription = "unknown";
        itemPriceInCAD = 1;
        isOnDemand = false;
        numberOfUnitsInStock = 1;
    }

    /**
     * RetailItem non-default constructor
     *
     * @param newItemDescription A parameter
     * @param newItemPriceInCAD A parameter
     * @param newIsOnDemand A parameter
     * @param newNumberOfUnitsInStock A parameter
     */
    public RetailItem(String newItemDescription, double newItemPriceInCAD,
                      boolean newIsOnDemand, int newNumberOfUnitsInStock) {
        if(newItemDescription != null){
            itemDescription = newItemDescription;
        }
        else{
           throw new IllegalArgumentException("Item description cannot be null");
        }
        if(newItemPriceInCAD > 0){
            itemPriceInCAD = newItemPriceInCAD;
        }
        else{
            throw new  IllegalArgumentException("Item price cannot be negative");
        }
       
        if(newNumberOfUnitsInStock > 0){
            numberOfUnitsInStock = newNumberOfUnitsInStock;
        }
        else{
            throw new IllegalArgumentException("Item number of units in stock cannot be null");
        }
        
         isOnDemand = newIsOnDemand;
    }
    
    /**
     * Method getItemDescription
     *
     * @return The itemDescription value
     */
    public String getItemDescription(){
        return itemDescription;
    }
    
    
    /**
     * Method getItemPriceInCAD
     *
     * @return The itemPriceInCAD value
     */
    public double getItemPriceInCAD(){
        return itemPriceInCAD;
    }
    
    /**
     * Method getIsOnDemand
     *
     * @return The isOnDemand value
     */
    public boolean getIsOnDemand(){
        return isOnDemand;
    }
    
    /**
     * Method getNumberOfUnitsInStock
     *
     * @return The numberOfUnitsInStock value
     */
    public int getNumberOfUnitsInStock(){
        return numberOfUnitsInStock;
    }

}
