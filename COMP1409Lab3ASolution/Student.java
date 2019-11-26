
/**
 * Write a description of class Student here.
 * 
 * @author (Rana Alsammarraie) 
 * @version (2018)
 */

public class Student
{
    private String studentName;
    private String studentID;
    private int testScore;
    private double courseFeesInCAD;
    private boolean isEligibleForDiscount;


    /**
     * Student Constructor
     *
     * @param newStudentName  to set the studentName
     * @param newStudentID  to set the studentID
     * @param newTestGrade  to set the testGrade
     * @param newCourseFeesInCAD  to set the testGrade
     */
    public Student(String newStudentName, String newStudentID, 
    int newTestScore,double newCourseFeesInCAD)
    {
        if(newStudentName != null){
            studentName = newStudentName;
        }
        else{
            throw new IllegalArgumentException("name cannot be null");
        }

        if(newStudentID == null){
            throw new IllegalArgumentException("student ID cannot be null");
        }
        else{
            studentID = newStudentID;
        }

        isEligibleForDiscount = false;

        if(newTestScore >= 0){
            testScore = newTestScore;
        }
        else{
            throw new IllegalArgumentException("test score cannot be negative");
        }

        if(newCourseFeesInCAD >= 0){
            courseFeesInCAD = newCourseFeesInCAD;
        }
        else{
            throw new IllegalArgumentException(" course fees cannot be negative");
        }
    }

    /**
     * @return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @return the studentID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * @return the testGrade
     */
    public int getTestScore() {
        return testScore;
    }

    /**
     * @return the courseFeesInCAD
     */
    public double getCourseFeesInCAD() {
        return courseFeesInCAD;
    }

    /**
     * @return the isEligibleForDiscount
     */
    public boolean isEligibleForDiscount() {
        return isEligibleForDiscount;
    }

    /**
     * @param newStudentName  to set the studentName 
     */
    public void setStudentName(String newStudentName) {
        if(newStudentName != null){
            studentName = newStudentName;
        }
        else{
            throw new IllegalArgumentException("name cannot be null");

        }
    }

    /**
     * @param newStudentID to set the the studentID 
     */
    public void setStudentID(String newStudentID) {
        if (newStudentID == null){
            throw new IllegalArgumentException("student ID cannot be null");
        }
        else{
            studentID = newStudentID;
        }
    }

    /**
     * @param newTestGrade to set the testGrade 
     */
    public void setTestScore(int newTestScore) {
        if(newTestScore >= 0){
            testScore = newTestScore;
        }
        else{
            throw new IllegalArgumentException("Test score cannot be negative");
        }
    }

    /**
     * @param newCourseFeesInCAD to set the courseFeesInCAD 
     */
    public void setCourseFeesInCAD(double newCourseFeesInCAD) {

        if(newCourseFeesInCAD >= 0){
            courseFeesInCAD = newCourseFeesInCAD;
        }
        else{
            throw new IllegalArgumentException("course fees cannot be negative");
        }
    }

    /**
     * @param newIsEligibleForDiscount to set the isEligibleForDiscount 
     */
    public void setEligibleForDiscount(boolean newIsEligibleForDiscount) {
        isEligibleForDiscount = newIsEligibleForDiscount;
    }

    /**
     * Method checkForDiscount to check the course fees and sets 
     * isEligibleForAdiscount field accordingly
     *
     */
    public void checkForDiscount(){

        if(courseFeesInCAD > 700){
            courseFeesInCAD = courseFeesInCAD * 0.85;
            isEligibleForDiscount = true;
        }
        else{
            isEligibleForDiscount = false;

        }
    }

    /**
     * Method displayDetails to display the details of the student
     *
     */
    public void displayDetails(){
        System.out.println("Student Name : "+ studentName);
        System.out.println("Student ID : "+ studentID);
        System.out.println("Test Score : " + testScore);
        System.out.println(" Course Fees :" + courseFeesInCAD);
        if(isEligibleForDiscount ){
            System.out.println(" The student got a discount of 15%");
        }
        else{
            System.out.println(" The student is not eligible for a discount ");
        }

    }

}

