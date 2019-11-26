
/**
 * Write a description of class CarpetCalculator here.
 * 
 * @author (Rana Alsammarraie) 
 * @version (2017)
 */
public class CarpetCalculator
{
    private double priceOfOneSquareFootInCAD;
    private Room room;

    /**
     * CarpetCalculator Constructor
     *
     */
    public CarpetCalculator(){
        room = new Room();
        priceOfOneSquareFootInCAD = 0.0;
    }

    /**
     * CarpetCalculator Constructor
     *
     * @param newRoom A parameter to set room
     * @param newPrice A parameter to set priceOfOneSquareFootInCAD
     */
    public CarpetCalculator(Room newRoom, double  newPrice){
        setRoom(newRoom);
        setPriceOfOneSquareFootInCAD(newPrice);
    }

    /**
     * Method setRoom
     *
     * @param newRoom A parameter to set room
     */
    public void setRoom(Room newRoom){
        if(newRoom == null){
            room = new Room();
        }
        else{
            room = newRoom;
        }
    }
        
    /**
     * Method setPriceOfOneSquareFootInCAD
     *
     * @param newPrice A parameter to set priceOfOneSquareFootInCAD
     */
    public void setPriceOfOneSquareFootInCAD(double newPrice){
        if(newPrice >= 0){
             priceOfOneSquareFootInCAD = newPrice;   
        }
        // else do nothing
    }
    
    /**
     * Method getRoom
     *
     * @return The room
     */
    public Room getRoom(){
        return room;
    }
        
    /**
     * Method getPriceOfOneSquareFootInCAD
     *
     * @return The return priceOfOneSquareFootInCAD
     */
    public double getPriceOfOneSquareFootInCAD(){
        return priceOfOneSquareFootInCAD;
    }
    
    /**
     * Method calculateTotalCost
     *
     * @return The return total cost of the carpet
     */
    public double calculateTotalCost(){
        return getPriceOfOneSquareFootInCAD() * room.calculateArea();
    }
    
    /**
     * Method displayDetails
     *
     */
    public void displayDetails(){
        System.out.println(" The room's width is " + room.getWidthInFoot());
        System.out.println(" The room's length is " + room.getLengthInFoot());
        System.out.println(" The price of one square foot is " + getPriceOfOneSquareFootInCAD());
        System.out.println(" The total cost of the carpet is " + calculateTotalCost());        
    }
}
