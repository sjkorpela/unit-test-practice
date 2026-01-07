package com.sjkorpela;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InterruptedException {

        // App
        System.out.println("Hello World!");
        System.out.println();

        // Calculator
        float a = 3;
        float b = 4;
        System.out.println(a + " + " + b + " = " + Calculator.add(a, b));
        System.out.println();

        // FileReader
        File readerFile = new File("resources/filereader-test.txt");
        try {
            System.out.println(readerFile.getName() + ":\n" + FileReader.readFile(readerFile));
        } catch (FileNotFoundException e) {
            System.out.println("File \"" + readerFile.getName() + "\" not found at: " + readerFile.getAbsolutePath());
        }
        System.out.println();

        // MyFileWriter
        File writerFile = new File("resources/filewriter-test.txt");
        String fileContent = "This file was edited at " + new Date() + "!";
        try {
            FileWriter.writeToFile(writerFile, fileContent);
            System.out.println(writerFile.getName() + ":\n" + FileReader.readFile(writerFile));
            System.out.println();
            Thread.sleep(3000);
            fileContent = "\nAnd also at " + new Date() + "!";
            FileWriter.appendToFile(writerFile, fileContent);
            System.out.println(writerFile.getName() + ":\n" + FileReader.readFile(writerFile));
        } catch (FileNotFoundException e) {
            System.out.println("File \"" + writerFile.getName() + "\" not found at: " + writerFile.getAbsolutePath());
        } catch (RuntimeException e) {
            System.out.println("Something went wrong trying to write to file...");
            e.printStackTrace();
        }
        System.out.println();

    }
}
