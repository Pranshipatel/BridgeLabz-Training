package com.searching;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderQue {
    public static void main(String[] args) {

        String filePath = "sample.txt"; // replace with your file path

        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close(); // closes both BufferedReader and FileReader
        } 
        catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
