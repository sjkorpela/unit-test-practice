package com.sjkorpela;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileWriter {

    public static void writeToFile(File target, String content) throws FileNotFoundException {

        if (!target.exists()) { throw new FileNotFoundException(); }

        try {
            java.io.FileWriter writer = new java.io.FileWriter(target);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void appendToFile(File target, String content) throws FileNotFoundException {

        if (!target.exists()) { throw new FileNotFoundException(); }

        try {
            java.io.FileWriter writer = new java.io.FileWriter(target, true);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
