
/**
 * Write a description of class FuelGage here.
 * 
 * @author (Rana Alsammarraie) 
 * @version (2018)
 */
public class FuelGauge {
    public static final int MAX_AMOUNT_OF_FUEL = 15;
    private int amountOfFuelInLiters;

   
    /**
     * FuelGage default Constructor
     *
     */
    public FuelGauge(){
        amountOfFuelInLiters=0;
    }

    
    /**
     * FuelGage Constructor
     *
     * @param amountOfFuelInLiters to set amountOfFuelInLiters
     */
    public FuelGauge(int amountOfFuelInLiters) {
        setAmountOfFuelInLiters( amountOfFuelInLiters);
    }

    
    /**
     * Method getAmountOfFuelInLiters
     *
     * @return The return amountOfFuelInLiters
     */
    public int getAmountOfFuelInLiters() {
        return amountOfFuelInLiters;
    }

    
    /**
     * Method setAmountOfFuelInLiters
     *
     * @param amountOfFuelInLiters A parameter to set amountOfFuelInLiters
     */
    public void setAmountOfFuelInLiters(int amountOfFuelInLiters) {
        if(amountOfFuelInLiters>=0 &&  amountOfFuelInLiters <= MAX_AMOUNT_OF_FUEL){
            this.amountOfFuelInLiters = amountOfFuelInLiters;
        }
        else{
            throw new IllegalArgumentException("Fuel amount can not be negative");
        }
    }

    /**
     * Method useFuel
     *
     */
    public void useFuel(){
        if(amountOfFuelInLiters >0){
            this.amountOfFuelInLiters --;
        }
        else{
            System.out.println("the tank is empty the fuel cannot go below 0");
        }
    }

    /**
     * Method addFuel
     *
     */
    public void addFuel(){
        if(amountOfFuelInLiters <MAX_AMOUNT_OF_FUEL){
            this.amountOfFuelInLiters++;
        }
        else{
            System.out.println("tank is full");
        }
    }
}

	