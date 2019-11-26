import java.util.ArrayList;

/**
 * Cattery class -- COMP 1409 lab 7
 * A Cattery object contains a collection of Cat objects
 * 
 * @author Colleen Penrowley 
 * @version January 2007
 */
public class Cattery
{
    private String businessName;
    private ArrayList <Cat> catCollection;

    /**
     * Constructor for objects of class Cattery
     * @param businessName name of cattery
     */
    public Cattery(String businessName)
    {
        setBusinessName( businessName);
        catCollection = new ArrayList <Cat>();
    }

    /**
     * Default constructor for Cattery
     */
    public Cattery()
    {
        businessName = "unknown business";
        catCollection = new ArrayList<Cat>();
    }

    /**
     * Method setBusinessName
     *
     * @param name a parameter to set business name
     */
    public void setBusinessName(String name){
        if(name != null && name.length()>0){
            businessName = name;
        }
        else{
            throw new IllegalArgumentException("business name cannot be null");
        }
    }

    /**Add a Cat to the Cattery 
     * @param  catToAdd
     */
    public void addCat(Cat catToAdd)
    {
        if(catToAdd != null){
            catCollection.add(catToAdd);
        }
    }

    /**
     * Display the details of the Cat object at the specified
     * position in the collection. Check to ensure a valid index.
     * 
     * @param position which cat to display
     */
    public void showCat(int position)
    {
        int numberOfCats = catCollection.size();
        // check for valid index position
        if ((position >= 0) && (position < numberOfCats )) {
            Cat catToShow = catCollection.get(position);
            System.out.println(catToShow.getName() + " " 
                + catToShow.getYearOfBirth() + " " 
                + catToShow.getWeight());
        }
        else {
            System.out.println("Not a valid index position!");
        }
    }

    /**
     * Remove the Cat object at the specified position. Check to ensure
     * a valid index.
     * 
     * @param position which cat to remove
     */
    public void removeCat(int position)
    {
        int numberOfCats = catCollection.size();
        // check for valid index position
        if ((position >= 0) && (position < numberOfCats )) {
            catCollection.remove(position);
        }
        else {
            System.out.println("Not a valid index position!");
        }
    }

    /**
     * Display the names of all the cats in the collection
     */
    public void displayNames()
    {
        // ensure there is at least one Cat in the collection
        if (catCollection.size() > 0) {
            System.out.println("The current guests in "+businessName);
            for (Cat eachCat : catCollection) {
                System.out.println(eachCat.getName());
            }
        }
        else {
            System.out.println(businessName + " is empty!");
        }
    }

    public static void main(String[] args){
        Cat cat1 = new Cat("Garfield",2015,2.2);
        Cat cat2 = new Cat("Furball",2014,1.3);
        Cat cat3 = new Cat("Fang",2010,3.5);
        Cattery cattery = new Cattery("Puss In Boots");
        cattery.addCat(cat1);
        cattery.addCat(cat2);
        cattery.addCat(cat3);
        System.out.println(" Calling the showCat() method with invalid index");
        cattery.showCat(4);
        System.out.println(" Calling the showCat() method with valid index");
        cattery.showCat(2);
        System.out.println(" Calling the displayNames() method "); 
        cattery.displayNames();
        System.out.println(" Calling the removeCat() method with invalid index"); 
        cattery.removeCat(4);
        System.out.println(" Calling the removeCat() method with valid index"); 
        cattery.removeCat(2);
        System.out.println(" Calling the displayNames() method "); 
        cattery.displayNames();

    }
}
