package com.sjkorpela;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FileWriterTest {

    @Test
    public void ShouldWrite() throws IOException {
        File testFile = new File("resources/junit-test-file.txt");

        String fileContent = "FileWriter.writeToFile tested at " + new Date() + ".";

        FileWriter.writeToFile(testFile, fileContent);
        assertEquals(fileContent, FileReader.readFile(testFile));
    }

    @Test
    public void ShouldAppend() throws IOException {
        File testFile = new File("resources/junit-test-file.txt");

        String newFileContent = "\nFileWriter.appendToFile tested at " + new Date() + ".";

        String oldFileContent = FileReader.readFile(testFile);
        FileWriter.appendToFile(testFile, newFileContent);
        assertEquals(oldFileContent + newFileContent, FileReader.readFile(testFile));
    }

    @Test
    public void ShouldThrowError() {
        assertThrows(FileNotFoundException.class, () -> {
            FileWriter.writeToFile(new File("not a real file"), "foobar");
        });
    }
}
