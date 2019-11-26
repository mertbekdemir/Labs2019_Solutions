/**
 * Driver Exam
 * @author(Rana Alsammarraie)
 * @version(2016/11/2)
 */
public class DriverExamUsingString
{
    public static final int NUMBER_OF_QUESTIONS = 20;
    public static final int NEEDED_TO_PASS = 15;
    public static final int SHIFT_FACTOR = 1;
    public static final String[] VALID_ANSWERS = {"A","B","C","D"};
    public static final String[] TEST_ANSWERS =  {"B","D","A","A","C",
                                                "A","B","A","C","D",
                                                "B","C","D","A","D",
                                                "C","C","B","D","A"};
                                                
                                           
    private InputReader reader;
    private String[] studentAnswers;

    /**
     * Constructor for objects of class DriverExam
     */
    public DriverExamUsingString()
    {
        reader = new InputReader();
        studentAnswers = new String [NUMBER_OF_QUESTIONS];
    }

    /**
     * Fills the array with responses from the test-taker.
     */
    public void promptStudentAnswers()
    {
       
        String answer;
        int index = 0;
            while (index <studentAnswers.length){ //for(int index=0; index<studentAnswers.length; index++){
            System.out.print("Answer to question " + (index +SHIFT_FACTOR)+": ");
            answer = reader.readString();
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
     * Validates the input char.
     * @param response - char the user typed
     * @return true if valid false if not
     */
    public boolean validate(String response)
    {
        int index = 0;
        while(index < VALID_ANSWERS.length){
            if (response.equalsIgnoreCase( VALID_ANSWERS[index]) ) {
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
        int index = 0;
        int correctCount = 0;
        while(index< TEST_ANSWERS.length){
            if(studentAnswers[index].equalsIgnoreCase(TEST_ANSWERS[index])){
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
    
    public static void main(String[] args){
        DriverExamUsingString driver = new DriverExamUsingString();
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
