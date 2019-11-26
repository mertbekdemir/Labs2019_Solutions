
public class CommissionSales
{
    public static final double RATE_A = 0.05;
    public static final double RATE_B = 0.10;
    public static final double RATE_C = 0.12;
    public static final double RATE_D = 0.14;
    public static final double RATE_E = 0.16;

    public static final int DIVISION_FACTOR = 10000;

    private String salesPersonName;
    private int salesAmountInCAD;
    private double payInCAD;

    /**
     * CommissionSales default Constructor
     *
     */
    public CommissionSales(){
        salesPersonName = "unknown";
        salesAmountInCAD = 0;
        payInCAD = 0;

    }

    /**
     * CommissionSales Constructor
     *
     * @param newName A parameter to set salesPersonName
     * @param newSalesInCAD A parameter to set salesAmountInCAD
     */
    public CommissionSales(String newName, int newSalesInCAD){
        if(newName != null){
            salesPersonName = newName;  
        }
        else {
            throw new IllegalArgumentException("Name cannot be null");
        }

        if (newSalesInCAD >=0){
            salesAmountInCAD = newSalesInCAD;
        }
        else{
            throw new IllegalArgumentException("The pay cannot be negative");
        }

    }

    /**
     * Method getSalesPersonName
     *
     * @return  return salesPersonName
     */
    public String getSalesPersonName(){
        return salesPersonName;
    }

    /**
     * Method getsalesAmountInCAD
     *
     * @return  return salesAmountInCAD
     */
    public double getsalesAmountInCAD(){
        return salesAmountInCAD;
    }

   
    /**
     * Method setSalesPersonName
     *
     * @param newName A parameter to set salesPersonName
     */
    public void setSalesPersonName(String newName){
        if(newName != null){
            salesPersonName = newName;
        }
        else {
            throw new IllegalArgumentException("Name cannot be null");
        }
    }

    /**
     * Method setsalesAmountInCAD
     *
     * @param newSalesInCAD A parameter to set salesAmountInCAD
     */
    public void setSalesAmountInCAD(int newSalesInCAD){
        if(newSalesInCAD >= 0){
            salesAmountInCAD = newSalesInCAD;
        }
        else{
             throw new IllegalArgumentException("Pay cannot be negative");
        }
    }


    /**
     * Method calculatePay
     *
     * @return The return the salesman  payment amount
     */
    public double calculatePay(){
        double salesRate = 0.0;
       // String x = "";
        switch (salesAmountInCAD/ DIVISION_FACTOR){
            case 0:
            case 1: 
            salesRate = RATE_A;
            break;
            case 2: 
            salesRate = RATE_B;
            break;
            case 3: 
            salesRate =  RATE_C;
            break;
            case 4: 
            salesRate = RATE_D;
            break;
            case 5: 
            salesRate =  RATE_E;
            break;
            default:
            System.out.println(" the sales amount is either invalid or outside the range");
            break;

        }
        payInCAD = salesAmountInCAD* salesRate;
        return payInCAD;
    }

    /**
     * Method dispalyDetails
     *
     */
    public void dispalyDetails(){
        System.out.println("Sales Person Name "+ salesPersonName);
        System.out.println(" The sales in CAD "+ salesAmountInCAD);
        System.out.println(" The payment is  "+ payInCAD);
    }
}
