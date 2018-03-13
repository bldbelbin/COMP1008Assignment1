
package bbelbinassignment1;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Jarvis
 */
public class Student {
    
    // string instance variables for first name, last name, street address, city, postal code, 
    // and date of entrollment
    private String firstName, lastName, streetAddress, city, postalCode;
    
    // instance variable for date of birth using an instance variable
    private LocalDate dateOfBirth, dateEnrolled;
    
    // int instance variable to hold the value of the students number
    private int studentNum;
    
      // boolean instance varibale to check if the student is in good standing
    private boolean inGoodStanding = true;
    
    /**
     * @param dateOfBirth
     */
    
   /**
    * 
    * @param firstName
    * @param lastName
    * @param streetAddress
    * @param city
    * @param postalCode
    * @param dateOfBirth
    * @param dateEnrolled
    * @param studentNum 
    * 
    * Constructor which is preparing an object student accepting arguments first name
    * last name, street address, city, postal code, date of birth, date enrolled and student number
    */
    
    public Student (String firstName, String lastName, String streetAddress, String city, 
            String postalCode, LocalDate dateOfBirth, LocalDate dateEnrolled, int studentNum){
        
        setFirstName(firstName);
        setLastName(lastName);
        setStreetAddress(streetAddress);
        setCity(city);
        setPostalCode(postalCode);
        setDateOfBirth(dateOfBirth);
        setDateEnrolled(dateEnrolled);
        setStudentNum(studentNum);
        
    } //  public Student

    /**
     * 
     *  Method to get the value of the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method sets the value for the first name to the value of firstName
     * If a first name is not entered it throws an exception
     */
    public void setFirstName(String firstName) {
        
        if (firstName.isEmpty())
            throw new IllegalArgumentException("First Name cannot be empty");
        else
        this.firstName = firstName;
    }

    /**
     * Method to get the value of the last name 
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method sets the value for the last name to the value of lastName
     * If a last name is not entered it throws an exception
     */
    public void setLastName(String lastName) {
        if (lastName.isEmpty())
            throw new IllegalArgumentException("last Name cannot be empty");
        else
        this.lastName = lastName;
    }

    /**
     * Method to get the value of street address
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * This method sets the value for the streetAddress to the value of 
     * street address.
     * If a street address is not entered it throws an exception
     */
    public void setStreetAddress(String streetAddress) {
        if (streetAddress.isEmpty())
            throw new IllegalArgumentException("Street Address cannot be empty");
        else
        this.streetAddress = streetAddress;
    }

    /**
     * Method to get the value of city
     */
    public String getCity() {
        return city;
    }

    /**
     * This method sets the value for the city to the value of city
     * If a city is not entered it throws an exception
     */
    public void setCity(String city) {
        if (city.isEmpty())
            throw new IllegalArgumentException("City cannot be empty");
        else
        this.city = city;
    }

    /**
     * Method to get the value postal code
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * This method sets the value for the postal code to the value of postalCode
     * If a postal code is not entered it throws an exception
     */
    public void setPostalCode(String postalCode) {
        if (postalCode.isEmpty())
            throw new IllegalArgumentException("Postal Code cannot be empty");
        else
        this.postalCode = postalCode;
    }
    
    /**
     * Method to get the value student number
     */
     public int getStudentNum() {
        return studentNum;
    }

     /**
      * This method set the student number to an integer of studentNum
      * It also tests to make sure the students number is greater than 1
      * if it is not a positive number then it throws an exception
      */
    public void setStudentNum(int studentNum) {
        
        if (studentNum > 1)
        this.studentNum = studentNum;
        else throw new IllegalArgumentException("Student number should be a positive number");
    }

    /**
     * Method to get the value of Date of Birth 
     */
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * This method checks to make sure the student is less than 100 years old
     * if they are over 100 it throws an exception
     *
     * @param dateOfBirth 
     */
    public void setDateOfBirth(LocalDate dateOfBirth) {
        int age = Period.between
                        (dateOfBirth, LocalDate.now()).getYears();
        
        if (age < 100) 
        this.dateOfBirth = dateOfBirth;
        
        else 
            throw new IllegalArgumentException ("Age must be less than 100");
    }
    
    /**
     * Method gets the value of get enrolled
     */
    public LocalDate getDateEnrolled() {
        return dateEnrolled;
    }

    /**
     * 
     * Method to set date enrolled. If the date enrolled is before the current 
     * date an exception is thrown
     */
    public void setDateEnrolled(LocalDate dateEnrolled) {
        
        LocalDate today = LocalDate.now();

        if (dateEnrolled.isBefore(today))
            this.dateEnrolled = dateEnrolled;
        else 
            throw new IllegalArgumentException ("Not a valid enrollment date");
    }
    
    /**
     * This method returns the year the student was born
     * @return 
     */
    public int getYearBorn () {
        return dateOfBirth.getYear();
        
    }

    /**
     *  Will return the students age in years
     * @return 
     */
    public int getAge () {
        int age = Period.between
                (dateOfBirth, LocalDate.now()).getYears();
        
        return age;
    }
    
    /**
     * This method returns the year the student enrolled
     * @return 
     */
    public int getYearEnrolled() {
        
        return dateEnrolled.getYear();
    }
    
    /**
     * This method will come back true or false if the student is 
     * in good standing
     * @return 
     */
     public boolean isInGoodStanding() {
        return inGoodStanding;
    }

    public void setInGoodStanding(boolean inGoodStanding) {
        
        if (inGoodStanding = true)
        this.inGoodStanding = inGoodStanding;
    }
    
    /**
     * This method returns false if the student is suspended
     * @return 
     */
    public boolean suspendStudent() {
        return inGoodStanding = false;
        
    }
    
    /**
     * This method returns ture if the student is reinstated
     * @return 
     */
    public boolean reinstateStudent() {
        return inGoodStanding = true;
    }
    
    /** 
     * This method returns the students first name, last name and student number 
     * as a single string
     * @return 
     */
    
     @Override
    public String toString()
            
    {
        return String.format("%s %s, student number: %d",firstName, lastName, studentNum);
    }
   
  
} // public class Student 
