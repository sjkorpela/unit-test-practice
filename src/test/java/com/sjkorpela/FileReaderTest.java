package com.sjkorpela;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FileReaderTest {

    @Test
    public void ShouldReadOneLine() throws FileNotFoundException {
        String shouldRead = "This file has one line of text.";
        assertEquals(shouldRead, FileReader.readFile(new File("resources/oneline.txt")));
    }

    @Test
    public void ShouldReadManyLines() throws FileNotFoundException {
        String shouldRead = "This file has many lines of text.\n" +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
                "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n" +
                "Ut enim ad minim veniam.\n" +
                "Uis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.\n";
        assertEquals(shouldRead, FileReader.readFile(new File("resources/manylines.txt")));
    }

    @Test
    public void ShouldReadEmptyFile() throws FileNotFoundException {
        String shouldRead = "";
        assertEquals(shouldRead, FileReader.readFile(new File("resources/emptyfile.txt")));
    }

    @Test
    public void ShouldThrowError() {
        assertThrows(FileNotFoundException.class, () -> {
            FileReader.readFile(new File("not a real file"));
        });
    }
}
