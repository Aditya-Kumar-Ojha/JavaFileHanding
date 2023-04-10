package JavaFileHandling;
import java.io.File;
public class getFileInfo {
	public static void main(String [] args) {
		File myObj=new File("C:\\Users\\akojha\\Desktop\\New folder\\AdityaOjhaDetails.txt");
		if(myObj.exists()) {
			System.out.println("File name: "+ myObj.getName());
			System.out.println("Absolute path :"+ myObj.getAbsolutePath());
			System.out.println("Writeable :"+myObj.canWrite());
			System.out.println("readable :"+myObj.canRead());
			System.out.println("File size in bytes :"+myObj.length());
		}else {
			System.out.println("The file does not exist.");
		}
	}

}
