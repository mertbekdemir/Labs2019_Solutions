
/**
 * Write a description of class Driver here.
 * 
 * @author (Rana Alsammarraie) 
 * @version (2018)
 */
public class Driver
{

    private String name;
    private String driverLicense;
    private int speedInKPerHour;
    private String driverStanding;
    private boolean isGoodDriver;

   

    /**
     * Driver Constructor
     *
     * @param newName to set the name
     * @param newDriverLicense to set the driverLicense
     * @param newSpeedInKPerHour to set the speedInKPerHour
     */
    public Driver(String newName, String newDriverLicense, int newSpeedInKPerHour) {
        if( newName != null){
            name = newName;
        }
        else{
           throw new IllegalArgumentException("The name cannot be null");
        }

        if (newDriverLicense == null){
            throw new IllegalArgumentException("The Driver License cannot be null");
        }
        else{
            driverLicense = newDriverLicense;
        }
        if(newSpeedInKPerHour > 0){
            speedInKPerHour = newSpeedInKPerHour;
        }
        else{
            throw new IllegalArgumentException("The speed cannot be negative or 0");
        }
        
        driverStanding = "unknown";
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param newName to set the name 
     */
    public void setName(String newName) {
        if(newName != null){
            name = newName;
        }
        else{
             throw new IllegalArgumentException("The name cannot be null");
        }
        
    }

    /**
     * @return the driverLicense
     */
    public String getDriverLicense() {
        return driverLicense;
    }

    /**
     * @param newDriverLicense to set the driverLicense 
     */
    public void setDriverLicense(String newDriverLicense) {
        if( newDriverLicense != null){
            driverLicense = newDriverLicense;
        }
        else{
            throw new IllegalArgumentException("The driver license cannot be null");
        }
        
    }

    /**
     * @return the speedInKPerHour
     */
    public int getSpeedInKPerHour() {
        return speedInKPerHour;
    }

    /**
     * @param newSpeedInKPerHour to set  the speedInKPerHour 
     */
    public void setSpeedInKPerHour(int newSpeedInKPerHour) {
        if(newSpeedInKPerHour > 0){
            speedInKPerHour = newSpeedInKPerHour;
        }
        else{
             throw new IllegalArgumentException("The speed cannot be negative");
        }
    }

    /**
     * @return the driverStanding
     */
    public String getDriverStanding() {
        return driverStanding;
    }

    /**
     * @param newDriverStanding to set the driverStanding 
     */
    public void setDriverStanding() {
        if(speedInKPerHour <= 60){
            driverStanding = "no ticket";
           // System.out.println("no Ticket");
          // the above statement will display NOT ASSIGN the value to the field
           // return "no ticket"; this will return the value not assign the value
          
        }
         else if(speedInKPerHour <= 80){
            driverStanding = "small ticket";
        }
         else{
            driverStanding = "big ticket";
        }
    }

    /**
     * Method displayDetails to display the details of the driver
     *
     */
    public void displayDetails(){

        System.out.println(" Driver name : " + name);
        System.out.println(" Driver name : " + "Bob Brown");
        //the above statement will dispaly the name bob brown every time regardless of the 
        // actual name field value
        System.out.println("Driver License number : " +driverLicense );
        System.out.println("Speed : " + speedInKPerHour);
        System.out.println("Driver Standing : " + driverStanding );
        
        if(isGoodDriver == true){// make sure to use == t compare not =
        System.out.println(" Driver name : " + name + "is a good driver");
        }
        else{
            System.out.println(" Driver name : " + name +"is a bad driver");
        }
    }

}
