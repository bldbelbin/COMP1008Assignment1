/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbelbinassignment1;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;


public class Course {

    private Student student;
    private Instructor instructor;
    private String courseName, courseCode, room;
    private int maxNumberOfStudents;
    private final ArrayList <Student> students = new ArrayList<>();

    public Course (Instructor instructor, String courseCode, String courseName,
            String room, int maxNumberOfStudents) {
        
        
        setCourseCode(courseCode);
        setCourseName(courseName);
        setRoom(room);
        setMaxNumberOfStudents(maxNumberOfStudents);
        setInstructor(instructor);

    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
      if (instructor.canTeach(courseCode)) {
            this.instructor = instructor;
      } else 
      throw new IllegalArgumentException("Instructor Cannot teach this Course");
    }

    public String getCourseCode() {
        return courseCode;
    }
    

    public void setCourseCode(String courseCode) {
        if (courseCode.isEmpty())
            throw new IllegalArgumentException("Course code cannot be empty");
        else
        this.courseCode = courseCode;
    }
    

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if (courseName.isEmpty())
            throw new IllegalArgumentException("Course Name cannot be empty");
        else
        this.courseName = courseName;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        if (room.isEmpty())
            throw new IllegalArgumentException("Room number cannot be empty");
        else
            this.room = room;
    }

    public int getMaxNumberOfStudents() {
        return maxNumberOfStudents;
    }

    public void setMaxNumberOfStudents(int maxNumberOfStudents) { 
        if (maxNumberOfStudents <= 45 && maxNumberOfStudents > 0) {
            this.maxNumberOfStudents = maxNumberOfStudents;
        } else 
             throw new IllegalArgumentException("There must be more than 0  and less than 45 students");
       // }
    }
   
    public void addStudent(Student student) {
       if (student.isInGoodStanding() && maxNumberOfStudents >= students.size()) {
            this.addStudent(student);
       } else 
            throw new IllegalArgumentException("Student cannot be added");
    }
    
    public static void showClassList(ArrayList<String> students){
        for(int y=0; y < students.size(); y++) {
            System.out.printf("%s\n", y, students.get(y));
        }
    }
    
    @Override
    public String toString() {
      
        return String.format("%s %s", courseName, courseCode);
        
    } // public String toString()
    
}