
/**
 * BankCharges class to calculate the bank service fees 
 * 
 * @author (Rana Alsammarraie) 
 * @version (2018)
 */
public class BankCharges
{

    public static final double FIRST_CHEQUES_CHARGE = 0.10;
    public static final double SECOND_CHEQUES_CHARGE = 0.08;
    public static final double THIRD_CHEQUES_CHARGE = 0.06;
    public static final double FOURTH_CHEQUES_CHARGE = 0.04;
    public static final int BANK_CHARGE = 10;
    public static final int BANK_LOW_BALANCE_CHARGE = 15;
    public static final int FIRST_CHEQUES_LIMIT = 20;
    public static final int SECOND_CHEQUES_LIMIT = 40;
    public static final int THIRD_CHEQUES_LIMIT = 60;
    public static final int LOW_BALANCE_LIMIT = 400;
   

    private String clientName;
    private double endingBalance;
    private int numberOfCheques;

    /**
     * BankCharges  default Constructor
     *
     */
    public BankCharges(){
        clientName = "unknown";
        endingBalance = 0.0;
        numberOfCheques = 0;
    }

    /**
     * BankCharges  non default Constructor
     *
     * @param newClientName  parameter  to set clientName
     * @param newEndingBalance  parameter to set endingBalance
     * @param newNumberOfCheques  parameter to set numberOfCheques
     */
    public BankCharges (String newClientName, double newEndingBalance,
    int newNumberOfCheques){
        if(newClientName != null){
            clientName = newClientName;
        }
        else{
            throw new IllegalArgumentException("Client name cannot be null");
        }
        if(newEndingBalance >0){
            endingBalance = newEndingBalance;
        }
        else{
           throw new IllegalArgumentException("Client ending balance cannot be negative");
        }
        if(newNumberOfCheques >0){
            numberOfCheques = newNumberOfCheques;
        }
        else{
           throw new IllegalArgumentException("Number of cheques cannot be negative");
        }
    }

    /**
     * @return the clientName
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * @return the endingBalance
     */
    public double getEndingBalance() {
        return endingBalance;
    }

    /**
     * @return the numberOfCheques
     */
    public int getNumberOfCheques() {
        return numberOfCheques;
    }

    /**
     * @param newClientName to set the clientName 
     */
    public void setClientName(String newClientName) {
        if(newClientName != null){
            clientName= newClientName  ;
        }
        else{
            throw new IllegalArgumentException("Client name cannot be null");
        }
    }


    /**
     * @param newEndingBalance to set the endingBalance 
     */
    public void setEndingBalance(double newEndingBalance) {

        if(newEndingBalance > 0){
            endingBalance = newEndingBalance;
        }
        else{
              throw new IllegalArgumentException("Client ending balance cannot be negative");
        }
    }


    /**
     * @param newNumberOfCheques to set the numberOfCheques 
     */
    public void setNumberOfCheques(int newNumberOfCheques) {
        if(newNumberOfCheques > 0){
            numberOfCheques = newNumberOfCheques;
        }
        else{
             throw new IllegalArgumentException("Number of cheques cannot be negative");
        }
    }

    /**
     * Method calculateBankServiceFees to calculate the bank fees
     *
     * @return The bank service fees value
     */
    public double calculateBankServiceFees(){
        double charges = BANK_CHARGE;
        if (endingBalance < LOW_BALANCE_LIMIT  ){
            charges = charges + BANK_LOW_BALANCE_CHARGE;
        }

        if(numberOfCheques < FIRST_CHEQUES_LIMIT){
            charges = charges + (numberOfCheques * FIRST_CHEQUES_CHARGE);
        }
        else if (numberOfCheques >= FIRST_CHEQUES_LIMIT &&  numberOfCheques <SECOND_CHEQUES_LIMIT){
            charges = charges + (numberOfCheques * SECOND_CHEQUES_CHARGE);
        }
        else if (numberOfCheques >= SECOND_CHEQUES_LIMIT && numberOfCheques < THIRD_CHEQUES_LIMIT){
            charges =  charges +(numberOfCheques * THIRD_CHEQUES_CHARGE);
        }
        else{
            charges = charges + (numberOfCheques * FOURTH_CHEQUES_CHARGE);
        }

        endingBalance = endingBalance - charges;
        return charges;
    }

}
