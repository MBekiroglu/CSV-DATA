package org.example;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;

public class Employee {
    public final String id;
    public String namePrefix;
    public String firstName;
    public char middleInitial;
    public String lastName;
    public char gender;
    public String email;
    public final LocalDate dateOfBirth;
    public final LocalDate dateOfJoining;
    public int salary;
    //HashMap<String,Employee> employee;


    public Employee(String id, String namePrefix, String firstName, char middleInitial, String lastName, char gender, String email, LocalDate dateOfBirth, LocalDate dateOfJoining, int salary) {
        this.id = id;
        this.namePrefix = namePrefix;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.dateOfJoining = dateOfJoining;
        this.salary = salary;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public String getFirstName() {
        return firstName;
    }

    public char getMiddleInitial() {
        return middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public int getSalary() {
        return salary;
    }

    public String getId() {
        return id;

    }


}
