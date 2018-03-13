/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbelbinassignment1;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;


public class Instructor {
    
    /* String instance variables for firstName, lastName, streetAddress, city, postal
     code*/
    private String firstName, lastName, streetAddress, city,
            postalCode;
    
    // Instance variable for courseCodes. ArrayList to hold courseCodes
    private final ArrayList <String> courseCodes = new ArrayList<>();
    
    // Instance variable for LocalDates hireDate and birthday
    private LocalDate hireDate, birthday;
    
    // int instance variable to hold the employee number
    private int employeeNum;
    
    // Constructor which is preparing an Instructor object with the instance variables
    public Instructor (String firstName, String lastName, String streetAddress,
            String city, String postalCode, LocalDate hireDate, LocalDate birthday,
            int employeeNum) {
        
        setFirstName(firstName);
        setLastName(lastName);
        setStreetAddress(streetAddress);
        setCity(city);
        setPostalCode(postalCode);
        setHireDate(hireDate);
        setBirthday(birthday);
        setEmployeeNum(employeeNum);
        
    } //public Instructor

     // Method to get the value of the firstName
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

    //Method to get the value of the last name 
    public String getLastName() {
        return lastName;
    }
    /**
     * This method sets the value for the last name to the value of lastName
     * If a last name is not entered it throws an exception
     */
    public void setLastName(String lastName) {
        
        if (lastName.isEmpty())
            throw new IllegalArgumentException("Last Name cannot be empty");
        else
            this.lastName = lastName;
    }

    // Method to get the value of the street address
    public String getStreetAddress() {
        return streetAddress;
    }

    /*This method sets the value for the street addres to the value
    streetAddress.
    If address is empty thorw exception*/
    public void setStreetAddress(String streetAddress) {
        
        if (streetAddress.isEmpty())
            throw new IllegalArgumentException("Street Address can not be empty");
        else
            this.streetAddress = streetAddress;
    }

    // Method to get the value of the city
    public String getCity() {
        return city;
    }

    /**
     * This method sets the value for city to the value of city
     * If a city is not entered it throws an exception
     */
    public void setCity(String city) {
        
        if (city.isEmpty())
            throw new IllegalArgumentException("City cannot be empty");
        else
            this.city = city;
    }

    // Method to get the value of the postal code
    public String getPostalCode() {
        return postalCode;
    }
 
    /**
     * This method sets the value for postal code to the value of postalCode
     * If a postal code is not entered it throws an exception
     */
    public void setPostalCode(String postalCode) {
        
        if (postalCode.isEmpty())
            throw new IllegalArgumentException("Postal Code cannot be empty");
        else
            this.postalCode = postalCode;
    }   

    // method to get the hireDate. Uses LocalDate 
    public LocalDate getHireDate() {
        return hireDate;
    }

     /**
     * This method sets the value for hire date to the value of HireDate
     * If the hire date is before 1 month before the current date
     * it throws an exception
     */
    public void setHireDate(LocalDate hireDate) {
        
       LocalDate futureMonth = LocalDate.now().plusMonths(1);
        if (hireDate.isBefore(futureMonth))
            this.hireDate = hireDate;
        else throw new IllegalArgumentException("Hire day should be one Month before the current date");
    }

    // Method to get the instructors birthday
    public LocalDate getBirthday() {
        return birthday;
    }

     /**
     * This method sets the value for birthday to the value of birthday
     * If the instructors age is over 90 it throws an exception
     */
    public void setBirthday(LocalDate birthday) {
        int age = Period.between
                        (birthday, LocalDate.now()).getYears();
        
        if (age < 90)
            this.birthday = birthday;
        else 
            throw new IllegalArgumentException("Teacher's age needs to be less than 90");
        
    }

    // Method gets the employee number
    public int getEmployeeNum() {
        return employeeNum;
    }

    public Instructor() {
    }
    
    /**
     * This method sets the value for employee number to the value of employeeNum.
     * If the employee number is less than 0 its throws and exception
     */
    public void setEmployeeNum(int employeeNum) {
        
        if (employeeNum > 0)
            this.employeeNum = employeeNum;
        
        else 
            throw new IllegalArgumentException("Employee number must be greater than 0");
    }
    
    @Override
    public String toString() {
      
        return String.format("%s %s", firstName, lastName);
        
    }
    
    // gets the instructors year born
    public int getYearBorn() {
        return birthday.getYear();
        
    }
    
    // gets instructors age in years 
    public int getAgeInYears() {
        
        int age = Period.between
                        (birthday, LocalDate.now()).getYears();
        return age;
        
    }
    
    // gets the years in college
    public int getYearsAtCollege(){
        
        int year = Period.between(hireDate, LocalDate.now()).getYears();
        return year;

    }
    
    /*•	This method accepts a course code as a String and adds it to the list of
    teachable subjects in UPPERCASE.  If the course code is empty, 
    it should throw an IllegalArgumentException.
    */
    public void addCourseToAbilities(String courseCode) {
        
        if (courseCode.isEmpty())
            throw new IllegalArgumentException("Need to input course code");
        else
            courseCodes.add(courseCode.toUpperCase());
    
    }
    
    
    // checks to see if the teacher can teach the course
    public boolean canTeach(final String code) {
        
        return this.courseCodes.contains(code);
        
    }
    
    // this method returns a string of course codes 
    public String listOfSubjectsCertifiedToTeach (){
        return String.join(", ", courseCodes);
        
    }

   
} //public class Instructor
