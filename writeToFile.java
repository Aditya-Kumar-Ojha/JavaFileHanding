package JavaFileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class writeToFile {
	public static void main(String []args) {
		try {
			FileWriter myWrite=new FileWriter("C:\\Users\\akojha\\Desktop\\New folder\\AdityaOjhaDetails.txt");
			myWrite.write("Hi Aditya Ojha Creating Files in jave might be tricky,but it is fun enough!");
//			System.out.println(" ");
			myWrite.write("Hi Aditya Ojha Creating Files in jave might be tricky,but it is fun enough!, here we are checking if data is inserting in next line or not");
			myWrite.close();
			System.out.println("Successfully written to the file.");
		}catch(IOException e) {
			System.out.println("An error occured while writing into the file.");
			e.printStackTrace();
		}
	}
}
