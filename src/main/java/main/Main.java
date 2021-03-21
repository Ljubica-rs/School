package main;

import student.Student;

public class Main {
    public static void main(String[] args) {
        Student graduate = new Student();
        
        graduate.setFirstName("Petar");
        graduate.setLastName("Petrovic");
        graduate.setYearOfBirth(1990);
        
        graduate.getCourse().setName("QA");
        graduate.getCourse().setNumberOfClasses(60);
        
        graduate.getComputer().setProcessTact(4.0);
        graduate.getComputer().setMemory(16.0);
        graduate.getComputer().setHardDrive(2000);
        
        graduate.printInfo();
    }
}
