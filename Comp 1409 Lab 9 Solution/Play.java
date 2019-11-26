
/**
 * Write a description of class Play here.
 * 
 * @author (Rana Alsammarraie) 
 * @version (2017-03-07)
 */
import java.util.Random;
public class Play
{
    public static final int RANDOM_SEED = 10;
    public static final int SHIFT_FACTOR = 1;
    public static final int MINIMUM_NUMBER = 1;
    public static final int MAXIMUM_NUMBER = 10;
    private InputReader reader;

    /**
     * Constructor for objects of class Play
     */
    public Play()
    {
        reader = new InputReader();
    }

    /**
     * Method stringPlay
     * prompts the user for a string and displays the string 
     * in a camel case format as the string length number of times
     *
     */
    public void stringPlay(){
        System.out.print("enter a string: ");
        String input = reader.readString();
        int stringLength = input.length();
        int counter = 0;
        String resultString = input.substring(0,SHIFT_FACTOR).toUpperCase()+input.substring(SHIFT_FACTOR).toLowerCase()+" ";
        String result = "";
        while(counter < stringLength){
            result += resultString ;
            counter++;
        }
        System.out.println(" the resulting string is "+ result);
    }

    /**
     * Method getMultiplicationTable
     *
     */
    public void getMultiplicationTable(){
        int[][] multiplicationTable;
        int numberOfRows = 0;
        int numberOfColumns = 0;
        boolean isValid = false;
        while(! isValid){
            System.out.println("enter the number of rows between "+MINIMUM_NUMBER + " and "+ MAXIMUM_NUMBER);
            numberOfRows = reader.readInt();
            System.out.println("enter the nimber of columns between "+MINIMUM_NUMBER+" and "+MAXIMUM_NUMBER);
            numberOfColumns = reader.readInt();
            if(numberOfRows >= MINIMUM_NUMBER && numberOfRows <= MAXIMUM_NUMBER && numberOfColumns >= MINIMUM_NUMBER && numberOfColumns <= MAXIMUM_NUMBER){
                isValid = true;
            }
            else{
                System.out.println(" invalid number was enterd please try again");
            }
        }
        numberOfRows++;
        numberOfColumns++;
        // create the array
        multiplicationTable = new int[numberOfRows][numberOfColumns];
        // load the array with the multiplication table
        for(int row = 0; row < multiplicationTable.length; row++){

            for(int column= 0; column < multiplicationTable[row].length; column++){
                multiplicationTable[row][column] = row *column;
            }

        }
        // dispaly the array content
        for(int row = 0; row < multiplicationTable.length; row++){

            for(int column= 0; column < multiplicationTable[row].length; column++){
                System.out.format("%4d",multiplicationTable[row][column] );
            }
            System.out.println();
        }
    }

    /**
     * Method guessTheNumber
     *  prompt the user to guess a random generated number between 1 and 10
     *  inclusive
     */
    public void guessTheNumber(){
        Random random = new Random();
        int toGuessNumber = random.nextInt(RANDOM_SEED)+SHIFT_FACTOR;
        boolean rightGuess = false;
        int counter = 0;

        while (! rightGuess){
            System.out.print("guess the number between "+MINIMUM_NUMBER+" and "+ MAXIMUM_NUMBER+" :  ");
            int userInput = reader.readInt();
            if(userInput >= MINIMUM_NUMBER && userInput <= MAXIMUM_NUMBER){
                counter ++;
                if( userInput > toGuessNumber){
                    System.out.println("...too high, guess lower");
                }
                else if(userInput < toGuessNumber){
                    System.out.println("...too low, guess higher");
                }
                else{
                    rightGuess = true;
                    System.out.println("you win the number is "+toGuessNumber );
                    System.out.println("the number of attempts is " + counter +" times");
                }
            }
            else{
                System.out.println("out of range number, please try again");
            }

        }
    }

    /**
     * Method main
     *
     * @param args A parameter
     */
    public static void main(String[] args){
        Play play = new Play();
        // play.stringPlay();
        // play.getMultiplicationTable();
        play.guessTheNumber();
    }
}
