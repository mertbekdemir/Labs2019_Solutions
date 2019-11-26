
/**
 * Cat class - COMP 1409 Lab 7
 * @author Colleen Penrowley 
 * @version 2012.06.08
 */
public class Cat
{
    private String name;
    private int yearOfBirth;
    private double weightInPounds;

    /**
     * Default constructor for Cat
     */
    public Cat()
    {
       name = "unknown";
       yearOfBirth = 0;
       weightInPounds = 0.0;
    }
    
    /**
     * Constructor for objects of class Cat
     * @param name
     * @param yearOfBirth
     * @param weightInPounds
     */
    public Cat(String name, int yearOfBirth, double weightInPounds)
    {
        setName(name);
        setYearOfBirth(yearOfBirth);
        setWeightInPounds(weightInPounds);
    }

    /**
     * Gets cat's name
     * @return     cat's name as a String 
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Gets cat's year of birth
     * @return year of birth as an int
     */
    public int getYearOfBirth()
    {
        return yearOfBirth;
    }
    
    /**
     * Gets cat's weight in pounds
     * @return weight in pounds as a double
     */
    public double getWeight()
    {
        return weightInPounds;
    }
    
    /**
     * Sets cat's name
     * @param catName cat's new name
     */
    public void setName(String catName)
    {
       if((catName != null)&&(! catName.equals(""))){
            name = catName; 
       }
       else {
            throw new IllegalArgumentException("Name must have at least one letter.");
       }
    }
    
    /**
     * Sets cat's year of birth
     * @param catBirthYear cat's new year of birth
     */
    public void setYearOfBirth(int catBirthYear)
    {
        if(catBirthYear >= 0) {
            yearOfBirth = catBirthYear;
        }
        else {
             throw new IllegalArgumentException("Year cannot be negative.");
        }
    }
    
    /**
     * Sets cat's weight in pounds
     * @param catWeightPounds cat's new weight in pounds
     */
    public void setWeightInPounds(double catWeightPounds) 
    {
        if(catWeightPounds >= 0.0){
            weightInPounds = catWeightPounds;
        }
        else {
             throw new IllegalArgumentException("Weight cannot be negative.");
        }
    }
}
