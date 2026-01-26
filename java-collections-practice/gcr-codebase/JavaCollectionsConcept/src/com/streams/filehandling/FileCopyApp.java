package com.streams.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Program to read from one text file and write into another file
public class FileCopyApp {

	public static void main(String[] args) {

		String sourceFile = "src\\com\\streams\\filehandling\\source.txt";
		String destinationFile = "src\\com\\streams\\filehandling\\destination.txt";

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			// Open source file
			fis = new FileInputStream(sourceFile);

			// Create destination file if it does not exist
			fos = new FileOutputStream(destinationFile);

			int data;

			// Read byte by byte and write to destination
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}

			System.out.println("File copied successfully.");

		} catch (IOException e) {
			System.out.println("Source file does not exist or an error occurred.");
			System.out.println(e.getMessage());

		} finally {
			// Close file streams
			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				System.out.println("Error while closing file streams.");
			}
		}
	}
}