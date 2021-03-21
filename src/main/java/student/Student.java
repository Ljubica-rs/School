package student;

import course.Course;
import computer.Computer;

public class Student {
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Course course;
    private Computer computer;
    
    public Course getCourse(){
        return this.course;}
     
    public Computer getComputer(){
        return this.computer;}
    
    
    public Student (){
        this.firstName = "Petar";
        this.lastName = "Petrovic";
        this.yearOfBirth = 1990;
        this.course = new Course();
        this.computer = new Computer();
    }
    
    public Student(String firstName, String lastName, int yearOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }
    
    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    } 
    
    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }
    
    public void setYearOfBirth(int newYearOfBirth){
        this.yearOfBirth = newYearOfBirth;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public int getYearOfBirth(){
        return this.yearOfBirth;
    }
    
    public void printInfo() {
        System.out.println("First name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Year of birth: " + this.yearOfBirth);
        System.out.println("Course name:" + this.course.getName());
        System.out.println("Course number of classes:" + this.course.getNumbeOfClasses());
        System.out.println("Process tact:" + this.computer.getProcessTact());
        System.out.println("Memory:" + this.computer.getMemory());
        System.out.println("Hard Drive:" + this.computer.getHardDrive());
        System.out.println(" ");
    }
}
