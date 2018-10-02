import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Files {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream in=null;
		FileOutputStream out=null;
		Byte byteRead;
		try{
			in=new FileInputStream("general.txt");
			out=new FileOutputStream("Pattern.txt");
			do{
				byteRead=(byte)in.read();
				out.write(byteRead);
			}while((byteRead)!=-1);
			{
				in.close();
				out.close();
			}
		}
			catch(FileNotFoundException e)
			{
				System.out.println("file not found");
			}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
			
		
	
		}
	}



	


