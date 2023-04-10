package JavaFileHandling;

import java.io.File; //Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class readFile {
	public static void main(String[] args) {
		try {
			File myObj=new File("C:\\Users\\akojha\\Desktop\\New folder\\AdityaOjhaDetails.txt");
			Scanner myReading=new Scanner(myObj);
			while(myReading.hasNextLine()) {
				String data=myReading.nextLine();
				System.out.println(data);
			}
			myReading.close();
		}catch(FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}