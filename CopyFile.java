import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) 
	{
		File f1 = new File("C:/Users/Inspiron-3543/Desktop/MyJava/Filehandling/abc.txt");
		File f2 = new File("C:/Users/Inspiron-3543/Desktop/MyJava/Filehandling/xyz.txt");
		try
		{
			FileInputStream fin = new FileInputStream(f1);
			FileOutputStream fout = new FileOutputStream(f2);
			int i;
			i = fin.read();
			while( i != -1)
			{
				fout.write((char)i);
				i = fin.read();
			}
			fin.close();
			fout.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		try
		{
			FileInputStream fin = new FileInputStream(f2);
			int i;
			i = fin.read();
			System.out.println("Contents in 2nd file is :");
			while( i != -1)
			{
				System.out.print((char)i + " ");
				i = fin.read();
			}
			fin.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}

}