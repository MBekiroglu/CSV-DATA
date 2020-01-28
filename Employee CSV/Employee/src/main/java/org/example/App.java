package org.example;

import static org.example.DataCollector.cleanData;

public class App {
    public static void main(String[] args) {
        File file = new File();
        file.read("src/resources/EmployeeRecords.csv");
        File file2 = new File();
        //file.read("src/resources/EmployeeRecordsLarge.csv");

        System.out.println("ID: " + cleanData.get("207808").getId() + "\n" +
                "Name: " + cleanData.get("207808").getNamePrefix() + cleanData.get("207808").getFirstName() + " " +
                cleanData.get("207808").getMiddleInitial() + " " + cleanData.get("207808").getLastName() + "\n" +
                "Email: " + cleanData.get("207808").getEmail() + "\n" +
                "Date of Birth: " + cleanData.get("207808").getDateOfBirth() + "\n" +
                "Date of Joining: " + cleanData.get("207808").getDateOfJoining() + "\n" +
                "Salary: " + cleanData.get("207808").getSalary());
    }
}
