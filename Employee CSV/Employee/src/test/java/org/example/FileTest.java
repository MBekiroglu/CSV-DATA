package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileTest {
    File file;

    @BeforeEach
    void init() {
        file = new File();
    }

    @Test
    void testThatFileIsRead() {
        file.read("src/resources/dummyData.csv");
        String expected = "Emp ID,Name Prefix,First Name,Middle Initial,Last Name,Gender,E Mail,Date of Birth,Date of Joining,Salary" +
                "198429,Mrs.,Serafina,I,Bumgarner,F,serafina.bumgarner@exxonmobil.com,9/21/1982,2/1/2008,69294" +
                "178566,Mrs.,Juliette,M,Rojo,F,juliette.rojo@yahoo.co.uk,5/8/1967,6/4/2011,193912";
        assertEquals(expected, file.getContents());
    }

    @Test
    void testFileIsSuccessfullyReadMessage() {
        assertEquals("File successfully read!", file.read("src/resources/dummyData.csv"));
    }

    @Test
    void testEmptyFileMessage() {
        assertEquals("You have provided an empty file. Please try again", file.read("src/resources/emptyFile.csv"));
    }

    @Test
    void testEmptyFileIsEmpty() {
        file.read("src/resources/emptyFile.csv");
        assertEquals("", file.getContents());
    }
}
