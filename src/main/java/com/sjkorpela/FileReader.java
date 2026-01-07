package com.sjkorpela;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    public static String readFile(File target) throws FileNotFoundException {
        if (!target.exists()) { throw new FileNotFoundException(); }
        if (target.length() == 0) { return ""; }

        Scanner reader = new Scanner(target);

        // going line by line loses newlines

        // by changing the delimiter to file start aka \\A,
        // the whole file is now the next token
        // so next() returns the whole file

        return reader.useDelimiter("\\A").next();

//        StringBuilder data = new StringBuilder();
//        while (reader.hasNextLine()) {
//            data.append(reader.nextLine());
//        }
//        return data.toString();
    }
}
