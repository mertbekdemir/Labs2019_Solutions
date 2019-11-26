
/**
 * Write a description of class Car here.
 * 
 * @author (Rana Alsammarraie) 
 * @version (2018)
 */
public class Car {
    private String carMake;
    private String carColour;
    private FuelGauge fuelGauge;

    /**
     * Car default Constructor
     *
     */
    public Car(){
       carMake = "unknown";
       carColour = "unknown";
       fuelGauge = new FuelGauge();
    }

    /**
     * Car Constructor
     *
     * @param carMake A parameter to set carMake
     * @param carColour A parameter to set carColour
     * @param fuelAmount A parameter to set fuelAmount in fuelGage
     */
    public Car(String carMake, String carColour, int fuelAmount) {
        setCarMake(carMake);
        setCarColour(carColour);
        setFuelGage (new FuelGauge(fuelAmount));

    }

    /**
     * Method getCarMake
     *
     * @return The return carMake
     */
    public String getCarMake() {
        return carMake;
    }

    /**
     * Method getCarColour
     *
     * @return The return carColour
     */
    public String getCarColour() {
        return carColour;
    }

    /**
     * Method getFuelGage
     *
     * @return The return fuelGage
     */
    public FuelGauge getFuelGage() {
        return fuelGauge;
    }

    /**
     * Method setCarMake
     *
     * @param carMake A parameter to set carMake
     */
    public void setCarMake(String carMake) {
        if(carMake != null){
            this.carMake = carMake;
        }
        else{
            throw new IllegalArgumentException(" car make can not be null");
        }

    }

    /**
     * Method setCarColour
     *
     * @param carColour A parameter to set carColour
     */
    public void setCarColour(String carColour) {
        if(carColour != null){
            this.carColour = carColour;
        }
        else{
            throw new IllegalArgumentException(" car colour can not be null");
        }
    }

    /**
     * Method setFuelGage
     *
     * @param fuelGage A parameter to set fuelGage
     */
    public void setFuelGage(FuelGauge fuelGauge) {
        if(fuelGauge != null){
            this.fuelGauge = fuelGauge;
        }
        else{
            throw new IllegalArgumentException(" Fuel Gauge object can not be null");
        }
    }

    /**
     * Method drive 
     *
     */
    public void drive(){
        fuelGauge.useFuel();
    }

    /**
     * Method fillTank
     *
     */
    public void fillTank(){
        fuelGauge.addFuel();
    }
}