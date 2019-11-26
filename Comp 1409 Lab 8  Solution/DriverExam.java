


public class DriverExam
{
    public static final int NUMBER_OF_QUESTIONS = 20;
    public static final int NEEDED_TO_PASS = 15;
    public static final int CHAR_OFFSET = 32; // difference between 'A' and 'a'
    public static final char[] VALID_ANSWERS = {'A','B','C','D'};
    
    public static final char[] TEST_ANSWERS =  {'B','D','A','A','C',
                                                'A','B','A','C','D',
                                                'B','C','D','A','D',
                                                'C','C','B','D','A'};
                                                
                                           
    private InputReader reader;
    private char[] studentAnswers;

    /**
     * Constructor for objects of class DriverExam
     */
    public DriverExam()
    {
        reader = new InputReader();
        studentAnswers = new char[NUMBER_OF_QUESTIONS];
    }

    /**
     * Fills the array with responses from the test-taker.
     */
    public void promptStudentAnswers()
    {
      
        char answer;
        int index= 0;
        while(index < studentAnswers.length){
            System.out.print("Answer to question " + (index +1)+": ");
            answer = reader.readChar();
            if(validate(answer)) {
                studentAnswers[index] = answer;
                index++;
            }
            else {
                System.out.println("Not a valid response. Try again.");
               
            }
        }
        
        
        
    }

    /**
     * @param uppercase char to be converted
     * @return the lowercase version of the input char
     */
    private char lowerCaseChar(char toConvert)
    {
        // numeric value of char 'A' == 65, 'a' == 97
        int numericValueOfChar = (int)toConvert;
        numericValueOfChar += CHAR_OFFSET; // difference between upper and lower case
        return (char)numericValueOfChar;
    }

    /**
     * Validates the input char.
     * @param response - char the user typed
     * @return true if valid false if not
     */
    public boolean validate(char response)
    {
        int index = 0;
        while(index< VALID_ANSWERS.length){
            if (response == VALID_ANSWERS[index] || response == lowerCaseChar(VALID_ANSWERS[index])) {
                return true;
            }
            index++;
        }
        return false;
    }
    /**
     * Calculates correct answers
     * @return number of correct answers
     */
    public int getTotalCorrectAnswers()
    {
        int correctCount = 0;
        int index = 0;
        while(index < TEST_ANSWERS.length ){
            if(studentAnswers[index] == TEST_ANSWERS[index] || studentAnswers[index] == lowerCaseChar(TEST_ANSWERS[index])) {
                correctCount++;
            }
            index++;
        }
        return correctCount;
    }
    
    /**
     * Calculates incorrect answers
     * @return number of incorrect answers
     */
    public int getTotalIncorrectAnswers()
    {
        return TEST_ANSWERS.length - getTotalCorrectAnswers();
    }
    
    /**
     * @return true if student passes false if not
     */
    public boolean doesStudentPass()
    {
        if(getTotalCorrectAnswers() >= NEEDED_TO_PASS) {
            return true;
        }
        return false;
    }
    
    /**
     * Method main
     *
     * @param args 
     */
    public static void main(String[] args){
        DriverExam driver = new DriverExam();
        driver.promptStudentAnswers();
        System.out.println(" number of correct answers is "+ driver.getTotalCorrectAnswers());
        System.out.println(" number of incorrect answers is "+driver.getTotalIncorrectAnswers());
        if(driver.doesStudentPass()){
            System.out.println(" the student passes the exam");
        }
        else{
            System.out.println("The student failed the exam");
        }
    }
}
