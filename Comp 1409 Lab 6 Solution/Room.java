
/**
 * Write a description of class Room here.
 * 
 * @author (Rana ALsammarraie) 
 * @version (2017)
 */
public class Room
{
   private double lengthInFoot;
   private double widthInFoot;
   
   /**
    * Room default Constructor
    *
    */
   public Room(){
       lengthInFoot = 0;
       widthInFoot = 0;
    }
    
    /**
     * Room Constructor
     *
     * @param newLenghtInFoot A parameter to set lenghtInFoot
     * @param newWidthInFoot A parameter to set widthInFoot
     */
    public Room(double newLenghtInFoot, double newWidthInFoot){
       setLengthInFoot(newLenghtInFoot);
       setWidthInFoot(newWidthInFoot);
    }
    
    /**
     * Method setLengthInFoot
     *
     * @param newLengthInFoot A parameter to set lenghtInFoot
     */
    public void setLengthInFoot(double newLengthInFoot){
        if (newLengthInFoot >= 0){
            lengthInFoot = newLengthInFoot;
        }
        // else do nothing
    }
    
    /**
     * Method setWidthInFoot
     *
     * @param newWidthInFoot A parameter to set widthInFoot
     */
    public void setWidthInFoot(double newWidthInFoot){
        if(newWidthInFoot >= 0 ){
            widthInFoot = newWidthInFoot;
        }
        // else do nothing
    }
    
    /**
     * Method getLenghtInFoot
     *
     * @return The return value lengthInFoot
     */
    public double getLengthInFoot(){
            return lengthInFoot;
    }
        
    /**
     * Method getWidthInFoot
     *
     * @return The return value widthInFoot
     */
    public double getWidthInFoot(){
            return widthInFoot;
    }
        
    /**
     * Method calculateArea
     *
     * @return The return value the area of the room
     */
    public double calculateArea(){
        return  getLengthInFoot() * getWidthInFoot();
    }
        
}
