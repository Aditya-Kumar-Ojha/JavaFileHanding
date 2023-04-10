package JavaFileHandling;
import java.io.File;
public class deleteFile {
	
	public static void main(String []args) {
		
	File myObj=new File("C:\\Users\\akojha\\Desktop\\New folder\\AdityaOjhaDetails.txt");
	if(myObj.delete())
	{
		System.out.println("File has been deleted successfully !!");
	}
	else{
		System.out.println("File doesn't Exist !!");
	}
	
	}

}

	

