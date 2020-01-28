package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

import static org.example.DataCollector.cleanData;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class EmployeeTest {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/dd/yyyy");
    public Employee employee;
    DataCollector dataCollector = new DataCollector();


    @BeforeEach
    public void createEmployee() {
        employee = new Employee("1", "Mr.",
                "Mehmet",
                'm', "Bekiroglu",
                'M', "mb@email",
                LocalDate.parse("1/21/1998", formatter),
                LocalDate.parse("1/03/2009", formatter),
                23000);
        cleanData.put(employee.getId(),employee);

    }

    @Test
    void testEmployeeDataCanBeInsertedIntoCleanData() {
        createEmployee();
        assertEquals(cleanData.get("1"), employee);
    }

    @Test
    void testEmptyValuesHaveNoObject() {
        createEmployee();
        assertNotEquals(cleanData.get(""), employee);
    }

    @Test
    void testThatICanGetTheFirstNameOfTheObject() {
        createEmployee();
        assertEquals("Mehmet", cleanData.get("1").getFirstName());
    }

    @Test
    void testThatICanGetThemMiddleInitialOfTheObject() {
        createEmployee();
        assertEquals('m', cleanData.get("1").getMiddleInitial());
    }

    @Test
    void testThatICanGetTheGenderOfTheObject() {
        createEmployee();
        assertEquals('M', cleanData.get("1").getGender());
    }

    @Test
    void testThatICanGetTheLastNameOfTheObject() {
        createEmployee();
        assertEquals("Bekiroglu", cleanData.get("1").getLastName());
    }

    @Test
    void testThatICanGetTheEmailOfTheObject() {
        createEmployee();
        assertEquals("mb@email", cleanData.get("1").getEmail());
    }

    @Test
    void testThatICanGetTheDateOfBirthOfTheObject() {
        createEmployee();
        assertEquals(LocalDate.parse("1/21/1998", formatter), cleanData.get("1").getDateOfBirth());
    }

    @Test
    void testThatICanGetTheDateOfJoiningOfTheObject() {
        createEmployee();
        assertEquals(LocalDate.parse("1/03/2009", formatter), cleanData.get("1").getDateOfJoining());
    }

    @Test
    void testThatICanGetTheSalaryOfTheObject() {
        createEmployee();
        assertEquals(23000, cleanData.get("1").getSalary());
    }

    @Test
    void testIdIsCorrect() {
        assertEquals("1", employee.id);
    }

    @Test
    void testIfItsNotEqual() {
        assertNotEquals(3, employee.id);
    }

    @Test
    void testNamePrefixIsMr() {
        assertEquals("Mr.", employee.namePrefix);
    }

    @Test
    void testIdIfItsNotEqual() {
        assertNotEquals("Mrs.", employee.namePrefix);
    }

    @Test
    void testFirstNameIsMehmet() {
        assertEquals("Mehmet", employee.firstName);
    }

    @Test
    void testMiddleNameIsM() {
        assertEquals('m', employee.middleInitial);
    }

    @Test
    void testLastNameIsBekiroglu() {
        assertEquals("Bekiroglu", employee.lastName);
    }

    @Test
    void testGenderIsM() {
        assertEquals('M', employee.gender);
    }

    @Test
    void testEmailIsMBEmail() {
        assertEquals("mb@email", employee.email);
    }

    @Test
    void testDateOfBirthIs7211998() {
        assertEquals(LocalDate.parse("1/21/1998", formatter), employee.dateOfBirth);
    }

    @Test
    void testStartDateIs1032009() {
        assertEquals(LocalDate.parse("1/03/2009", formatter), employee.dateOfJoining);
    }

    @Test
    void testSalary() {
        assertEquals((23000), employee.salary);
    }
}
