package com.employeerecords.filemanager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
	public static final String filePath = "C:/Users/Chekw/Documents/employeerecords.txt";
	
	public static void createFile() {
		try {
			File file = new File(filePath);
			if(file.createNewFile()) {
				System.out.println("File created: " + file.getName());
			}
			else {
				System.out.println("File already exits");
			}
		} catch(IOException e) {
			System.out.println("An error occured while creating file");
			e.printStackTrace();
		}
		
	}
	public static void writeToFile(String data) {
		try {
			FileWriter fileWriter = new FileWriter(filePath);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			bufferedWriter.write(data);
			bufferedWriter.close();
			System.out.println("Data written to the file");
			
			
		} catch(IOException e) {
			System.out.println("An error occured while writing to file");
			e.printStackTrace();
		}
		
	}
}
