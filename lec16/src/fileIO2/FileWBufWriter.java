import java.io.*;

public class FileWBufWriter
{
	public static void main(String args[])
	{
	try
	{
		BufferedWriter out = new BufferedWriter(new FileWriter("NewDevFile.txt"));
		out.write("Welcome to mumbai.");
		out.close();
		System.out.println("File Created");
	}
	catch(IOException e)	
	{}
	}

}