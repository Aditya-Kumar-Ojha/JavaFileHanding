package JavaFileHandling;

import java.io.File;

public class DeleteFolder {
	public static void main (String [] args) {
		File myObj=new File("C:\\users\\akojha\\desktop\\New Folder\\AdityaKumar");
		if(myObj.delete()) {
			
		System.out.println("Folder has been delete Successfully :"+ myObj.getName());
		}else {
			System.out.println("Failed to delete the folder.");
		}
	}

}
