
/**
 * Write a description of class CashRegister here.
 * 
 * @author (Rana Alsammarraie) 
 * @version (2014-02-17)
 */
public class CashRegister
{

    public static final double TAX_RATE = 0.06;
    private RetailItem item;
    private int quantitySold;

   

    /**
     * CashRegister Constructor
     *
     * @param newItem A parameter
     * @param amountSold A parameter
     */
    public CashRegister(RetailItem newItem, int amountSold){
        setItem(newItem);
        setQuantitySold(amountSold);
    }

    /**
     * Method setItem
     *
     * @param newItem A parameter to set item
     */
    public void setItem(RetailItem newItem){
        if(newItem == null){
            item = new RetailItem();
        }
        else{
            item = newItem;
        }
    }

    /**
     * Method setQuantitySold
     *
     * @param amount A parameter to set amount sold
     */
    public  void setQuantitySold(int amount){
        if(amount >= 0 && amount <= item.getNumberOfUnitsInStock()){
            quantitySold = amount;
        }
        // else do nothing
    }

    /**
     * Method getItem
     *
     * @return  return item
     */
    public  RetailItem getItem(){
        return item;
    }

    /**
     * Method getQuantitySold
     *
     * @return  return quantitySold
     */
    public int getQuantitySold(){
        return quantitySold;
    }

    /**
     * Method calculateSubTotal
     *
     * @return The subtotal  value of the sold items
     */
    public double calculateSubTotal(){
        double subtotal = getQuantitySold()* item.getItemPriceInCAD();
        return subtotal;
        // return getQuantitySold()* item.getItemPriceInCAD();
    }

    /**
     * Method calculateTax
     *
     * @return The return value
     */
    public double calculateTax(){
        return calculateSubTotal() * TAX_RATE;
    }

    /**
     * Method claculateTotal
     *
     * @return The return the total price of sold items
     */
    public double claculateTotal(){
        return calculateSubTotal() + calculateTax() ;
    }

    /**
     * Method printSalesReceipt to print the sales receipt
     *
     */
    public void printSalesReceipt(){
        System.out.println("Unit price: " + item.getItemPriceInCAD());
        System.out.println("Quantity  : " + getQuantitySold());
        System.out.println("Subtotal  : " + calculateSubTotal());
        System.out.println("Sales tax : " + calculateTax());
        System.out.println("Total     : " + claculateTotal());
    }

}
