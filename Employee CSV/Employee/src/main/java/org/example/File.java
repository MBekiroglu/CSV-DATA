package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.example.DataCollector.cleanData;
import static org.example.DataCollector.corruptData;


public class File {
    String fileContents = "";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");

    public String read(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                fileContents += line;
                String[] array = line.split(",");

                for (String element : array) {
                    element.trim();
                }

                if (cleanData.containsKey(array[0])) {
                    Employee corruptEmployee = new Employee(array[0], array[1], array[2], array[3].charAt(0), array[4], array[5].charAt(0), array[6], LocalDate.parse(array[7], formatter), LocalDate.parse(array[8], formatter), Integer.parseInt(array[9]));
                    corruptData.add(corruptEmployee);
                    corruptData.add(cleanData.get(array[0]));
                    cleanData.remove(array[0]);
                } else {
                    Employee employee = new Employee(array[0], array[1], array[2], array[3].charAt(0), array[4], array[5].charAt(0), array[6], LocalDate.parse(array[7], formatter), LocalDate.parse(array[8], formatter), Integer.parseInt(array[9]));
                    cleanData.put(employee.getId(),employee);
                }
            }

            if (getContents().isEmpty()) {
                return "You have provided an empty file. Please try again";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "File successfully read!";
    }

    public String getContents() {
        return fileContents;
    }
}
